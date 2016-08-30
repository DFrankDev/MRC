package com.darom140.mrc.accelerometer.listeners;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import com.darom140.mrc.accelerometer.OnAccelerometerCallback;
import com.darom140.mrc.models.MotionEntity;

/**
 * Created by daniel on 30/08/16.
 */
public class AccelerometerListener implements SensorEventListener {

    private OnAccelerometerCallback callback;

    public AccelerometerListener(OnAccelerometerCallback callback) {
        this.callback = callback;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType()== Sensor.TYPE_ACCELEROMETER){
            callback.newMotion(new MotionEntity(event.values[0], event.values[1], event.values[2]));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
