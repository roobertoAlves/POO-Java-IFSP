import java.util.Scanner;

public class Exercicio4$5 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int[ ] _userInputArray = new int[ 5 ];

        int _valueToFind;
        int _adic = 0;

        //#endregion

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o array[%d]: ",  i );
            _userInputArray[i] = Integer.parseInt( scanner.nextLine() );
        }

        System.out.printf( "\nDigite um numero para buscar: " );
        _valueToFind = Integer.parseInt( scanner.nextLine() );


        for( int i = 0; i < _userInputArray.length; i++ )
        {
            if( _userInputArray[ i ] == _valueToFind)
            {
                _adic++;
            }
        }

        if( _adic > 1 )
        {
            System.out.printf( "\nO array contem %d ocorrencias do valor %d.", _adic, _valueToFind );
        }
        else if( _adic == 1 ) 
        {
            System.out.printf( "\nO array contem %d ocorrencia do valor %d.", _adic, _valueToFind );
        }
        else
        {
            System.out.printf( "\nO array nao contem o valor %d.", _valueToFind );
        }

        scanner.close();
 
    }    
}
