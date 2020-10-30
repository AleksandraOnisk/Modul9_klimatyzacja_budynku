public class AirConditioner {
    private String type;
    public  double targetTemp;

    public AirConditioner(String type, double targetTemp) {
        this.type = type;
        this.targetTemp = targetTemp;
    }

    public  double getTargetTemp() {
        return targetTemp;
    }

    public double decreaseTemperatuere(Room room) {
        if (room.getActualTemperature() < targetTemp) {
            return  room.getActualTemperature() - 1;
        }
        return getTargetTemp();
    }

    public String printInfo(){
        return "Typ klimatyzatora: " + type + ", docelowa temperatura: " + targetTemp;
    }

}
