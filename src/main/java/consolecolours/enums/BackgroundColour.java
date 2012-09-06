package consolecolours.enums;

public enum BackgroundColour {
    BLACK(40), RED(41), GREEN(42), BROWN(43), BLUE(44), PINK(45), TURQUOISE(46), LIGHTGREY(47),

    BLACK_BRIGHT(100), RED_BRIGHT(101), GREEN_BRIGHT(102), BROWN_BRIGHT(103), BLUE_BRIGHT(104), PINK_BRIGHT(
            105), TURQUOISE_BRIGHT(106), LIGHTGREY_BRIGHT(107);

    private int value;

    private BackgroundColour(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
