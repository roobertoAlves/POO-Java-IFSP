import java.util.Scanner;

public class Exercicio4$6 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int[ ] _userInputArray = new int[ 5 ];

        int _valueToFind;

        //#endregion
        
        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o array[%d]: ",  i );
            _userInputArray[i] = Integer.parseInt( scanner.nextLine() ); 
        }

        System.out.print( "Digite um numero para buscar no array: " );
        _valueToFind = Integer.parseInt( scanner.nextLine() );

        for(int i = 0; i < _userInputArray.length; i++ )
        {
            if(_userInputArray[ i ] == _valueToFind)
        }

        scanner.close();
    }    
}
