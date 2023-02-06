package hotel_management_system;

public abstract class ResidentBuilder {
    protected Resident resident = new Resident();
    
    public Resident getResident() {
        return resident;
    }
    
    public abstract void buildName(String name);
    public abstract void buildPhone(String phone);
    public abstract void buildAddress(String address);
    public abstract void buildAge(int age);
    public abstract void buildIdNumber(String id_number);
    public abstract void buildDuration(int duration);
    public abstract void buildCost(int cost);
    public abstract void buildRoomId(int room_id);
    public abstract void buildBoardingId(int boarding_id);
    public abstract void buildDateNow();
    public abstract boolean createResidentOnDB();
    public abstract void updateResirvedRoom(int room_id);
}
