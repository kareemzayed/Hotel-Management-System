package hotel_management_system;

import hotel_management_system.GUI.ReceptionistForm;
import hotel_management_system.GUI.LoginForm;
import java.sql.*;

public class Receptionist implements LoginTypeInterface{
    private final String name = "";
    private final String username = "";
    private final String password = "";
    private final String phone = "";
    private final String address = "";
    private final int age = 0;
    private final int salary = 0;
    
    public Receptionist() {
        
    }
    
    // Singlton
    public boolean CheckIfExist(String username, String password) {
        try {
            // TODO code application logic here
            Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "");
            String stm = "Select * from users where username =? and password=? and user_type=?";
            PreparedStatement pst = Conn.prepareStatement(stm);

            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, "receptionist");

            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                Conn.close();
                return true;
            }
        } 
        catch (SQLException ex) {
            return false;
        }

    return false;
    }

    @Override
    public void getView(LoginForm log) {
        ReceptionistForm rec = ReceptionistForm.getInstance();
        rec.setVisible(true);
        log.setVisible(false);
    }
}
