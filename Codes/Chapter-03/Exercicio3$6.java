import java.util.Scanner;

public class Exercicio3$6 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _number1;

        //#endregion

        System.out.printf( "Digite um número positivo: " );
        _number1 = Integer.parseInt( scanner.nextLine() );


        if(_number1 < 0)
        {
            System.out.print( "Valor incorreto (negativo)" );
        }
        else
        {
            for(int i = _number1; i >= 0; i--)
            {
                System.out.printf( "%d ", i );
            }
        }

        scanner.close();
    }    
}
