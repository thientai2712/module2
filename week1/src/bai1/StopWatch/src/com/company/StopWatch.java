package com.company;

import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;
    public long getElapsedTime(){
        return endTime -startTime;
    }
    public int[] ramdomArray() {
        int [] array = new int[100000];
        for (int i = 0; i<100000;i++){
            array[i]=(new Random()).nextInt(100000)+1;
        }
        return array;
    }
    public StopWatch(long startTime,long endTime ){
        this.endTime = endTime;
        this.startTime = startTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public  void  stop(){
        endTime = System.currentTimeMillis();
    }
}
