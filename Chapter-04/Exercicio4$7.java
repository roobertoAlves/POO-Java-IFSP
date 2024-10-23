import java.util.Scanner;

public class Exercicio4$7
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner(System.in);
        int [ ] _userInputArray = new int [ 5 ];  
        int [ ] _userSecondInputArray = new int [ 5 ];
        int [ ] _sumArray = new int [ 5 ];

        //#endregion

        for ( int i = 0; i < _userInputArray.length; i++ ) 
        {
            System.out.printf("Digite o valor para o array[%d]: ", i);
            _userInputArray[ i ] = Integer.parseInt( scanner.nextLine() );
        }

        System.out.println();
        
        for ( int i = 0; i < _userSecondInputArray.length; i++ ) 
        {
            System.out.printf("Digite o valor para segundo array[%d]: ", i);
            _userSecondInputArray[ i ] = Integer.parseInt( scanner.nextLine() );
        }

        //soma

        for( int i = 0; i < _sumArray.length; i++ )
        {
            _sumArray[ i ] = _userInputArray[ i ] + _userSecondInputArray[ i ];
        }
       
        for( int i = 0; i < _sumArray.length; i++ )
        {
            System.out.printf( "arraySoma[%d] = %d\n", i, _sumArray[ i ] );
        }
        scanner.close();
    }
}
 