package com.company.people;

import java.awt.geom.Area;

public class Circle {
     static public double radius=4;
    public static void area(){

        System.out.println(Math.PI*radius*radius);
    }
    public static void circumference(){
        System.out.println(Math.PI*2*radius);
    }
}
