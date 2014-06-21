package unit;

import static unit.LengthUnit.getBaseUnit;

public class Volume extends Measurement {

    Volume(int value, VolumeUnit unit) {
        super(value, unit);
    }



    private Volume upgrade() {
        for (Unit unit : VolumeUnit.valuesByDecrease()) {
            if (retrieveBaseUnitValue() % unit.getTimesOfBaseUnit() == 0) {
                return new Volume(retrieveBaseUnitValue() / unit.getTimesOfBaseUnit(), (VolumeUnit) unit);
            }
        }
        return this;
    }

    public Volume add(Volume volume) {
        Volume result = new Volume(retrieveBaseUnitValue() + volume.retrieveBaseUnitValue(),
                VolumeUnit.getBaseUnit());
        return result.upgrade();
    }

}
