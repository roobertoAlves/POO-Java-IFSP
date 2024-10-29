import java.util.Scanner;

public class Exercicio1$17 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _bigBase;
        double _smallBase;
        double _height;
        double _area;

        //#endregion

        
        System.out.print( "Digite o valor do comprimento da base maior do trapézio: " );
        _bigBase = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite o valor do comprimento da base menor do trapézio: " );
        _smallBase =  Double.parseDouble( scanner.nextLine() );
        
        System.out.print( " Digite o valor do comprimento da altura do trapézio: " );
        _height =  Double.parseDouble( scanner.nextLine() );

        _area = ((_bigBase + _smallBase) * _height) / 2;

        System.out.printf( "Area = %.2f\n", _area );
            
        scanner.close();
    }    
}
