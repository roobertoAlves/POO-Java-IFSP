import java.util.Scanner;

public class Exercicio4$9 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner(System.in);
        
        int [ ] _userInputArray = new int [ 5 ];
        int [ ] _invertedArray = new int [ 5 ];
        
        //#endregion
    
        for ( int i = 0; i < _userInputArray.length; i++ ) 
        {
            System.out.printf( "Digite o valor para o array[%d]: ", i );
            _userInputArray[i] = Integer.parseInt( scanner.nextLine() );
        }
        
        for ( int i = 0; i < _userInputArray.length; i++ )
        {
            _invertedArray[i] = _userInputArray [ _userInputArray.length - 1 - i ];
        }
        
        System.out.println();

        for (int i = 0; i < _invertedArray.length; i++) {
           
            System.out.printf("arrayInv[%d] = %d\n", i, _invertedArray [ i ]);
        }
        
        
        scanner.close();
    }
}
