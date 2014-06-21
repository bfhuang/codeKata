package unit;

import static unit.LengthUnit.getBaseUnit;

public class Length {
    private final int value;
    private final LengthUnit unit;

    Length(int value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        if (retrieveBaseUnitLength() != length.retrieveBaseUnitLength()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }

    private int retrieveBaseUnitLength() {
        return value * unit.getTimesOfBaseUnit();
    }

    LengthUnit getUnit() {
        return unit;
    }

    public Length add(Length length) {
        Length result = new Length(length.retrieveBaseUnitLength() + retrieveBaseUnitLength(), getBaseUnit());
        return result.upgrade();
    }

    private Length upgrade() {
        for (LengthUnit unit : LengthUnit.valuesByDecrease()) {
            if (retrieveBaseUnitLength() % unit.getTimesOfBaseUnit() == 0) {
                return new Length(retrieveBaseUnitLength() / unit.getTimesOfBaseUnit(), unit);
            }
        }
        return this;
    }
}
