import java.util.Scanner;

public class Exercicio2 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _number2;

        //#endregion

        System.out.print( "Digite um numero: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "DIigte um segundo numero: " );
        _number2 = Integer.parseInt( scanner.nextLine() );

        if(_number1 <= _number2)
        {
            for( int i = _number1; i <= _number2; i++ )
            {
                if( i < _number2 )
                {
                    System.out.printf( "%d ", i );
                }

                if( i == _number2 )
                {
                    System.out.printf( "%d", i );
                }

            
            }
        }
        else
        {
            for( int i = _number1; i >= _number2; i-- )
            {
                if( i > _number2 )
                {
                    System.out.printf( "%d ", i );
                }

                if( i == _number2 )
                {
                    System.out.printf( "%d", i );
                }
            }
        }

        scanner.close();

    }    
}
