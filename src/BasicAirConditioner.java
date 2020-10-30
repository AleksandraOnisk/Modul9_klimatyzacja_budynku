public class BasicAirConditioner extends AirConditioner {
    public BasicAirConditioner(String type, double targetTemp) {
        super(type, targetTemp);
    }
    public static double decreaseTemperatuere(Room room) {
        return room.getActualTemperature() - (1 / room.getSize());
    }

}




