import java.util.Scanner;

public class TesteComplexo 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _real;
        double _otherReal;
        double _imaginary;
        double _otherImaginary;


        //#endregion

        System.out.println( "Complexo 1:" );

        System.out.print( "\tDigite um numero real: " );
        _real = Double.parseDouble( scanner.nextLine() );

        System.out.print( "\tDigite um numero imaginario: " );
        _imaginary = Double.parseDouble( scanner.nextLine() );

        System.out.println( "\nComplexo 2:" );

        System.out.print( "\tDigite um numero real: " );
        _otherReal = Double.parseDouble( scanner.nextLine() );

        System.out.print( "\tDigite um numero imaginario: " );
        _otherImaginary = Double.parseDouble( scanner.nextLine() );


        Complexo _firstComplexo = new Complexo( _real, _imaginary );
        Complexo _secondComplexo = new Complexo( _otherReal, _otherImaginary );

        System.out.println( _firstComplexo.OperationsExb( _secondComplexo ) );

        scanner.close();
    }
}
