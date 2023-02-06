package hotel_management_system;
import hotel_management_system.GUI.ManagerForm;
import hotel_management_system.GUI.LoginForm;
import java.sql.*;

public class Manager implements LoginTypeInterface{
    private final String name;
    private final String username;
    private final String password;
    private static Manager instance;
    
    private Manager(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
        
    // Singlton
    public static Manager getInstance(String username, String password) {
        if(instance == null) {
            
            try {
                // TODO code application logic here
                Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "");
                String stm = "Select * from users where username =? and password=? and user_type=?";
                PreparedStatement pst = Conn.prepareStatement(stm);

                pst.setString(1, username);
                pst.setString(2, password);
                pst.setString(3, "manager");

                ResultSet rs = pst.executeQuery();
                if(rs.next()) {
                    instance = new Manager(rs.getString("name"), username, password);
                    Conn.close();
                }
            }
            
            catch (SQLException ex) {
                return null;
            }
            
        }
        return instance;
    }

    @Override
    public void getView(LoginForm log) {
        ManagerForm man = new ManagerForm();
        man.setVisible(true);
        log.setVisible(false);
    }
}