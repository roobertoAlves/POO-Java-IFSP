import java.util.Scanner;

public class Exercicio7$6 
{
    public static void main(String[] args)
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int[ ] _userInputArray = new int[ 5 ];

        //#endregion

        for(int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o array[%d]: ",  i );
            _userInputArray[ i ] = Integer.parseInt( scanner.nextLine() );

            if(_userInputArray[ i ] < 0 )
            {
                do {

                    System.out.printf( "Entre com um valor positivo: ",  i );
                    _userInputArray[ i ] = Integer.parseInt( scanner.nextLine() );

                } while (_userInputArray[ i ] < 0);
            }
        }

        
        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf("Soma dos divisores de %d: %d\n", _userInputArray[ i ], AddDividers( _userInputArray[ i ]) );
        }

        scanner.close();

    }  
    
    public static int AddDividers( int x )
    {
        int dividers = 0;

        for( int i = 1; i < x; i++ )
        {
            if( x % i == 0)
            {
                dividers += i;
            }
        }

        return dividers;
    }
}
