package com.example;

import javafx.scene.shape.Circle;

public class Ball extends Circle{
    double vx, vy;

    Ball (double x, double y)
    {
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius((int)(Math.random()*3)*20);
    }

    public boolean checkColision(Ball b){
        
        if((b.getCenterX()-this.getCenterX())*(b.getCenterX()-this.getCenterX())+
            (b.getCenterY()-this.getCenterY())*(b.getCenterY()-this.getCenterY())<
            (this.getRadius()+b.getRadius())*(this.getRadius()+b.getRadius()))
            return true;
        return false;
    }
}
