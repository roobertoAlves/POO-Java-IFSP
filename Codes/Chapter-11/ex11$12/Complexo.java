public class Complexo 
{
    private double imaginary;
    private double real;
    
    public Complexo( double real, double imaginary )
    {
        this.imaginary = imaginary;
        this.real = real;
    }

    public Complexo Sum( Complexo otherComplex )
    {
        double newImaginarySum = this.imaginary + otherComplex.imaginary;
        double newRealSum = this.real + otherComplex.real;

        return new Complexo( newRealSum, newImaginarySum );
    }
    public Complexo Subtraction( Complexo otherComplexFraction )
    {
        double newImaginarySubtraction = this.imaginary - otherComplexFraction.imaginary;
        double newRealSubtraction = this.real - otherComplexFraction.real;

        return new Complexo( newRealSubtraction, newImaginarySubtraction );
    }
    public Complexo Multiplication( Complexo otherComplexFraction )
    {
        double newRealMultiplication = ( this.real * otherComplexFraction.real - this.imaginary * otherComplexFraction.imaginary );
        double newImaginaryMultiplication = ( this.real * otherComplexFraction.imaginary + this.imaginary * otherComplexFraction.real );
        
        return new Complexo( newRealMultiplication, newImaginaryMultiplication );
    }

    @Override 
    public String toString()
    {   
        return String.format( "(%.2f + %.2fi)", real, imaginary );
    }

    public String OperationsExb( Complexo complex )
    {
        Complexo sumComplexo = Sum( complex );
        Complexo subComplexo = Subtraction( complex );
        Complexo multComplexo = Multiplication( complex );

        return String.format(
            """

            %s + %s = %s
            %s - %s = %s
            %s * %s = %s     
            """, 

            this.toString(), complex.toString(), sumComplexo.toString(),
            this.toString(), complex.toString(), subComplexo.toString(),
            this.toString(), complex.toString(), multComplexo.toString() );
    }
}
