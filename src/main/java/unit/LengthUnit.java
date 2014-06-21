package unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twer on 6/21/14.
 */
enum LengthUnit implements Unit {
    FEET(1),
    YARD(3*FEET.timesOfBaseUnit),
    MILE(1760*YARD.timesOfBaseUnit);
    private int timesOfBaseUnit;

    LengthUnit(int timesOfBaseUnit) {
        this.timesOfBaseUnit = timesOfBaseUnit;
    }

    public int getTimesOfBaseUnit() {
        return timesOfBaseUnit;
    }

    public static LengthUnit getBaseUnit() {
        return FEET;
    }

    public static List<LengthUnit> valuesByDecrease() {
       List<LengthUnit> units = new ArrayList<LengthUnit>();

        for(LengthUnit unit:values()){
            units.add(0,unit);
        }
        return units;
    }
}
