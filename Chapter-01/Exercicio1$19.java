import java.util.Scanner;

public class Exercicio1$19 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double _radius;
        double _area;
        double _diameter;
        double _circunference;
        double pi = 3.141592;

        //#endregion
        
        System.out.print( "Digite o valor do raio do circulo(em decimal): " );
        _radius = Double.parseDouble( scanner.nextLine() );    
        
        _area = pi * (_radius * _radius);
        _diameter = 2 * _radius;
        _circunference = 2 * pi * _radius;
        
        System.out.printf( "Diametro = %.2f\n", _diameter );
        System.out.printf( "Circunferencia = %.2f\n", _circunference );
        System.out.printf( "Area = %.2f\n", _area );


        scanner.close();
    }

}
