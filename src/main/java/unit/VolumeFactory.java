package unit;

import static unit.VolumeUnit.OZ;
import static unit.VolumeUnit.TBSP;
import static unit.VolumeUnit.TSP;

public class VolumeFactory {


    public static Volume oz(int value) {
        return new Volume(value, OZ);
    }

    public static Volume tbsp(int value) {
        return new Volume(value, TBSP);
    }

    public static Volume tsp(int value) {
        return new Volume(value, TSP);
    }
}
