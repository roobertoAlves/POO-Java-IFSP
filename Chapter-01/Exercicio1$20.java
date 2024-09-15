import java.util.Scanner;

public class Exercicio1$20 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _number2;
        int _media;

        //#endregion

        System.out.print( "Digite a primeira nota: ");
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digte a segunda nota: ");
        _number2 = Integer.parseInt( scanner.nextLine() );

        _media = (_number1 + _number2) / 2;

        System.out.printf( "Media aritmetica: %d\n", _media);

        scanner.close();
    }
}
