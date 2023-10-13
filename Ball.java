package com.example;

import javafx.scene.shape.Circle;

public class Ball extends Circle{
    double vx, vy;
    int weight;

    Ball (double x, double y)
    {
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius((int)(Math.random()*3)*20);
        this.weight = (int)(this.getRadius()/20);
    }

    public double getVx(){
        return this.vx;
    }

    public void setVx(double vx){
        this.vx = vx;
    }

    public double getVy(){
        return this.vy;
    }

    public void setVy(double vy){
        this.vy = vy;
    }

    public int getWeight(){
        return this.weight;
    }

    public boolean checkColision(Ball b){
        
        if((b.getCenterX()-this.getCenterX())*(b.getCenterX()-this.getCenterX())+
            (b.getCenterY()-this.getCenterY())*(b.getCenterY()-this.getCenterY())<
            (this.getRadius()+b.getRadius())*(this.getRadius()+b.getRadius()))
            return true;
        return false;
    }

    public void disableCollision(Ball b){
        double distance = Math.sqrt(b.getCenterX()-this.getCenterX())*(b.getCenterX()-this.getCenterX())+
            (b.getCenterY()-this.getCenterY())*(b.getCenterY()-this.getCenterY());
        double angle = b.getCenterX();
    }
}
