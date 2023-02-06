package hotel_management_system;

public class ResidentCreator {
    private ResidentBuilder resbuilder;
    
    public void setResidentBuilder(ResidentBuilder resbuilder) {
        this.resbuilder = resbuilder;
    }
    
    public Resident getResident() {
        return resbuilder.getResident();
    }
    
    public boolean constructResident(String name, String phone, String address, int age, String identification_number, int duration, int cost, int room_id, int boarding_id) {
        resbuilder.buildName(name);
        resbuilder.buildPhone(phone);
        resbuilder.buildAddress(address);
        resbuilder.buildAge(age);
        resbuilder.buildIdNumber(identification_number);
        resbuilder.buildDuration(duration);
        resbuilder.buildCost(cost);
        resbuilder.buildRoomId(room_id);
        resbuilder.buildBoardingId(boarding_id);
        resbuilder.buildDateNow();
        
        if(resbuilder.createResidentOnDB()) {
            resbuilder.updateResirvedRoom(room_id);
            return true;
        }
        return false;
    }
    
}
