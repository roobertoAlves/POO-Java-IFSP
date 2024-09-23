import java.util.Scanner;

public class Exercicio2$18
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double _number1;
        double _number2;
        double _total;
        String _choise;

        //#endregion

        System.out.print( "Digite o primeiro numero: " );
        _number1 = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite o segundo numero: " );
        _number2 = Double.parseDouble( scanner.nextLine() );

        System.out.print( "\n\tDigite (+) para fazer uma adição\n\tDigite (-) para fazer uma adição\n\tDigite (*) para fazer uma multiplicação\n\tDigite (/) para fazer uma divisão");
        
        
        System.out.print("\n\nEscolha sua opção com base no menu acima: ");
        _choise = scanner.nextLine();

        switch (_choise) 
        {
            case "+":
                
                _total = _number1 + _number2;

                System.out.printf( "%.2f + %.2f = %.2f", _number1, _number2, _total );

            break;

            case "-":

                _total = _number1 - _number2;

                System.out.printf( "%.2f - %.2f = %.2f", _number1, _number2, _total );

            break;

            case "*":

                _total = _number1 * _number2;

                System.out.printf( "%.2f * %.2f = %.2f", _number1, _number2, _total );

            break;

            case "/":

                _total = _number1 / _number2;

                System.out.printf( "%.2f / %.2f = %.2f", _number1, _number2, _total );

            break;
                    
            default:

                System.out.print("Opcao invalida!\n");

            break;
        }

        scanner.close();
    }
}
