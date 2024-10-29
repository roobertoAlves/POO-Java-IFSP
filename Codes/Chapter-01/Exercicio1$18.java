import java.util.Scanner;

public class Exercicio1$18 
{
    public static void main(String[] args) 
    {
            //#region Variaveis

            Scanner scanner = new Scanner( System.in );

            double _bDiagonal;
            double _sDiagonal;
            double _area;


            //#endregion

            System.out.print( "Digite o valor do comprimento da diagonal maior do losango: " );
            _bDiagonal = Double.parseDouble( scanner.nextLine() );
            
            System.out.print( "Digite o valor do comprimento da diagonal menor do losango: " );
            _sDiagonal = Double.parseDouble( scanner.nextLine() );

            _area = ( _bDiagonal * _sDiagonal ) / 2;

            System.out.printf( "Area = %.2f\n", _area );

            scanner.close();
    }    
}
