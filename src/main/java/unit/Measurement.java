package unit;

import static unit.LengthUnit.getBaseUnit;

abstract class  Measurement {
    protected final int value;
    protected final Unit unit;

    Measurement(int value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement measurement = (Measurement) o;

        if (retrieveBaseUnitValue() != measurement.retrieveBaseUnitValue()) return false;

        return true;
    }

    @Override
    public  int hashCode() {
        return value;
    }

    protected int retrieveBaseUnitValue() {
        return value * unit.getTimesOfBaseUnit();
    }

    Unit getUnit() {
        return unit;
    }

}
