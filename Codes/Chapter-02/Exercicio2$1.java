import java.util.Scanner;

public class Exercicio2$1 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner ( System.in );

        int _number;

        //#endregion


        System.out.print( "Digite um numero: " );
        _number = Integer.parseInt( scanner.nextLine() );

        if(_number % 2 == 0)
        {
            System.out.printf("O numero %d e par.", _number);
        }
        else
        {
            System.out.printf("O numero %d e impar.", _number);
        }

        scanner.close();
    }    
}
