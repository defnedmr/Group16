package designpatterns16.items;

import java.util.Locale.Category;

//Represents ANY single physical or digital item
public abstract class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
