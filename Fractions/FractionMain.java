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
public class FractionMain{
    public static void main(String[] args){
        Fraction EXAMPLE1= new Fraction(3,4);
        Fraction EXAMPLE2 = new Fraction(6,69);
        System.out.println(EXAMPLE2.Simplification());
        Fraction Result = new Fraction(3,4).add(new Fraction(1,4));
        System.out.println(Result);
// the print method is an example of the toString method and the intialization of
// each fraction is an example of the contructor method with faster intiialization
//Numerator nad denomnator example SETTER AND GETTER 
        int Denom1 = EXAMPLE1.getDenom(); 
        int Numer1 = EXAMPLE1.getnum();
// This should be 3 and 4
        System.out.println(Numer1);
        System.out.println(Denom1);
        EXAMPLE1.setNum(6);
        EXAMPLE1.setDenom(9);
        System.out.println(EXAMPLE1);
    }
}