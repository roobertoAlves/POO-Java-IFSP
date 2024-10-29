import java.util.Scanner;

public class Exercicio1$16 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _area;
        double _base;
        double _height;

        //#endregion

        System.out.print( "Digite o comprimento da altura do triângulo(em decimal): " );
        _height = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite o comprimento da base do triângulo(em decimal): " );
        _base = Double.parseDouble( scanner.nextLine() );

        _area = (_base * _height)/2;

        System.out.printf( "Area = %.2f\n", _area );

            
        scanner.close();
    }    
}
