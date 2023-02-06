package hotel_management_system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Resident {
    private String name;
    private String phone;
    private String address;
    private int age;
    private String identification_number;
    private int duration;
    private int cost;
    private int room_id;
    private int boarding_id;
    private String created_at;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdentification_number(String identification_number) {
        this.identification_number = identification_number;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public void setBoarding_id(int boarding_id) {
        this.boarding_id = boarding_id;
    }
    
    public void setCreated_at() {
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        this.created_at = (dft.format(now));
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getIdentification_number() {
        return identification_number;
    }

    public int getDuration() {
        return duration;
    }

    public int getCost() {
        return cost;
    }

    public int getRoom_id() {
        return room_id;
    }

    public int getBoarding_id() {
        return boarding_id;
    }

    public String getDateNow() {
        return created_at;
    }
}
