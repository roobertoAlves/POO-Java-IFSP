import java.util.Scanner;

public class Exercicio3$17
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _term;

        int _a = 1;
        int _b = 0;
        int _temp = 0;

        //#endregion

        System.out.print( "Termo desejado da sequência de fibonacci: ");
        _term = Integer.parseInt( scanner.nextLine() );


        for(int i = 0; i < _term; i++)
        {
            _temp = _b + _a;
            _b = _a;
            _a = _temp;

        }

        System.out.printf( "Fibonacci de %d e %d", _term, _a );


        scanner.close();

    }    
}
