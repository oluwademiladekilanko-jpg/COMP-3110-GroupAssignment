package lhdiff;

/**
 * Maps one line of the old file to one line of the new file.
 * Line numbers start at 1. A newLine of -1 means the old line was deleted.
 */
public class LineMapping {
    private final int oldLine;
    private final int newLine;

    public LineMapping(int oldLine, int newLine) {
        this.oldLine = oldLine;
        this.newLine = newLine;
    }

    public int getOldLine() {
        return oldLine;
    }

    public int getNewLine() {
        return newLine;
    }

    @Override
    public String toString() {
        return oldLine + "-" + newLine;
    }
}
