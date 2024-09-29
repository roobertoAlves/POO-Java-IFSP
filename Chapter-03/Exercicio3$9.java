import java.util.Scanner;

public class Exercicio3$9 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _mult;

        //#endregion

        System.out.print( "Digite um número para realizar a tabuada do mesmo: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        for(int i = 0; i <= 10; i++)
        {
            _mult = _number1 * i;

            System.out.printf( "%d x %d = %d\n", _number1, i, _mult );
        }
    
        scanner.close();
    }    
}
