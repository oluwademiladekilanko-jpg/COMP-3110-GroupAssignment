package lhdiff;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/** Small helper for reading a text file into a list of lines. */
public class FileReaderUtil {

    /**
     * Reads every line of the file at the given path.
     * Index 0 of the returned list is line 1 of the file.
     */
    public static List<String> readLines(String path) throws IOException {
        return Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);
    }
}
