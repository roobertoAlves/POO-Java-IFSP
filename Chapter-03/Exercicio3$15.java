import java.util.Scanner;

public class Exercicio3$15 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number;

        int _fac = 1;

        //#endregion

        System.out.print( "Digite um numero positivo: " );
        _number = Integer.parseInt( scanner.nextLine() );


        if(_number >= 0)
        {
            for(int i = _number; i >= 1; i--)
            {
                _fac *= i;
            }

            System.out.printf( "%d! = %d", _number, _fac );
        }
        else
        {
            System.out.print( "Nao ha fatorial de numero negativo." );
        }


        scanner.close();

    }    
}
