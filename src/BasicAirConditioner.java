public class BasicAirConditioner extends AirConditioner {
    public BasicAirConditioner(String type, double targetTemp) {
        super(type, targetTemp);
    }

    public static double tempRoomAfterChange(Room room) {
        if (room.getActualTemperature() <targetTemp){
            return room.getActualTemperature() - 1/room.getSize();
        }
        return room.getActualTemperature();
    }

}




