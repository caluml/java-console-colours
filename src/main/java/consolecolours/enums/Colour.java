package consolecolours.enums;

public enum Colour {
    BLACK(30), RED(31), GREEN(32), YELLOW(33), BLUE(34), PINK(35), TURQUOISE(36), LIGHTGREY(37),

    BLACK_BRIGHT(90), RED_BRIGHT(91), GREEN_BRIGHT(92), YELLOW_BRIGHT(93), BLUE_BRIGHT(94), PINK_BRIGHT(
            95), TURQUOISE_BRIGHT(96), LIGHTGREY_BRIGHT(97);

    private int value;

    Colour(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
