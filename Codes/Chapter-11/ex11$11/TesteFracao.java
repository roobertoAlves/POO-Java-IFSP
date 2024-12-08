import java.util.Scanner;

public class TesteFracao 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _numerator;
        double _otherNumerator;
        double _denominator;
        double _otherDenominator;


        //#endregion

        System.out.println( "Fracao 1:" );

        System.out.print( "\tDigite o numerador: " );
        _numerator = Double.parseDouble( scanner.nextLine() );

        System.out.print( "\tDigite o denominador: " );
        _denominator = Double.parseDouble( scanner.nextLine() );

        System.out.println( "\nFracao 2:" );

        System.out.print( "\tDigite o numerador: " );
        _otherNumerator = Double.parseDouble( scanner.nextLine() );

        System.out.print( "\tDigite o denominador: " );
        _otherDenominator = Double.parseDouble( scanner.nextLine() );


        Fracao _firstFraction = new Fracao( _numerator, _denominator );
        Fracao _secondFraction = new Fracao( _otherNumerator, _otherDenominator );

        System.out.println( _firstFraction.CalculateOperations( _secondFraction ) );

        scanner.close();
    }
}
