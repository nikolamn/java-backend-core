package jcore.oop.additional2.lifecycle;

public class Item {

    String name;

    Item(String name) {
        this.name = name;
        System.out.println(name + " created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected");
    }
}
