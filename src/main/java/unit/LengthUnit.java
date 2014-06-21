package unit;

/**
 * Created by twer on 6/21/14.
 */
public enum LengthUnit {
    YARD(1),
    MILE(1760);
    private int timesOfBaseUnit;

    LengthUnit(int timesOfBaseUnit) {
        this.timesOfBaseUnit = timesOfBaseUnit;
    }

    public int getTimesOfBaseUnit() {
        return timesOfBaseUnit;
    }
}
