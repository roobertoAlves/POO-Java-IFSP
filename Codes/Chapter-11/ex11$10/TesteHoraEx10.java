import java.util.Scanner;

public class TesteHoraEx10
{

    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in ); 
        int _seconds;

        //#endregion


        System.out.print( "Digite os segundos: " );
        _seconds = Integer.parseInt( scanner.nextLine() );

        Hora _hora = new Hora( _seconds );

        System.out.println( _hora );

        scanner.close();
    }
    
}