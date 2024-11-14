import java.util.Scanner;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int [ ] _userInputArray = new int [ 5 ];
        int _valueToFind;

        //#endregion

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite um valor para o array[%d]: ", i );
            _userInputArray[ i ] = Integer.parseInt( scanner.nextLine() );
        }

        System.out.print( "Digite um numero para procurar: " );
        _valueToFind = Integer.parseInt( scanner.nextLine() );

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            if( _userInputArray[ i ] == _valueToFind )
            {
                System.out.printf( "Indice %d: ACHEI\n", i );
            }
            else
            {
                System.out.printf( "Indice %d: NAO ACHEI\n", i);
            }
        }

        scanner.close();
    }    
}
