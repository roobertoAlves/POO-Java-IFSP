import java.util.Scanner;

public class Exercicio1$13 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner =  new Scanner( System.in );

        double _number1;
        double _number2;
        double _adc;
        double _sub;
        double _mult;
        double _div;

        //#endregion

        System.out.print( "Digite o primeiro número (em decimal): " );
        _number1 = Double.parseDouble( scanner.nextLine() );

        System.out.print(" Digite o segundo número(em decimal): " );
        _number2 = Double.parseDouble( scanner.nextLine() );

        _adc = _number1 + _number2;
        _sub = _number1 - _number2;
        _mult = _number1 * _number2;
        _div = _number1 / _number2;

        System.out.printf( "%.2f + %.2f = %.2f\n", _number1, _number2, _adc );
        System.out.printf( "%.2f - %.2f = %.2f\n", _number1, _number2, _sub );
        System.out.printf( "%.2f * %.2f = %.2f\n", _number1, _number2, _mult );
        System.out.printf( "%.2f / %.2f = %.2f\n", _number1, _number2, _div );

        scanner.close();
    }    
}
