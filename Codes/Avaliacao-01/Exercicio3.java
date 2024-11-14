import java.util.Scanner;

public class Exercicio3 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _number2;

        int _sum = 0;

        //#endregion

        System.out.print( "Digite um numero: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "DIigte um segundo numero: " );
        _number2 = Integer.parseInt( scanner.nextLine() );

        if( _number1 <= _number2 )
        {
            for( int i = _number1; i <= _number2; i++ )
            {
                _sum = _sum + i;
            }

            System.out.printf( "Somatorio entre %d e %d: %d", _number1, _number2, _sum );
        }
        else
        {
            for( int i = _number2; i <= _number1; i++ )
            {
                _sum = _sum + i;
            }
            System.out.printf( "Somatorio entre %d e %d: %d", _number2, _number1, _sum );
        }

        scanner.close();
    }    
}
