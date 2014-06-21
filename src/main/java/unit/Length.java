package unit;


import static unit.LengthUnit.getBaseUnit;

public class Length extends Measurement {

    Length(int value, LengthUnit unit) {
        super(value, unit);
    }

    private Length upgrade() {
        for (Unit unit : LengthUnit.valuesByDecrease()) {
            if (retrieveBaseUnitValue() % unit.getTimesOfBaseUnit() == 0) {
                return new Length(retrieveBaseUnitValue() / unit.getTimesOfBaseUnit(), (LengthUnit) unit);
            }
        }
        return this;
    }

    public Length add(Length length) {
        Length result = new Length(retrieveBaseUnitValue() + length.retrieveBaseUnitValue(),
                getBaseUnit());
        return result.upgrade();
    }

}
