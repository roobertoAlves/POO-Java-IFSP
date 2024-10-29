import java.util.Scanner;

public class Exercicio7$1 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );
        
        int [ ] _userInputArray = new int [ 5 ];

        //#endregion

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o array[%d]: ",  i );
            _userInputArray[ i ] = Integer.parseInt( scanner.nextLine() );
        }

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf("absoluto(%d) = %d\n", _userInputArray[ i ], AbsoluteValue(_userInputArray[ i ]));
        }


        scanner.close();

    }

    public static int AbsoluteValue( int x )
    {
        if(x < 0 )
        {
            x = -x;
        }

        return x;
    }


}
