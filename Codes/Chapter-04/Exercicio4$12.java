import java.util.Scanner;

public class Exercicio4$12 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int[ ] _userInputArray = new int [ 5 ];

        //#endregion

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o array[%d]: ", i );
            _userInputArray[i] = Integer.parseInt( scanner.nextLine() );
        }


        for (int i = 0; i < _userInputArray.length - 1; i++) 
        {
            _userInputArray[ i ] = _userInputArray[ i + 1 ];
        }

        System.out.println();
        
        for ( int i = 0; i < _userInputArray.length - 1 ; i++ ) 
        {
            System.out.printf( "array[%d] = %d\n", i, _userInputArray[i] );
        }

        scanner.close();
    }    
}
