package unit;

enum  VolumeUnit implements Unit {
    TSP(1),
    TBSP(3*TSP.getTimesOfBaseUnit()),
    OZ(2*TBSP.getTimesOfBaseUnit());



    private int timesOfBaseUnit;

    VolumeUnit(int value) {
        timesOfBaseUnit = value;
    }

    @Override
    public int getTimesOfBaseUnit() {
        return timesOfBaseUnit;
    }
}
