import java.nio.charset.StandardCharsets;
      InputStreamReader diffFileReader =
          new InputStreamReader(diffFileStream, StandardCharsets.UTF_8);
      // The output message from FB hg is a bit more than that from open source hg, use contains
      // here.
      assertThat(String.join("\n", expectedValue), Matchers.containsString(actualDiff));
    List<String> lines = Files.readLines(bookmarksFile.toFile(), StandardCharsets.UTF_8);