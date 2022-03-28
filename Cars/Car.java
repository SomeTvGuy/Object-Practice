/*
Implement a class Car, which contains the fields (5 points):

make, e.g. Ford, Subaru, Toyota ...
model, e.g., Escape, Outback, Camry ...
year
MPG miles per gallon
milesDriven, the total number of miles ever driven in this car.
fuelCapacity in gallons, i.e., the size in gallons of the fuel tank.
fuelRemaining, which represents the amount of fuel remaining in the gas tank.
Implement at least the following methods within the Car class (5 points each):

a constructor, which initializes each of the fields
fillTank(double g), which adds up to g gallons of gas to the fuel tank, but not more than the car's fuel capacity.
drive(double m), which simulates driving m miles in the car, adding to the total number of miles driven, and reducing the amount of gas in the car according to this car's average MPG.
toString( ), which returns a String representation of the car.
getFuelRemaining( ), which returns the amount of fuel left in the tank.
For example, we should be able to do something like the following:

    Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8); // creates a new Car object
    oldJunker.drive(5); // drives the Car 5 miles
    oldJunker.fillTank(1); // put in a gallon of gas
    System.out.println(oldJunker.getFuelRemaining()); // prints the amount of fuel left
    System.out.println(oldJunker); // prints the attributes of the car to the screen
Write a short driver program to test your Car class with a short array of Cars (5 points).
*/
public class Car{
    // intialize all the variables out here 
    String CarName, ModelName;
    int Year,milesDriven,fuelCapacity,fuelRemaining;
    double MilesPerGallon;
    // initializes the variables if defined
    public Car(String init_CarName,String init_ModelName,int init_year,double init_MilesPerGallon,int init_milesDriven, int init_fuelCapacity, int init_fuelRemaining){
        CarName = init_CarName;
        ModelName = init_ModelName;
        Year = init_year;
        MilesPerGallon = init_MilesPerGallon;
        milesDriven = init_milesDriven;
        fuelCapacity = init_fuelCapacity;
        fuelRemaining = init_fuelRemaining;
        if(fuelRemaining > fuelCapacity){
            fuelRemaining = fuelCapacity;
        } 
    }
    public void fillTank(double g){
        if ( (g + fuelRemaining)> fuelCapacity){
            fuelRemaining = fuelCapacity;
        }
    }
    public void drive(double m){
        // m is just a simplification of miles theoretciall, if you divide the amount of miles given in the input
        // and divide that by the miles per gallon, the result of this minus the current fuel remaining should provide
        // you the final fuel remaining,
        // first things first, add the aount of miles to the miles driven
        milesDriven += m;
        double Gas_Used= m/ MilesPerGallon;
        if ((!(fuelRemaining <=0)) && (Gas_Used >= 1) ){
            fuelRemaining -= Gas_Used;
        }
    }
    public String toString(){
        return "Carname : "+CarName+"\nModelName: "+ModelName+"\nYear : "+Year+"\nMPG(Miles Per Gallon) : "+MilesPerGallon+"\nMiles On The Car : "+milesDriven +" miles"+"\nThis Car Can Hold Up To : "+fuelCapacity+" gallons"+"\nThis Car Has "+fuelRemaining + " gallons left in the tank";
    }
    public String getFuelRemaining(){
        return "Fuel Remaining For "+CarName+": "+fuelRemaining;
    }

}