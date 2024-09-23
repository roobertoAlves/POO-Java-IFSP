import java.util.Scanner;

public class Exercicio2$15 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _years;

        //#endregion
        
        System.out.print( "Digite sua idade: " );
        _years = Integer.parseInt( scanner.nextLine() );

        if(_years < 16)
        {
            System.out.printf( "Nao eleitor.\n" );
        }
        else if(_years >= 18 && _years <= 65)
        {
            System.out.printf( "Eleitor obrigatorio.\n" );
        }
        else
        {
            System.out.printf( "Eleitor facultativo.\n" );
        }
    
        scanner.close();
    }    
}
