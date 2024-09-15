import java.util.Scanner;

public class Exercicio1$25 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _fahrTemp;
        double _celsiusTemp;

        //#endregion

        System.out.print( "Digite a temperatura em Fahrenheit: ");
        _fahrTemp = Integer.parseInt( scanner.nextLine() );

        _celsiusTemp = (_fahrTemp - 32)/1.8;

        System.out.printf( "%.2f graus Fahrenheit correspondem a %.2f graus Celsius", _fahrTemp, _celsiusTemp );
        
        scanner.close();
    }
}
