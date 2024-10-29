import java.util.Scanner;

public class Exercicio2$8 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double _adic;
        double _n1;
        double _n2;
        double _n3;

        //#endregion

        System.out.print( "Digite o primeiro número: " );
        _n1 = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite o segundo número: " );
        _n2 = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite o terceiro número: " );
        _n3 = Double.parseDouble( scanner.nextLine() );

        if( _n1 > _n2 && _n1 > _n3)
        {
            if(_n2 > _n3)
            {
                _adic = _n1 + _n2;

                System.out.printf( "A soma dos dois numeros maiores fornecidos e %.2f", _adic );
            }
            else
            {
                _adic = _n1 + _n3;

                System.out.printf( "A soma dos dois numeros maiores fornecidos e %.2f", _adic );
            }
        }
        else if(_n2 > _n1 && _n2 > _n3)
        {
            if(_n1 > _n3)
            {
                _adic = _n2 + _n1;

                System.out.printf( "A soma dos dois numeros maiores fornecidos e %.2f", _adic );
            }
            else
            {
                _adic = _n2 + _n3;

                System.out.printf( "A soma dos dois numeros maiores fornecidos e %.2f", _adic );
            }
        }
        else
        {
            if(_n1 > _n2)
            {
                _adic = _n3 + _n1;

                System.out.printf( "A soma dos dois numeros maiores fornecidos e %.2f", _adic );
            }
            else
            {
                _adic = _n3 + _n2;

                System.out.printf( "A soma dos dois numeros maiores fornecidos e %.2f", _adic );
            }
        }

        scanner.close();
    }    
}
