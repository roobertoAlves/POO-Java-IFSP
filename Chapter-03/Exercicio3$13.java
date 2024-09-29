import java.util.Scanner;

public class Exercicio3$13 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _number2;

        int _mOfTwo = 0;
        int _mOfThree = 0;
        int _mOfFour = 0;

        //#endregion

        System.out.print( "Digite o primeiro numero: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o segundo numero: " );
        _number2 = Integer.parseInt( scanner.nextLine() );
        

        scanner.close();
        

        if( _number1 >= _number2 )
        {
            for( int i = _number2; i <= _number1; i++ )
            {
                if( i % 2 == 0 )
                {
                    _mOfTwo++;
                }
                if( i % 3 == 0 )
                {
                    _mOfThree++;
                }
                if( i % 4 == 0 )
                {
                    _mOfFour++;
                }
            }

            System.out.printf( "Multiplos de 2: %d\n", _mOfTwo  );
            System.out.printf( "Multiplos de 3: %d\n", _mOfThree  );
            System.out.printf( "Multiplos de 4: %d\n", _mOfFour  );
        }
        else
        {
            for(int j = _number1; j <= _number2; j++)
            {
                if( j % 2 == 0 )
                {
                    _mOfTwo++;
                }
                if( j % 3 == 0 )
                {
                    _mOfThree++;
                }
                if( j % 4 == 0 )
                {
                    _mOfFour++;
                }
            }

            System.out.printf( "Multiplos de 2: %d\n", _mOfTwo  );
            System.out.printf( "Multiplos de 3: %d\n", _mOfThree  );
            System.out.printf( "Multiplos de 4: %d", _mOfFour  );
        }
    }    
}
