package the_data;

import java.util.Objects;

public class myNumber {
    int theNumber;

    public myNumber() {
        this.theNumber = 0;
    }

    public int getTheNumber() {
        return theNumber;
    }

    @Override
    public String toString() {
        return "myNumber{" +
                "theNumber=" + theNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof myNumber)) return false;
        myNumber myNumber = (myNumber) o;
        return getTheNumber() == myNumber.getTheNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTheNumber());
    }
}
