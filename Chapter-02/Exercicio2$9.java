import java.util.Scanner;

public class Exercicio2$9 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _poligonSides;
        double _poligonSize;
        double _area;
        double _per;

        //#endregion

        System.out.print( "Digite a quantidade de lados do poligono: " );
        _poligonSides = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite a medida dos lados do poligono: " );
        _poligonSize = Double.parseDouble( scanner.nextLine() );
        
    
        if(_poligonSides == 3)
        {
            _per = _poligonSize * _poligonSides;

            System.out.printf( "TRIANGULO de perimetro %.2f", _per );
        }
        else if(_poligonSides == 4)
        {
            _area = _poligonSize * _poligonSize;

            System.out.printf( "QUADRADO de area %.2f", _area );
        }
        else if(_poligonSides == 5)
        {
            System.out.print( "PENTAGONO" );
        }
        else
        {
            System.out.print( "Poligono nao identificado" );
        }

        scanner.close();
    }    
}
