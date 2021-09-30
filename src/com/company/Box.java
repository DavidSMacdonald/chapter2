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

    // accessor methods
    public void setHeight(double h) {
        if (h > 0) {
            height = h;
        }
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return height * width * length;
    }

    public String toString() {
        String s = "A box with dimension " + height + " " + width + " " + length;
        s += "\nIts color is " + color + " and it has a lid? " + hasLid;
        return s;
    }

    public static void main(String[] args) {
        // bruh we got a box lLl mMm aAa oOo -- first constructor --
        Box b1 = new Box(5,3.9,7,"red",false);
        // -- second constructor --
        Box b2 = new Box(4.5,3,6);
        // -- default constructor --
        Box b3 = new Box();

        System.out.println(b1.getHeight());
        b1.setHeight(-37);
        System.out.println(b1.getHeight());

        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());

        int x = 5;
        String name = "Betty Boop";
        System.out.println(x);
        System.out.println(name);
        System.out.println(b1);
    }
}
