public class CarMain{
    public static void main(String[] args){
    //     Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8); // creates a new Car object
    // oldJunker.drive(5); // drives the Car 5 miles
    // oldJunker.fillTank(1); // put in a gallon of gas
    // System.out.println(oldJunker.getFuelRemaining()); // prints the amount of fuel left
    // System.out.println(oldJunker); // prints the attributes of the car to the screen
    Car Toyota = new Car("Toyota", "Prius", 2022, 58, 10, 11, 9);
    Car Porsche = new Car("Porsche", "Cayenne", 2022, 19, 10, 23, 20);
    Car Mach5 = new Car("Mach5", "SPEEDRACR", 2072, 500, 300, 8, 8);
    Car[] ArrayOfCars = { Toyota, Porsche, Mach5};
    // this for loop can access each element of the array
    for (Car Thing: ArrayOfCars){
        System.out.println(Thing);
        Thing.drive(5);
        Thing.fillTank(1);
        System.out.println(Thing);
    }
}  
}
