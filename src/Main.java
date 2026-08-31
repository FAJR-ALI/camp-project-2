public class Main {
    public static void main(String[] args) {


        // Route's obj's
        Route r1 = new Route("Riyadh", "Madred", 3067.67);
        Route r2 = new Route("Madred", "Riyadh", 9300);

        // Car's obj's
        Car c1 = new Car(1, r1, 4);
        Car c2 = new Car(2, r2, 0);
        // ============Dont forget the Exception !!!!!!!!!!!!!!!!

        // Passenger children obj's
        SubscribersPassenger subscriber = new SubscribersPassenger("Fajr", "01", null, 0);
        NonSubsecribePassenger nonSubscriber  = new NonSubsecribePassenger( "Ali", "02", null, 0, true);

        // Passenger array contain of sub-classes fo super Passenger
        Passenger [] passengers = new Passenger[2];
        passengers[0] = subscriber;
        passengers[1] = nonSubscriber;

        // the Exception will be thrown by nonSubscriber just bc the capacity of it's car is 0
        // Subscriber
        try {
            subscriber.setTripCost(subscriber.compTripCost(c1)); // will set the trip price by calling the method and execute the arithmetic operation
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Non- Subsecriber
        try {
            nonSubscriber.setTripCost(nonSubscriber.compTripCost(c2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Print the passenger Info's
        for(int i = 0 ; i < passengers.length ; i++){
            System.out.println(passengers[i]);
        }


    }
}