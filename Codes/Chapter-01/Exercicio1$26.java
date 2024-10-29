import java.util.Scanner;

public class Exercicio1$26 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _fahrTemp;
        double _celsiusTemp;

        //#endregion

        System.out.print( "Digite a temperatura em Celsius: ");
        _celsiusTemp = Integer.parseInt( scanner.nextLine() );

        _fahrTemp = (1.8 * _celsiusTemp) + 32;

        System.out.printf( "%.2f graus Celsius correspondem a %.2f graus Fahrenheit", _celsiusTemp, _fahrTemp );
        
        scanner.close();
    }  
}
