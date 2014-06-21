package unit;

import java.util.ArrayList;
import java.util.List;

enum  VolumeUnit implements Unit {
    TSP(1),
    TBSP(3*TSP.getTimesOfBaseUnit()),
    OZ(2*TBSP.getTimesOfBaseUnit());



    private int timesOfBaseUnit;

    VolumeUnit(int value) {
        timesOfBaseUnit = value;
    }

    public static VolumeUnit getBaseUnit() {
        return TSP;
    }

    @Override
    public int getTimesOfBaseUnit() {
        return timesOfBaseUnit;
    }

    public static List<VolumeUnit> valuesByDecrease() {
        List<VolumeUnit> units = new ArrayList<VolumeUnit>();

        for (VolumeUnit unit : values()) {
            units.add(0, unit);
        }
        return units;
    }
}
