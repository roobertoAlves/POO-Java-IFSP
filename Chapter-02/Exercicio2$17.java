import java.util.Scanner;

public class Exercicio2$17 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _number;

        //#endregion

        System.out.print( "Digite um numero inteiro: " );
        _number = Integer.parseInt( scanner.nextLine() );

        switch (_number) 
        {
            case 2:

                System.out.printf( "O valor fornecido foi %d.\n", _number );

            break;
            
            case 4:

                System.out.printf( "O valor fornecido foi %d.\n", _number );

            break;

            case 6:

                System.out.printf( "O valor fornecido foi %d.\n", _number );

            break;

            case 8:

                System.out.printf( "O valor fornecido foi %d.\n", _number );
            
            break;

            default:

                System.out.printf( "Valor invalido." );

            break;
        }

        scanner.close();
    }
}
