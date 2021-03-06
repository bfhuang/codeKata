package unit;

import static unit.LengthUnit.FEET;
import static unit.LengthUnit.MILE;
import static unit.LengthUnit.YARD;

public class LengthFactory {

    public static Length mile(int value) {
        return new Length(value, MILE);
    }

    public static Length yard(int value) {
        return new Length(value, YARD);
    }

    public static Length feet(int value) {
        return new Length(value, FEET);
    }

}
