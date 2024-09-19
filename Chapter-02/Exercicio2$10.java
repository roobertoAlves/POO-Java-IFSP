import java.util.Scanner;

public class Exercicio2$10 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _sideA;
        double _sideB;
        double _sideC;

        double _modAB;
        double _modBC;
        double _modAC;


        System.out.print( "Digite a medida do lado A: ");
        _sideA = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite a medida do lado B: ");
        _sideB = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite a medida do lado C: ");
        _sideC = Double.parseDouble( scanner.nextLine() );



        //#endregion

        _modAB = _sideA - _sideB;
        _modAC = _sideA - _sideC;
        _modBC = _sideB - _sideC;

        if(_modAB < 0 )
        {
            _modAB = -_modAB;
        }
        if(_modAC < 0)
        {
            _modAC = -_modAC;
        }
        if(_modBC < 0)
        {
            _modBC = -_modBC;
        }
    
        if(_modAB < _sideC && _sideC < _sideA + _sideB &&
            _modAC < _sideB && _sideB < _sideA + _sideC &&
            _modBC < _sideA && _sideA < _sideB + _sideC )
        {
            if(_sideA == _sideB && _sideB == _sideC)
            {
                System.out.printf( "Triangulo EQUILATERO\n" );
            }
            else if(_sideA == _sideB || _sideA == _sideC)
            {
                System.out.printf( "Triangulo ISOSCELES\n" );
            }
            else if(_sideA != _sideB && _sideB != _sideC)
            {
                System.out.printf( "Triangulo ESCALENO\n" );
            }
        }
        else
        {
            System.out.print( "As medidas fornecidas dos lados nao representam um triangulo valido!");
        }

        scanner.close();
    }    
}
