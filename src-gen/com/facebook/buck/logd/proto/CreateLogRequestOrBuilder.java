// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/facebook/buck/logd/proto/logdservice.proto

package com.facebook.buck.logd.proto;

@javax.annotation.Generated(value="protoc", comments="annotations:CreateLogRequestOrBuilder.java.pb.meta")
public interface CreateLogRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logd.v1.CreateLogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * path to which log will be streamed by logD
   * </pre>
   *
   * <code>string logFilePath = 1;</code>
   */
  java.lang.String getLogFilePath();
  /**
   * <pre>
   * path to which log will be streamed by logD
   * </pre>
   *
   * <code>string logFilePath = 1;</code>
   */
  com.google.protobuf.ByteString
      getLogFilePathBytes();

  /**
   * <pre>
   * enum specifying existing types of log
   * </pre>
   *
   * <code>.logd.v1.LogType logType = 2;</code>
   */
  int getLogTypeValue();
  /**
   * <pre>
   * enum specifying existing types of log
   * </pre>
   *
   * <code>.logd.v1.LogType logType = 2;</code>
   */
  com.facebook.buck.logd.proto.LogType getLogType();

  /**
   * <pre>
   * buildId that log file is attached to
   * </pre>
   *
   * <code>string buildId = 3;</code>
   */
  java.lang.String getBuildId();
  /**
   * <pre>
   * buildId that log file is attached to
   * </pre>
   *
   * <code>string buildId = 3;</code>
   */
  com.google.protobuf.ByteString
      getBuildIdBytes();
}
