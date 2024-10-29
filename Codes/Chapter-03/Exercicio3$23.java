import java.util.Scanner;

public class Exercicio3$23 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _grades;

        double _gradesTotal = 0;
        double _media = 0;

        //#endregion

        for(int i = 1; i <= 10; i++)
        {
            System.out.printf( "Digite a nota %02d: ", i );
            _grades = Double.parseDouble( scanner.nextLine() );

            _gradesTotal += _grades;

            _media = _gradesTotal / 10;

        }

        System.out.printf( "A media aritmetica das dez notas e: %.2f", _media );
        

        scanner.close();

    }    
}
