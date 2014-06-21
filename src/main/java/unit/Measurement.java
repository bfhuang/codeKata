package unit;

/**
 * Created by twer on 6/22/14.
 */
abstract class Measurement {
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

        Length length = (Length) o;

        if (retrieveBaseUnitLength() != retrieveBaseUnitLength()) return false;

        return true;
    }

    @Override
    public  int hashCode() {
        return value;
    }

    protected int retrieveBaseUnitLength() {
        return value * unit.getTimesOfBaseUnit();
    }

    Unit getUnit() {
        return unit;
    }

}
