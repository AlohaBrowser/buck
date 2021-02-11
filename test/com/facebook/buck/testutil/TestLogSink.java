/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.buck.testutil;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * A LogSink that buffers log messages written to a particular logger.
 *
 * <p>Uses JUnit's rule mechanism to take care of installing and removing itself as a Logger
 * handler.
 *
 * <p>Usage:
 *
 * <pre>
 *   {@code @Rule}
 *   public final logSink = new TestLogSink(ClassUnderTest.class);
 * </pre>
 */
public final class TestLogSink extends Handler implements TestRule {

  private final List<LogRecord> records = new ArrayList<>();
  private final String loggerNameUnderTest;

  /**
   * Construct a log sink that listens to log message from a particular class's logger.
   *
   * @param classUnderTest Class whose logger should be listened to
   */
  public TestLogSink(Class<?> classUnderTest) {
    this.loggerNameUnderTest = classUnderTest.getName();
  }

  /**
   * Construct a log sink that listens to log message from a particular logger.
   *
   * @param loggerNameUnderTest Logger that should be listened to
   */
  public TestLogSink(String loggerNameUnderTest) {
    this.loggerNameUnderTest = loggerNameUnderTest;
  }

  /** Retrieve the log records that were published. */
  public List<LogRecord> getRecords() {
    return records;
  }

  /**
   * Construct a hamcrest matcher that matches on the {@code LogRecord}'s message field.
   *
   * @param messageMatcher Matcher for the message.
   */
  public static Matcher<LogRecord> logRecordWithMessage(Matcher<String> messageMatcher) {
    return new FeatureMatcher<LogRecord, String>(
        messageMatcher, "a LogRecord with message", "message") {
      @Override
      protected String featureValueOf(LogRecord logRecord) {
        return logRecord.getMessage();
      }
    };
  }

  /**
   * Construct a hamcrest matcher that matches on the {@link LogRecord}'s message field and {@link
   * LogRecord}'s level.
   *
   * @param messageMatcher Matcher for the message.
   * @param expectedLevel Expected log record level.
   */
  public static Matcher<LogRecord> logRecordWithMessageAndLevel(
      Matcher<String> messageMatcher, Level expectedLevel) {
    return new FeatureMatcher<LogRecord, String>(
        messageMatcher,
        "a LogRecord with message and level=" + expectedLevel,
        "message_and_expected_level_" + expectedLevel) {
      @Override
      protected String featureValueOf(LogRecord logRecord) {
        if (!logRecord.getLevel().equals(expectedLevel)) {
          return "";
        }

        return logRecord.getMessage();
      }
    };
  }

  @Override
  public Statement apply(Statement base, Description description) {
    return new Statement() {
      @Override
      public void evaluate() throws Throwable {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(loggerNameUnderTest);
        logger.addHandler(TestLogSink.this);
        try {
          base.evaluate();
        } finally {
          logger.removeHandler(TestLogSink.this);
        }
      }
    };
  }

  @Override
  public void publish(LogRecord record) {
    records.add(record);
  }

  @Override
  public void flush() {}

  @Override
  public void close() throws SecurityException {}
}
