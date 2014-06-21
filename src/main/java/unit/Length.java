package unit;

public class Length {
    private final int value;
    private final LengthUnit unit;

    public Length(int value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length mile = (Length) o;

        if (value != mile.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
