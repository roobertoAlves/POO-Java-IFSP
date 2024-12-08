import java.util.Scanner;

public class TesteData 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _year;
        int _month;
        int _day;

        //#endregion

        System.out.print( "Digite o dia: " );
        _day = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o mes: " );
        _month = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o ano: ");
        _year = Integer.parseInt( scanner.nextLine() );

        Data _data = new Data( _day, _month, _year );

        System.out.println( _data );

        scanner.close();
    }
    
}
