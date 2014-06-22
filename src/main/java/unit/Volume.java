package unit;

import static unit.LengthUnit.getBaseUnit;

public class Volume extends Measurement {

    Volume(int value, VolumeUnit unit) {
        super(value, unit);
    }


    public Volume add(Volume volume) {
        return new Volume(retrieveBaseUnitValue() + volume.retrieveBaseUnitValue(),
                VolumeUnit.getBaseUnit());
    }

}
