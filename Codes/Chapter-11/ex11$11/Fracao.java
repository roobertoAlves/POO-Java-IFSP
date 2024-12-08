public class Fracao 
{
    double numerator;
    double denominator;

    public Fracao( double numerator, double denominator )
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fracao Sum( Fracao otherFracao )
    {
        double newNumerator = ( this.numerator * otherFracao.denominator ) + ( this.denominator * otherFracao.numerator );
        double newDenominator = this.denominator * otherFracao.denominator;

        return new Fracao( newNumerator, newDenominator );
        
    }
    public Fracao Subtraction( Fracao otherFracao )
    {
        double newNumerator = ( this.numerator * otherFracao.denominator ) - ( this.denominator * otherFracao.numerator );
        double newDenominator = this.denominator * otherFracao.denominator;

        return new Fracao( newNumerator, newDenominator );

    }
    public Fracao Division( Fracao otherFracao )
    {
        double newNumerator = this.numerator * otherFracao.denominator;
        double newDenominator = this.denominator * otherFracao.numerator;

        return new Fracao( newNumerator, newDenominator );
    }
    public Fracao Multiplication( Fracao otherFracao )
    {
        double newNumerator = this.numerator * otherFracao.numerator;
        double newDenominator = this.denominator * otherFracao.denominator;

        return new Fracao( newNumerator, newDenominator );
    }

    @Override
    public String toString()
    {
        return String.format( "%.2f/%.2f", numerator, denominator );
    }

    public String CalculateOperations( Fracao otherFracao )
    {
        Fracao sumResult = Sum(otherFracao);
        Fracao subtractionResult = Subtraction(otherFracao);
        Fracao multiplicationResult = Multiplication(otherFracao);
        Fracao divisionResult = Division(otherFracao);

        return String.format(
            """

            %s + %s = %s
            %s - %s = %s
            %s * %s = %s
            %s / %s = %s
            """,
            this.toString(), otherFracao.toString(), sumResult.toString(),
            this.toString(), otherFracao.toString(), subtractionResult.toString(),
            this.toString(), otherFracao.toString(), multiplicationResult.toString(),
            this.toString(), otherFracao.toString(), divisionResult.toString()
        );
    }

}   
