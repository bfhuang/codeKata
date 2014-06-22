package unit;

import static unit.LengthUnit.getBaseUnit;

public class PrintToBaseStrategy implements PrintStrategy {

    @Override
    public String print(Length length) {
        return length.retrieveBaseUnitValue() + " " + getBaseUnit();
    }
}
