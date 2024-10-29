import java.util.Scanner;

public class Exercicio4$8
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        Scanner scanner = new Scanner(System.in);

        int[] _userInputArray = new int[5];

        boolean _hasEven = false;
        boolean _hasOdd = false;

        //#endregion
        
        for (int i = 0; i < _userInputArray.length; i++) 
        {
            System.out.printf( "Digite o valor para o array[%d]: ", i );
            _userInputArray[i] = Integer.parseInt( scanner.nextLine() );
        }
 
        System.out.print( "Numeros pares: " );

        for ( int i = 0; i < _userInputArray.length; i++ ) 
        {
            if ( _userInputArray[i] % 2 == 0 ) 
            {
                if ( _hasEven ) 
                {
                    System.out.printf( " %d", _userInputArray[i] );
                } 
                else 
                {
                    System.out.printf( "%d", _userInputArray[i] );
                    _hasEven = true;
                }
            }
        }

        if (!_hasEven) 
        {
            System.out.print("nao ha");
        }
        
        System.out.println( "." );

        System.out.print("Numeros impares: ");
 
        for ( int i = 0; i < _userInputArray.length; i++ ) 
        {
            if ( _userInputArray[i] % 2 != 0 ) 
            {
                if ( _hasOdd ) 
                {
                    System.out.printf(" %d", _userInputArray[i]);
                } 
                else 
                {
                    System.out.printf("%d", _userInputArray[i]);
                    _hasOdd = true;
                }
            }
        }

        if (!_hasOdd) 
        {
            System.out.print("nao ha");
        }

        System.out.println(".");

        scanner.close();
    }
}
