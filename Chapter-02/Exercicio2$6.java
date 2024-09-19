import java.util.Scanner;

public class Exercicio2$6
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _number1;
        double _total;

        //#endregion

        System.out.print( "Digite um numero: " );
        _number1 = Double.parseDouble( scanner.nextLine() );

        if(_number1 > 20)
        {
            _total = _number1 / 2;
            System.out.printf( "A metade de %.2f e %.2f", _number1, _total );
        }
        else
        {
            _total = _number1 * 3;
            System.out.printf( "O triplo de %.2f e %.2f", _number1, _total);
        }
    
        scanner.close();
    }   
}
