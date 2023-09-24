public class Main {
    public static void main(String[] args) {
       WheeledTransport[] transports = new WheeledTransport[]{
               new Car("car1", 4),
               new Car("car2", 5),
               new Truck("Truck1",7),
               new Truck("Truck2",8),
               new Bicycle("Bicycle1",1),
               new Bicycle("Bicycle2",1)
       };
       for (WheeledTransport transport : transports){
           transport.check();
           System.out.println();
       }
    }
}
