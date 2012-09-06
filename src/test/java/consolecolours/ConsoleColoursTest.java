package consolecolours;

import org.junit.Test;

import consolecolours.enums.BackgroundColour;
import consolecolours.enums.Colour;
import consolecolours.enums.Weight;

/**
 * These tests don't pass or fail, but are intended for people to run to see if the colours match.
 * They work for me in bash 4.1 on CentOS 6.
 * 
 * @author calum
 */
public class ConsoleColoursTest {

    @Test
    public void Test_all() {
        for (final Weight weight : Weight.values()) {
            for (final Colour colour : Colour.values()) {
                for (final BackgroundColour background : BackgroundColour.values()) {
                    test(weight, colour, background);
                }
            }
        }
    }

    private void test(final Weight weight, final Colour colour, final BackgroundColour background) {
        System.out.println(ConsoleColours.getColouredString(
                weight.toString() + " " + colour.toString() + " on " + background.toString(),
                weight, colour, background));
    }

}
