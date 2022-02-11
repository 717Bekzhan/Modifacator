package com.company.people;

import java.awt.geom.Area;

public class Circle {
     final public double radius=4;
     final void area(){
        System.out.println(Math.PI*radius*radius);
    }

    final  void circumference(){
        System.out.println(Math.PI*2*radius);
    }
}
