/*
Mon, 28 Mar 2022
Anthony Poole
:Object Practice:
Make an object class for cars and for frations
in each folder with their repsecive names, lies the class for the object
and the test file for each class
:Fraction class notes:
The only issue with this project was just the sheer volume in logic that it took to 
implement the simplification of a fraction, how I did it was by continuing
modulo division until it equal zero, the result before hadn represented the remainder
if you take that and divide it by the nyumereator and divisor, you get a simplifies
fraction  
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
        return "Car Name : "+CarName+"\nModel Name: "+ModelName+"\nYear : "+Year+"\nMPG(Miles Per Gallon) : "+MilesPerGallon+"\nMiles On The Car : "+milesDriven +" miles"+"\nThis Car Can Hold Up To : "+fuelCapacity+" gallons"+"\nThis Car Has "+fuelRemaining + " gallons left in the tank";
    }
    public String getFuelRemaining(){
        return "Fuel Remaining For "+CarName+": "+fuelRemaining;
    }

}