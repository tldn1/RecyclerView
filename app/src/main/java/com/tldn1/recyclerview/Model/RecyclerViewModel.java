package com.tldn1.recyclerview.Model;

/**
 * Created by X on 12/25/2016.
 */

public class RecyclerViewModel {
    private String name;
    private String lName;

    public RecyclerViewModel(String name, String lName) {
        this.setName(name);
        this.setlName(lName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
