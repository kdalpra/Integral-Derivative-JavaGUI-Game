public class Fraction {
 
    int numerator;
    int denominator;
 
    /**
    * Constructor
    * 
    * @param numr
    * @param denr
    */
    public Fraction(int numr, int denr) {
	numerator = numr;
	denominator = denr;
	reduce();
    }
 
    public int getNumerator() {
	return numerator;
    }
 
    public void setNumerator(int numerator) {
	this.numerator = numerator;
    }
 
    public int getDenominator() {
	return denominator;
    }
 
    public void setDenominator(int denominator) {
	this.denominator = denominator;
    }
 
    /**
    * Calculates gcd of two numbers
    * 
    * @param numerator
    * @param denominator
    * @return
    */
    public int calculateGCD(int numerator, int denominator) {
	if (numerator % denominator == 0) {
             return denominator;
        }
	return calculateGCD(denominator, numerator % denominator);
	}
 
    /**
    * Reduce the fraction to lowest form
    */
    void reduce() {
	int gcd = calculateGCD(numerator, denominator);
	numerator /= gcd;
	denominator /= gcd;
    }
 
    /**
    * Adds two fractions
    * 
    * @param fractionTwo
    * @return
    */
    public Fraction add(Fraction fractionTwo) {
	int numer = (numerator * fractionTwo.getDenominator()) + 
                            (fractionTwo.getNumerator() * denominator);
	int denr = denominator * fractionTwo.getDenominator();
	return new Fraction(numer, denr);
    }
 
    /**
    * Subtracts two fractions
    * 
    * @param fractionTwo
    * @return
    */
    public Fraction subtract(Fraction fractionTwo) {
        int newNumerator = (numerator * fractionTwo.denominator) - 
                                 (fractionTwo.numerator * denominator);
	int newDenominator = denominator * fractionTwo.denominator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
 
    /**
    * Multiples two functions
    * 
    * @param fractionTwo
    * @return
    */
    public Fraction multiply(Fraction fractionTwo) {
	int newNumerator = numerator * fractionTwo.numerator;
	int newDenominator = denominator * fractionTwo.denominator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
 
    /**
    * Divides two fractions
    * 
    * @param fractionTwo
    * @return
    */
    public Fraction divide(Fraction fractionTwo) {
	int newNumerator = numerator * fractionTwo.getDenominator();
	int newDenominator = denominator * fractionTwo.numerator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
 
    /**
    * Returns string representation of the fraction
    */
    @Override
    public String toString() {
    	if(this.denominator == 1) {
    		return Integer.toString(this.numerator);
    		}
    	
    		else {
	return this.numerator + "/" + "\n" + this.denominator;
    		}
    }
 
    public static void main(String[] args) {
	Fraction f1 = new Fraction(25, 35);
	System.out.println(f1.toString());
	Fraction f2 = new Fraction(2, 7);
	Fraction f3 = f1.add(f2);
	System.out.println("Result of addition of " + f1 + " and " + f2 + " is : " + f3);
	f3 = f1.subtract(f2);
	System.out.println("Result of subtraction of " + f1 + " and " + f2 + " is : " + f3);
	f3 = f1.divide(f2);
	System.out.println("Result of division of " + f1 + " and " + f2 + " is : " + f3);
	f3 = f1.multiply(f2);
	System.out.println("Result of multiplication of " + f1 + " and " + f2 + " is : " + f3);
    }
}