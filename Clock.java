package com.company;

public class Clock {
    private int alarmHours;
    private int alarmMins;

    public Clock() {
    }

    ;


    /* public String getTime() {

         String time = "Current time:" +java.time.LocalTime.now().toString().substring(0,8);
         return time;
     } */
    public void setAlarm(int alarmHours,int alarmMins){
        this.alarmHours = alarmHours;
        this.alarmMins = alarmMins;


    }

    public String getTime() {
        int currentH = Integer.parseInt(getHours());
        int currentM = Integer.parseInt(getMinutes());
        if(currentH >= alarmHours && currentM > alarmMins){
            System.out.println("\u23F0");
            setAlarm(25,0);

        }
        String time = getHours() + " " + getMinutes();
        return time;
    }

    public String getHours() {

        String hours = java.time.LocalTime.now().toString().substring(0, 2);
        return hours;
    }

    public String getMinutes() {

        String minutes = java.time.LocalTime.now().toString().substring(3, 5);
        return minutes;
    }

}

class WorldClock extends Clock {

    int timeOffset;

    public WorldClock(int timeOffset) {
        this.timeOffset = timeOffset;

    }


    public String getHours() {
        int timeSumm = timeOffset + Integer.parseInt(super.getHours());
        if(timeSumm<=24){
        String worldHours = String.valueOf(timeSumm);
        return worldHours;
    }
        else {
        int h = timeSumm - 24;
        return String.valueOf(h);
        }

    }


    public String getTime() {
        String worldTime = getHours() + " " + super.getMinutes();
        return worldTime;
    }
}




