import java.util.Scanner;

public class Exercicio3$14 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _number2;   

        int _sum = 0;

        //#endregion

        System.out.print( "Digite o primeiro numero: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o segundo numero: " );
        _number2 = Integer.parseInt( scanner.nextLine() );


        if(_number1 >= _number2)
        {
            for( int i = _number2; i <= _number1; i++)
            {
                _sum += i;
            }     

            System.out.printf( "Somatorio entre %d e %d: %d", _number2, _number1, _sum );
        }
        else
        {
            for( int j = _number1; j <= _number2; j++)
            {
                _sum += j;
            }     

            System.out.printf( "Somatorio entre %d e %d: %d", _number1, _number2, _sum );
        }


        scanner.close();
    
    }    
}
