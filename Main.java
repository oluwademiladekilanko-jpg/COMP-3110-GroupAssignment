package lhdiff;

import java.io.IOException;
import java.util.List;

/** Command-line entry point: java lhdiff.Main <oldFile> <newFile> */
public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java lhdiff.Main <oldFile> <newFile>");
            System.exit(1);
        }

        try {
            List<String> oldLines = FileReaderUtil.readLines(args[0]);
            List<String> newLines = FileReaderUtil.readLines(args[1]);

            LHDiff lhdiff = new LHDiff();
            for (LineMapping m : lhdiff.map(oldLines, newLines)) {
                System.out.println(m);
            }
        } catch (IOException e) {
            System.err.println("Could not read file: " + e.getMessage());
            System.exit(1);
        }
    }
}
