import java.util.Scanner;

public class Exercicio2$16
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number;
        String _roman = "";
        int _originalNumber;

        //#endregion

        System.out.print( "Digite um número: " );
        _originalNumber = Integer.parseInt( scanner.nextLine() );

        _number = _originalNumber;

        if(_number >= 1 && _number <= 3999)
        {
        
            System.out.printf("%d = %s" , _originalNumber, _roman);
        }
        else
        {
            System.out.printf("Numero incorreto!");
        }

        scanner.close();
    }
}
