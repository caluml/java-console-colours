package consolecolours.enums;

public enum Weight {
    NORMAL(0), BOLD(1), FAINT(2), UNDERLINE(4), STRIKETHROUGH(9);

    private int value;

    Weight(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
