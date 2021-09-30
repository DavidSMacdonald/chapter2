package com.company;

public class Box {
    // class attributes HAVE TO BE PRIVATE
    private double height;
    private double width;
    private double length;
    private String color;
    private boolean hasLid;

    // constructor for a box with all attributes passed as an argument
    public Box(double h, double w, double l, String c, boolean lid) {
        height = h;
        width  = w;
        length = l;
        color  = c;
        hasLid = lid;
    }

    /* constructors */

    // constructor for a box with only dimensions as an argument
    public Box(double h, double w, double l) {
        height = h;
        width  = w;
        length = l;
        color  = "white";
        hasLid = true;
    }

    public Box() {      // default constructor
        height = 1;
        width  = 1;
        length = 1;
        color  = "white";
        hasLid = false;
    }



    public static void main(String[] args) {
        // bruh we got a box lLl mMm aAa oOo -- first constructor --
        Box b1 = new Box(5,3,7,"red",false);

        // -- second constructor --
        Box b2 = new Box(4.5,3,6);

        // -- default constructor --
        Box b3 = new Box();
    }
}
