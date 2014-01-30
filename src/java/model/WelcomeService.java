package model;

import java.util.Calendar;
import java.util.Date;

public class WelcomeService {
    private Calendar cal;
    
    private String checkTime(){
        Calendar morning;
        Calendar afternoon;
        Calendar night;
        String time = "";
        cal = Calendar.getInstance();
        if(cal.get(Calendar.HOUR) > 11 && cal.get(Calendar.HOUR) < 18){
            time = "afternoon";
        }else if(cal.get(Calendar.HOUR) < 12 && cal.get(Calendar.HOUR) > 5){
            time = "morning";
        }else{
            time = "night";
        }

        return time;
    }
    
    public String getGreeting(String name){
        checkTime();
        String greeting = "";
        return greeting;
    }
}
