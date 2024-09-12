import java.util.Scanner;

public class Exercicio1$14 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );
        double _sideValue;
        double _area;
        double _per;

        //#endregion

        System.out.print( "Digite o comprimento do lado do quadrado(em decimal): " );
        _sideValue = Double.parseDouble( scanner.nextLine() );

        _area = _sideValue * _sideValue;
        _per = 4 * _sideValue;

        System.out.printf( "Perimetro = %.2f\n", _per);
        System.out.printf( "Area = %.2f\n", _area );

            
        scanner.close();
    }    
}
