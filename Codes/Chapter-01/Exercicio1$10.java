import java.util.Scanner;

public class Exercicio1$10 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );
        int _bigBase;
        int _smallBase;
        int _height;
        int _area;

        //#endregion

        System.out.print( "Digite o valor do comprimento da base maior do trapézio: " );
        _bigBase = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o valor do comprimento da base menor do trapézio: " );
        _smallBase = Integer.parseInt( scanner.nextLine() );
        
        System.out.print( " Digite o valor do comprimento da altura do trapézio: " );
        _height = Integer.parseInt( scanner.nextLine() );

        _area = ((_bigBase + _smallBase) * _height) / 2;

        System.out.printf( "Area = %d\n", _area );
            
        scanner.close();

    }    
}
