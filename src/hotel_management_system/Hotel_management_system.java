package hotel_management_system;

import hotel_management_system.GUI.LoginForm;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Hotel_management_system {

    public static void main(String[] args) {
        LoginForm l = new LoginForm();
        l.show();
    }
    
    public static String getCurrentDate() {
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return (dft.format(now));
    }
    
    public static String getStartDate(int minusDates) {
        LocalDate date = LocalDate.now();  
        LocalDate newDate = date.minusDays(minusDates);  
        return newDate.toString();
    }
    
}
