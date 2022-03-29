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
public class Fraction {
    int numerator,denominator;
    public Fraction(int n, int d){
        if (d == 0){
            throw new ArithmeticException();
        }
        numerator =n ;
        denominator =d;
    }
    public int getnum(){
        return numerator; 
    }
    public int getDenom(){
        return denominator;
    }
    public void setNum(int n){
        numerator = n; 
    }
    public void setDenom(int d){
        if (d == 0){
            throw new ArithmeticException();
        }
        denominator =d;
    }
    public Fraction add(Fraction a){
        //N + num
        //_   ____
        //D   denom
        int Num = a.getnum();
        int Denom = a.getDenom();
        int New_Numerator = (numerator*Denom+Num*denominator);
        int New_Denominator = Denom*denominator;
        Fraction Sum = new Fraction(New_Numerator,New_Denominator);
        return Sum.Simplification();
    }
    public boolean equals(Fraction a){
        if((a.getnum()==numerator)&&(a.getDenom()== denominator)){
            return true;
        }
        return false;
    }
    public Fraction Simplification(){
        int Prev_R = 1;
        int Remainder = denominator% numerator;
        // if the remainder isn't zero, then you sgould mod by the 
        // previous divisor, then 
        Fraction Simplified;
        int divisor =numerator;
        if (Remainder==0){
            Simplified = new Fraction((numerator/numerator),(denominator/numerator));
            return Simplified;
        }
        while (Remainder !=0){
            Prev_R = Remainder;
            Remainder %= divisor;
            divisor = Remainder;
            //  if the inital values are equal to 0 break and divide by the numerator
            if (Remainder==0){
                break;
            }
        }
        
        Simplified = new Fraction((numerator/Prev_R),(denominator/Prev_R));

        return Simplified;
    }
    public String toString(){
        if (denominator == 1){
            return numerator+"/"+denominator+ " equals "+ numerator;
        }
        return numerator+"/"+denominator;
    }


}
