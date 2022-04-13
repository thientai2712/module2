package bai1;

import java.text.DateFormat;
import java.util.Date;

public class dateformat {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Date hiện tại " + currentDate);
        String timetoStr = DateFormat.getTimeInstance().format(currentDate);
        System.out.println("Sử dụng getTimeInstance(): " + timetoStr);
        String datetoStr = DateFormat.getDateInstance().format(currentDate);
        System.out.println("Sử dụng getDateInstance(): " + datetoStr);
    }
}
