import java.util.Scanner;

public class Exercicio1$23 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _bornYear;
        int _currentYear;
        int _currentAge;

        //#endregion

        System.out.print( "Digite o seu ano de nascimento: " );
        _bornYear = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o ano atual: " );
        _currentYear = Integer.parseInt( scanner.nextLine() );

        _currentAge = _currentYear - _bornYear;

        System.out.printf( "Idade aproximada: %d anos", _currentAge );
            
        scanner.close();
    }    
}
