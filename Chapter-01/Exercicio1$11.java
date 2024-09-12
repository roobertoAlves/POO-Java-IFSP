import java.util.Scanner;

public class Exercicio1$11 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );
        int _bDiagonal;
        int _sDiagonal;
        int _area;

        System.out.print( "Digite o valor do comprimento da diagonal maior do losango: " );
        _bDiagonal = Integer.parseInt( scanner.nextLine() );
        
        System.out.print( "Digite o valor do comprimento da diagonal menor do losango: " );
        _sDiagonal = Integer.parseInt( scanner.nextLine() );

        _area = (_bDiagonal * _sDiagonal)/2;

        System.out.printf( "Area = %d\n", _area );

            
        scanner.close();

        //#endregion
    }    
}
