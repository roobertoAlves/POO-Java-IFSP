import java.util.Scanner;

public class Exercicio4$3
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double[ ] _userInputArray = new double[ 5 ]; 

        double _product = 1;
        double _sum = 0;

        //#endregion

        for( int i = 0; i < _userInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o array[%d]: ",  i );
            _userInputArray[i] = Double.parseDouble( scanner.nextLine() );
        }

        for( int j = 0; j < _userInputArray.length; j++ )
        {
            _sum += _userInputArray[j];

            _product *= _userInputArray[j];

        }

        System.out.printf( "\nSomatorio: %.2f\n", _sum );
        System.out.printf( "Produtorio: %.2f", _product );

        scanner.close();

    }    
}
