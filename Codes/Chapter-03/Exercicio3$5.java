import java.util.*;

public class Exercicio3$5 
{
    public static void main(String[] args) 
    {
        //#region Variveis

        Scanner scanner = new Scanner( System.in );

        int _number1;

        //#endregion


        System.out.print( "Digite um número: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        if(_number1 < 0)
        {
            System.out.print( "Valor incorreto (negativo)" );
        }
        else
        {
            for(int i = 0; i <= _number1; i++)
            {
                System.out.printf("%d ", i );
            }
        }

        scanner.close();
    }    
}
