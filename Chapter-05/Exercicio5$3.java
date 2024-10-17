import java.util.Scanner;

public class Exercicio5$3 
{
    public static void main(String[] args) 
    {
        //#region Variveis
        
        Scanner scanner = new Scanner( System.in );

        int[ ][ ] _userInputArray = new int[ 3 ][ 4 ];

        int[ ][ ] _totalValueArray = new int[ 3 ][ 4 ];

        int _valueToMult;

        //#endregion

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            for( int j = 0; j < _userInputArray[ i ].length; j++ )
            {
                System.out.printf( "Digite o valor para o segundo array[%d][%d]: ",  i, j  );
                _userInputArray[i][ j ] = Integer.parseInt( scanner.nextLine() );
            }
        }

        System.out.println();

        System.out.print( "Digite um valor para multiplicar o array: " );
        _valueToMult = Integer.parseInt( scanner.nextLine() );


        //Conta 
        
        for( int i = 0; i < _totalValueArray.length; i++ )
        {
            for( int j = 0; j < _totalValueArray[ i ].length; j++ )
            {
                _totalValueArray[ i ][ j ] = _userInputArray[ i ][ j ] * _valueToMult;
            }
        }

        //Exibe

        System.out.println("arrayMult:");
        
        for( int i = 0; i < _totalValueArray.length; i++ )
        {
            for( int j = 0; j < _totalValueArray[ i ].length; j++ )
            {
                if( j != 0 )
                {   
                    System.out.print( " " );
                }

                System.out.printf( "%03d", _totalValueArray[ i ][ j ] );
            }

            System.out.println();

        }
        scanner.close();
    }    
}
