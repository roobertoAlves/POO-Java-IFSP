import java.util.Scanner;

public class Exercicio4$2 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int[ ] _userInputArray = new int [ 5 ];
        int [ ] _resultArray = new int [ 5 ];

        int _multiple;

        //#endregion

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o array[%d]: ",  i );
            _userInputArray[ i ] = Integer.parseInt( scanner.nextLine() );
        }

        System.out.print("Digite o valor a ser multiplicado: ");
        _multiple = Integer.parseInt( scanner.nextLine() );

        for ( int i = 0; i < _resultArray.length; i++ )
        {
            _resultArray[ i ] = _userInputArray[ i ] * _multiple;
        }

        for( int i = 0; i < _resultArray.length; i++ )
        {
            System.out.printf( "arrayMult[%d] = %d\n", i, _resultArray[ i ] );
        }

        scanner.close();
        
    }    
}
