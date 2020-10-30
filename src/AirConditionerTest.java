public class AirConditionerTest {
    public static void main(String[] args) {
        AirConditioner proConditioner = new ProAirConditioner("Pro", 25);
        Room room = new Room("pokój 1", 24, true, 20);
        System.out.println(room.printInfo());
        System.out.println(proConditioner.printInfo());
        System.out.println(proConditioner.decreaseTemperatuere(room));

        AirConditioner basicConditioner = new BasicAirConditioner("Basic", 25);
        Room room2 = new Room("pokój 2", 23, true, 50);
        System.out.println(room.printInfo());
        System.out.println(basicConditioner.printInfo());
        System.out.println(basicConditioner.decreaseTemperatuere(room));
    }

}
