package unit;


import static unit.LengthUnit.getBaseUnit;

public class Length extends Measurement {

    Length(int value, LengthUnit unit) {
        super(value, unit);
    }

    public Length add(Length length) {
        return new Length(retrieveBaseUnitValue() + length.retrieveBaseUnitValue(),
                getBaseUnit());
    }

    public String print(PrintStrategy printStrategy) {
        return printStrategy.print(this);
    }
}
