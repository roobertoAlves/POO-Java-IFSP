import java.util.Scanner;

public class Exercicio2$7 
{
    public static void main(String[] args) 
    {
        //#region Variable 
        
        Scanner scanner = new Scanner( System.in );

        double _adic;
        double _sub;
        double _num1;
        double _num2;

        //#endregion

        System.out.print( "Digite o primeiro numero: " );
        _num1 = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite o segundo numero: " );
        _num2 = Double.parseDouble( scanner.nextLine() );

        _adic = _num1 + _num2;

        if(_adic > 10)
        {
            System.out.printf("Os numeros fornecidos foram %.2f e %.2f", _num1, _num2);
        }
        else
        {
            _sub = _num1 - _num2;

            System.out.printf("A subtracao entre %.2f e %.2f e igual a %.2f", _num1, _num2, _sub);
        }

        scanner.close();
    }    
}
