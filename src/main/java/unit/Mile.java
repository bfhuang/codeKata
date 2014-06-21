package unit;

public class Mile {
    private final int value;

    public Mile(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mile mile = (Mile) o;

        if (value != mile.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
