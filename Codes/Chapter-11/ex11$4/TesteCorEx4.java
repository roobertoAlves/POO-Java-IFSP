import java.util.Scanner;

public class TesteCorEx4
{
    public static void main(String[] args) 
    {
     
        //#region Variaveis
    
        Scanner scanner = new Scanner( System.in );

        int _red;
        int _green; 
        int _blue;

        //#endregion 

        System.out.print( "Digite a porcentagem de vermelho: " );
        _red = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite a porcentagem de verde: " );
        _green = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite a porcentagem de azul: " );
        _blue = Integer.parseInt( scanner.nextLine() );

        Cor _cor = new Cor(_red, _green, _blue);


        System.out.println( _cor );

        scanner.close();
    }
}
