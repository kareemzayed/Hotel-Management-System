package hotel_management_system;

import java.sql.*;

public class CreateResident extends ResidentBuilder{

    
    @Override
    public void buildName(String name) {
        resident.setName(name);
    }

    @Override
    public void buildPhone(String phone) {
        resident.setPhone(phone);
    }

    @Override
    public void buildAddress(String address) {
        resident.setAddress(address);
    }

    @Override
    public void buildAge(int age) {
        resident.setAge(age);
    }

    @Override
    public void buildIdNumber(String id_number) {
        resident.setIdentification_number(id_number);
    }

    @Override
    public void buildDuration(int duration) {
        resident.setDuration(duration);
    }

    @Override
    public void buildCost(int cost) {
        resident.setCost(cost);
    }

    @Override
    public void buildRoomId(int room_id) {
        resident.setRoom_id(room_id);
    }

    @Override
    public void buildBoardingId(int boarding_id) {
        resident.setBoarding_id(boarding_id);
    }
    
    @Override
    public void buildDateNow() {
        resident.setCreated_at();
    }

    @Override
    public boolean createResidentOnDB() {
        try {
            // TODO code application logic here
            Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "");
            String sql = "INSERT INTO resident(name, phone, address, age, identification_number, duration, cost, room_id, boarding_id, created_at) VALUES(?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pst = Conn.prepareStatement(sql);
            pst.setString(1, resident.getName());
            pst.setString(2, resident.getPhone());
            pst.setString(3, resident.getAddress());
            pst.setInt(4, resident.getAge());
            pst.setString(5, resident.getIdentification_number());
            pst.setInt(6, resident.getDuration());
            pst.setInt(7, resident.getCost());
            pst.setInt(8, resident.getRoom_id());
            pst.setInt(9, resident.getBoarding_id());
            pst.setString(10, resident.getDateNow());
            pst.executeUpdate();
            Conn.close();
            return true;
            
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public void updateResirvedRoom(int room_id) {
        try {
            // TODO code application logic here
            Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "");
            String sql2 = "UPDATE room SET is_available=? where id=?";
            PreparedStatement pst2 = Conn.prepareStatement(sql2);
            
            pst2.setInt(1, 0);
            pst2.setInt(2, room_id);
            pst2.executeUpdate();
            
            Conn.close();
            
        } catch (SQLException ex) {
        }
    }
        
}
