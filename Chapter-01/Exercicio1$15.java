import java.util.Scanner;

public class Exercicio1$15 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );
        double _area;
        double _per;
        double _width;
        double _height;

        //#endregion
        
        System.out.print( "Digite o comprimento da altura do retângulo(em decimal): " );
        _height = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite o comprimento da largura do retângulo(em decimal): " );
        _width = Double.parseDouble( scanner.nextLine() );

        _per = ( 2 * _width ) + ( 2 * _height );
        _area = _width * _height;

        System.out.printf( "Perimetro = %.2f\n", _per);
        System.out.printf( "Area = %.2f\n", _area );

            
        scanner.close();
    
    }    
}
