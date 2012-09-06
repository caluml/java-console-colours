package consolecolours;

import consolecolours.enums.BackgroundColour;
import consolecolours.enums.Colour;
import consolecolours.enums.Weight;

public class ConsoleColours {

    public static final char escape = (char) 27;

    private ConsoleColours() {
        // To prevent instantiation
    }

    /**
     * Returns the given text in a format that when output in a bash shell, will display with the
     * specified weight, text colour, and background colour
     * 
     * @param text
     * @param weight
     * @param colour
     * @param backgroundColour
     * @return
     */
    public static String getColouredString(final String text, final Weight weight,
            final Colour colour, final BackgroundColour backgroundColour) {
        final StringBuilder ret = new StringBuilder();
        ret.append(escape);
        ret.append("[");
        ret.append(weight.getValue());
        ret.append(";");
        ret.append(colour.getValue());
        ret.append(";");
        ret.append(backgroundColour.getValue());
        ret.append("m");
        ret.append(text);
        ret.append(escape);
        ret.append("[0;39m");

        return ret.toString();
    }
}
