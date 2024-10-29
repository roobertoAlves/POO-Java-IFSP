import java.util.Scanner;

public class Exercicio5$1 
{    
    public static void main(String[] args) 
    {   
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int[ ][ ] _userInputArray = new int [ 3 ][ 2 ];
 
        //#endregion


        for( int i = 0; i < _userInputArray.length; i++ )
        {
            for( int j = 0; j < _userInputArray[ i ].length; j++ )
            {
                System.out.printf( "Digite o valor para o array[%d][%d]: ",  i, j );
                _userInputArray[i][j] = Integer.parseInt( scanner.nextLine() );
            }
        }

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            for( int j = 0; j < _userInputArray[ i ].length; j++ )
            {
                if( j != 0 )
                {
                    System.out.print( " " );
                }

                System.out.printf( "%03d", _userInputArray[ i ][ j ] );
            }

            System.out.println();
        }

        scanner.close();

    }   
}
