public abstract class AirConditioner {
    private String type;
    public static double targetTemp;

    public AirConditioner(String type, double targetTemp) {
        this.type = type;
        this.targetTemp = targetTemp;
    }

    public  double getTargetTemp() {
        return targetTemp;
    }

    public static double tempRoomAfterChange(Room room) {
        if (room.getActualTemperature() < targetTemp){
            return room.getActualTemperature() -1;
        }
        return room.getActualTemperature();
    }


    public String printInfo(){
        return "Typ klimatyzatora: " + type + ", docelowa temperatura: " + targetTemp;
    }

}
