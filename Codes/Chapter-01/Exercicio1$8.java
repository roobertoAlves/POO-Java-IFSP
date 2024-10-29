import java.util.*;

public class Exercicio1$8 
{
    public static void main(String[] args)
    {
        //#region Variaveis
        Scanner scanner = new Scanner( System.in );
        int _area;
        int _per;
        int _width;
        int _height;

        //#endregion

        System.out.print( "Digite o comprimento da altura do retângulo: ");
        _height = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o comprimento da largura do retângulo: ");
        _width = Integer.parseInt( scanner.nextLine() );


        _per = (2 * _width) + ( 2 * _height);
        _area = _width * _height;

        System.out.printf( "Perimetro = %d\n", _per);
        System.out.printf( "Area = %d\n", _area );

            
        scanner.close();
    }
}
