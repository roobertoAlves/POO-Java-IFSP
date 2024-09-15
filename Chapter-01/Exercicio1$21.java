import java.util.Scanner;

public class Exercicio1$21 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number;
        int _sucessor;
        int _antSec;

        //#endregion

        System.out.print( "Digite um número: ");
        _number = Integer.parseInt( scanner.nextLine() );

        _sucessor = _number + 1;
        _antSec = _number - 1;

        System.out.printf( "Sucessor de %d: %d\n", _number, _sucessor );
        System.out.printf( "Antecessor de %d: %d\n", _number, _antSec );
            
        scanner.close();
    }
}
