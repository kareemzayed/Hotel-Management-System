package hotel_management_system;

public class LoginFactory{
    public LoginTypeInterface getLoginType(String type, String username, String password) {
        if(type.equalsIgnoreCase("manager")) {
            return Manager.getInstance(username, password);
        }
        else {
            Receptionist rec = new Receptionist();
            if(rec.CheckIfExist(username, password)) {
                return rec;
            }
            else {
                return null;
            }
        }
    }
}
