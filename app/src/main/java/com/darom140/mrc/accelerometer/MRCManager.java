package com.darom140.mrc.accelerometer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

import com.darom140.mrc.accelerometer.listeners.AccelerometerListener;
import com.darom140.mrc.models.MotionEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by daniel on 30/08/16.
 */
public class MRCManager {

    public static void setMovement(Context context, long delay){

        final List<MotionEntity> movement  = new ArrayList();

        final AccelerometerListener listener = new AccelerometerListener(new OnAccelerometerCallback() {
            @Override
            public void newMotion(MotionEntity motionEntity) {
                movement.add(motionEntity);
            }
        });
        final SensorManager sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
        sensorManager.registerListener(listener, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_FASTEST);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                sensorManager.unregisterListener(listener);
                //TODO: save movement to database
            }
        }, delay);
    }
}
