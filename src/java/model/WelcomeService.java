package model;

import java.util.Calendar;
import java.util.Date;

public class WelcomeService {
    private Calendar cal;
    
    private String checkTime(){
        Calendar morning = Calendar.getInstance();
        Calendar afternoon = Calendar.getInstance();
        Calendar night = Calendar.getInstance();
        
        morning.set(Calendar.HOUR_OF_DAY, 5);
        afternoon.set(Calendar.HOUR_OF_DAY, 12);
        night.set(Calendar.HOUR_OF_DAY, 18);
        
        String time;
        cal = Calendar.getInstance();
        if(cal.after(night) && cal.before(afternoon)){
            time = "morning";
        }else if(cal.after(morning) && cal.before(night)){
            time = "afternoon";
        }else{
            time = "night";
        }

        return time;
    }
    
    public String getGreeting(String name){
        String greeting = "Good " + checkTime() + " " + name;
        return greeting;
    }
}
