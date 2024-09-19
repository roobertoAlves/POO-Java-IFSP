import java.util.Scanner;

public class Exercicio2$5
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _number2;
        int _number3;

        //#endregion

        System.out.print( "Digite o primeiro numero: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o segundo numero: " );
        _number2 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o terceiro numero: " );
        _number3 = Integer.parseInt( scanner.nextLine() );

        if(_number1 >= _number2 && _number2 >= _number3)
        {
            System.out.printf( "%d >= %d >= %d", _number1, _number2, _number3 );
        }
        else if(_number1 >= _number3 && _number3 >= _number2)
        {
            System.out.printf( "%d >= %d >= %d", _number1, _number3, _number2 );
        }
        else if(_number2 >= _number1 && _number1 >= _number3)
        {
            System.out.printf( "%d >= %d >= %d", _number2, _number1, _number3 );
        }
        else if(_number2 >= _number3 && _number3 >= _number1)
        {
            System.out.printf( "%d >= %d >= %d", _number2, _number3, _number1 );
        }
        else if(_number3 >= _number2 && _number2 >= _number1)
        {
            System.out.printf( "%d >= %d >= %d", _number3, _number2, _number1 );
        }
        else
        {
            System.out.printf( "%d >= %d >= %d", _number3, _number1, _number2 );
        }


        scanner.close();
    }   
}
