import java.util.Scanner;

public class Exercicio7$2 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double _radius;

        //#endregion

        System.out.print( "Digite a medida do raio do circulo: " );
        _radius = Double.parseDouble( scanner.nextLine() );

        System.out.printf( "Area = %.2f\n", CircleArea(_radius) );
        System.out.printf( "Circunferencia = %.2f", CircleCircunference(_radius) );

        scanner.close();
    }
    
    public static double CircleArea( double radius )
    {
        double area;

        area = Math.pow(radius, 2) * Math.PI;

        return area;
    }

    public static double CircleCircunference( double radius )
    {
        double circunference;

        circunference = 2 * Math.PI * radius;

        return circunference;
    }
}
