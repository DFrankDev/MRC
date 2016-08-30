package com.darom140.mrc.models;

/**
 * Created by daniel on 30/08/16.
 */
public class MotionEntity {
    private double ax;
    private double ay;
    private double az;

    public MotionEntity(double ax, double ay, double az) {
        this.ax = ax;
        this.ay = ay;
        this.az = az;
    }

    public double getAx() {
        return ax;
    }

    public void setAx(double ax) {
        this.ax = ax;
    }

    public double getAy() {
        return ay;
    }

    public void setAy(double ay) {
        this.ay = ay;
    }

    public double getAz() {
        return az;
    }

    public void setAz(double az) {
        this.az = az;
    }
}
