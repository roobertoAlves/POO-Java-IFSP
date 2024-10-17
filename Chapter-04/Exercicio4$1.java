import java.util.Scanner;

public class Exercicio4$1 
{    
    public static void main(String[] args) 
    {   
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int [ ] _userInputArray = new int[ 5 ];
        int [ ] _cubeValueArray = new int [ 5 ];

        //#endregion


        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o array[%d]: ",  i );
            _userInputArray[i] = Integer.parseInt( scanner.nextLine() );
        }   

        for( int i = 0; i < _cubeValueArray.length; i++ )
        {
            _cubeValueArray[i] = _userInputArray[i] * _userInputArray[i] * _userInputArray[i]; 
        } 


        for( int i = 0; i < _cubeValueArray.length; i++ )
        {
            System.out.printf( "arrayCubo[%d] = %d\n", i, _cubeValueArray[i] );
        }

        scanner.close();

    }   
}
