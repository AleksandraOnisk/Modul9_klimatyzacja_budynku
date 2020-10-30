public class BasicAirConditioner extends AirConditioner {
    public BasicAirConditioner(String type, double targetTemp) {
        super(type, targetTemp);
    }
    @Override
    public double decreaseTemperatuere(Room room) {
        if (room.getActualTemperature() < targetTemp) {
            return room.getActualTemperature() - (1/ room.getSize());
        }
        return getTargetTemp();
    }

}




