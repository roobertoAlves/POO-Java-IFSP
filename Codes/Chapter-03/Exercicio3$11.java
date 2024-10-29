import java.util.Scanner;

public class Exercicio3$11
{
    public static void main(String[] args) 
    {

        //#region Variaveis

        Scanner scanner = new Scanner( System.in );
        
        int _number1;
        int _number2;

        //#endregion

        System.out.printf( "Digite o primeiro número: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.printf( "Digite o segundo número: " );
        _number2 = Integer.parseInt( scanner.nextLine() );

        if(_number1 <= _number2)
        {
            for(int i = _number1; i <= _number2; i++)
            {
                System.out.printf( "%d ", i );
            }
        }
        else
        {
            for(int j = _number1; j >= _number2; j--)
            {
                System.out.printf( "%d ", j );  
            }
        }

        scanner.close();

    }
}
