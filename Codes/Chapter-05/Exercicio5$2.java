import java.util.Scanner;

public class Exercicio5$2 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int[ ][ ] _fUserInputArray = new int [ 3 ][ 3 ];
        int[ ][ ] _sUserInputArray = new int [ 3 ][ 3 ];

        int[ ][ ] _totalValueArray = new int [ 3 ][ 3 ];

        //#endregion

        for( int i = 0; i < _fUserInputArray.length; i++ )
        {
            for( int j = 0; j < _fUserInputArray[ i ].length; j++ )
            {
                System.out.printf( "Digite o valor para o primeiro array[%d][%d]: ",  i, j  );
                _fUserInputArray[i][ j ] = Integer.parseInt( scanner.nextLine() );
            }
        }

        System.out.println();

        for ( int i = 0; i < _sUserInputArray.length; i++ )
        {
            for( int j = 0; j < _fUserInputArray[ i ].length; j++ )
            {
                System.out.printf( "Digite o valor para o segundo array[%d][%d]: ",  i, j  );
                _sUserInputArray[i][ j ] = Integer.parseInt( scanner.nextLine() );
            }
        }

        //Soma

        for( int i = 0; i < _totalValueArray.length; i++ )
        {
            for( int j = 0; j < _totalValueArray[ i ].length; j++ )
            {
                _totalValueArray[ i ][ j ] = _fUserInputArray[ i ][ j ] + _sUserInputArray[ i ][ j ];
            }
        }

        //Exibir

        System.out.println("array1:       array2:       arraySoma:"); 

        for( int i = 0; i < _fUserInputArray.length; i++ )
        {
            for( int j = 0; j < _fUserInputArray[ i ].length; j++ )
            {
                if( j != 0 )
                {
                    System.out.print( " " );
                }

                System.out.printf( "%03d", _fUserInputArray[ i ][ j ] );
            }

            if( i == 1)
            {
                System.out.print( " + " );
            }
            else
            {
                System.out.print( "   " );
            }

            for( int k = 0; k < _sUserInputArray[ i ].length; k++ )
            {
                if( k != 0 )
                {
                    System.out.print( " " );
                }

                System.out.printf( "%03d", _sUserInputArray[ i ][ k ] );
            }

            if( i == 1)
            {
                System.out.print( " = " );
            }
            else
            {
                System.out.print( "   " );
            }

            for( int x = 0; x < _totalValueArray[ i ].length; x++ )
            {
                if( x != 0 )
                {
                    System.out.print( " " );
                }

                System.out.printf( "%03d", _totalValueArray[ i ][ x ] );
            }

            System.out.println();
        }

        scanner.close();

    }    
}
