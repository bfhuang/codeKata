package unit;

/**
 * Created by twer on 6/21/14.
 */
public enum LengthUnit {
    FEET(1),
    YARD(1*3),
    MILE(1760*3);
    private int timesOfBaseUnit;

    LengthUnit(int timesOfBaseUnit) {
        this.timesOfBaseUnit = timesOfBaseUnit;
    }

    public int getTimesOfBaseUnit() {
        return timesOfBaseUnit;
    }
}
