public abstract class AirConditioner {
    private String type;
    public  double targetTemp;

    public AirConditioner(String type, double targetTemp) {
        this.type = type;
        this.targetTemp = targetTemp;
    }

    public  double getTargetTemp() {
        return targetTemp;
    }

    public static double decreaseTemperatuere(Room room) {
        return room.getActualTemperature() -1;
    }


    public String printInfo(){
        return "Typ klimatyzatora: " + type + ", docelowa temperatura: " + targetTemp;
    }

}
