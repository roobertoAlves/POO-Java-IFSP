import java.util.Scanner;

public class Exercicio7$5 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int[ ] _fUserInputArray = new int[ 5 ];
        int[ ] _sUserInputArray = new int[ _fUserInputArray.length ];   

        boolean _isEven;
        boolean _isDivisible;

        //#endregion

        for( int i = 0; i < _fUserInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o primeiro array[%d]: ",  i );
            _fUserInputArray[ i ] = Integer.parseInt( scanner.nextLine() );

            System.out.printf( "Digite o valor para o segundo array[%d]: ",  i );
            _sUserInputArray[ i ] = Integer.parseInt( scanner.nextLine() );
        }

        for( int i = 0; i < _fUserInputArray.length; i++ )
        {
            _isEven = IsEven( _fUserInputArray[ i ] );
           _isDivisible = IsDivisible( _fUserInputArray[ i ], _sUserInputArray[ i ] );

           if(_isDivisible && _isEven)
           {
                System.out.printf( "%d eh par e %d eh divisivel por %d\n", _fUserInputArray[ i ], _fUserInputArray[ i ], _sUserInputArray[ i ] );
           }
           else if(_isDivisible && !_isEven)
           {
                System.out.printf( "%d eh impar e %d eh divisivel por %d\n", _fUserInputArray[ i ], _fUserInputArray[ i ],  _sUserInputArray[ i ] );
           }
           else if(!_isDivisible && _isEven)
           {
                System.out.printf( "%d eh par e %d nao eh divisivel por %d\n", _fUserInputArray[ i ], _fUserInputArray[ i ], _sUserInputArray[ i ] );
           }
           else if(!_isDivisible && !_isEven)
           {
            System.out.printf( "%d eh impar e %d nao eh divisivel por %d\n", _fUserInputArray[ i ], _fUserInputArray[ i ], _sUserInputArray[ i ] );
           }

        }

        scanner.close();
    }   
    
    public static boolean IsEven( int x )
    {
        return ( x % 2 == 0) ? true : false;
    }

    public static boolean IsDivisible( int dividend, int divider )
    {
        return ( dividend % divider == 0 ) ? true : false;
    }
}
