import java.util.Scanner;

public class TesteHoraEx9 
{

    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _hours;
        int _minutes;
        int _seconds;

        //#endregion

        System.out.print( "Digite as horas: " );
        _hours = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite os minutos: " );
        _minutes = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite os segundos: " );
        _seconds = Integer.parseInt( scanner.nextLine() );

        Hora _hora = new Hora( _hours, _minutes, _seconds );

        System.out.println( _hora );

        scanner.close();
    }
    
}