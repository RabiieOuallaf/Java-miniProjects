package Timer;
import java.sql.Time;
import java.time.Year;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if(counter > 0) {
                    System.out.println(counter+" Seconds");
                    counter--;
                }else {
                    System.out.println("Happy new Minute :)");
                    timer.cancel();
                }
            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2023);
        date.set(Calendar.MONTH,Calendar.MAY);
        date.set(Calendar.DAY_OF_MONTH,25);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE, 53);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND, 0);

        timer.scheduleAtFixedRate(task, date.getTime() ,1000);
    }
}
