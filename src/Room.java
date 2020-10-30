public class Room {
    private String name;
    private double actualTemperature;
    private boolean conditioner;
    private double size;

    public Room(String name, double actualTemperature, boolean conditioner, double size) {
        this.name = name;
        this.actualTemperature = actualTemperature;
        this.conditioner = conditioner;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public double getSize() {
        return size;
    }

    public String printInfo(){
        return name + ", aktualna temp " +  actualTemperature
                + ", klimatyzacja: " + conditioner + ", rozmiar pomieszczenia: "+ size + " m3";
    }
}


