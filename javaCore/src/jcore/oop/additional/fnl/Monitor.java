package jcore.oop.additional.fnl;

public class Monitor {

    public int inches;

    public Monitor(int inches) {
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public class TouchScreen {
        public void touch() {
            System.out.println("Touch screen touched!");
        }
    }

    // Object class methods override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Monitor)) return false;

        // explictite cast
        Monitor other = (Monitor) obj;
        return inches == other.inches;
    }
}
