import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );
        
        int _number1;
        int _number2;

        //#endregion

        System.out.print( "Digite um numero: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "DIigte um segundo numero: " );
        _number2 = Integer.parseInt( scanner.nextLine() );

        if( _number1 == _number2 )
        {
            System.out.printf( "Ordem crescente: %d <= %d", _number1, _number2 );
        }
        else if(_number1 < _number2)
        {
            System.out.printf( "Ordem crescente: %d <= %d", _number1, _number2 );
        }
        else
        {
            System.out.printf( "Ordem crescente: %d <= %d", _number2, _number1 );
        }

        scanner.close();

    }
}