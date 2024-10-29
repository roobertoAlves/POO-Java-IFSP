import java.util.Scanner;

public class Exercicio1$12
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );    

        double _number;

        //#endregion

        System.out.print( "Forneça qualquer valor (em decimal): " );
        _number = Double.parseDouble( scanner.nextLine() );

        System.out.printf("%f\n", _number);
        System.out.printf("%.2f\n", _number);
        System.out.printf("%.3f\n", _number);

        scanner.close();
    }
}
