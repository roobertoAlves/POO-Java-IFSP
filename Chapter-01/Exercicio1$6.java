import java.util.*;


public class Exercicio1$6 
{

    public static void main(String[] args) 
    {
        //#region Variaveis
        Scanner scan = new Scanner( System.in );

        int _number1;
        int _number2;
        int _adc;
        int _sub;
        int _mult;
        int _div;

        //#endregion
        
        System.out.print( "Digite o primeiro número: ");
        _number1 = Integer.parseInt(scan.nextLine());
        
        System.out.print( "Digite o segundo número: ");
        _number2 = Integer.parseInt(scan.nextLine());

        _adc = _number1 + _number2;
        _sub = _number1 - _number2;
        _mult = _number1 * _number2;
        _div = _number1 / _number2;

        
        System.out.printf( "%d + %d = %d\n", _number1, _number2, _adc );
        System.out.printf( "%d - %d = %d\n", _number1, _number2, _sub );
        System.out.printf( "%d * %d = %d\n", _number1, _number2, _mult );
        System.out.printf( "%d / %d = %d\n", _number1, _number2, _div );

        scan.close();
    }    
}
