package com.darom140.mrc.accelerometer;

import com.darom140.mrc.models.MotionEntity;

/**
 * Created by daniel on 30/08/16.
 */
public interface OnAccelerometerCallback {
    void newMotion(MotionEntity motionEntity);
}
