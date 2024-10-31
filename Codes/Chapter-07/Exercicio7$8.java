import java.util.Scanner;

public class Exercicio7$8 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int[ ] _fUserInputArray = new int[ 5 ];
        int[ ] _sUserInputArray = new int[ _fUserInputArray.length ];

        boolean _isFriend;

        //#endregion

        for( int i = 0; i < _fUserInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o primeiro array[%d]: ",  i );
            _fUserInputArray[ i ] = Integer.parseInt( scanner.nextLine() );

            System.out.printf( "Digite o valor para o segundo array[%d]: ",  i );
            _sUserInputArray[ i ] = Integer.parseInt( scanner.nextLine() );
        }

        for(int i = 0; i < _fUserInputArray.length; i++ )
        {
            _isFriend = IsFriends(_fUserInputArray[ i ], _sUserInputArray[ i ] );

            if(_isFriend)
            {
                System.out.printf( "%d e %d sao amigos\n", _fUserInputArray[ i ], _sUserInputArray[ i ] );
            }
            else
            {
                System.out.printf( "%d e %d nao sao amigos\n", _fUserInputArray[ i ], _sUserInputArray[ i ] );
            }
        }

        scanner.close();

    }
    
    public static boolean IsFriends( int x, int y )
    {
        int sumX = 0;
        int sumY = 0;

        for( int i = 1; i < x; i++ )
        {
            if(x % i == 0 )
            {
                sumX += i;
            }
        }

        for( int i = 1; i < y; i++ )
        {
            if( y % i == 0 )
            {
                sumY += i;
            }
        }

        return (sumX == y && sumY == x) ? true : false;
    }
}
