import java.util.Scanner;

public class Exercicio2$19
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double _temperature;
        double _tempConvert;
        String _choise;


        //#endregion

        System.out.print( "\n\tDigite (C) ou (c) para converter Celsius para Fahrenheit\n\tDigite (F) ou (f) para converter Fahrenheit para Celsius");
        
        System.out.print("\n\nEscolha sua opção com base no menu acima: ");
        _choise = scanner.nextLine();

        switch (_choise) 
        {
            case "F":
                
                System.out.print("\nDigite a temperatura em graus Fahrenheit: ");
                _temperature = Double.parseDouble( scanner.nextLine() );

                _tempConvert = (_temperature - 32) /1.8 ;

                System.out.printf( "%.2f graus Fahrenheit correspondem a %.2f graus Celsius\n", _temperature, _tempConvert );
               

            break;

            case "f":

                System.out.print("\nDigite a temperatura em graus Fahrenheit: ");
                _temperature = Double.parseDouble( scanner.nextLine() );

                _tempConvert = (_temperature - 32) /1.8 ;

                System.out.printf( "%.2f graus Fahrenheit correspondem a %.2f graus Celsius\n", _temperature, _tempConvert );

            break;

            case "c":

                System.out.print("\nDigite a temperatura em graus Celsius: ");
                _temperature = Double.parseDouble( scanner.nextLine() );

                _tempConvert = (1.8 * _temperature) + 32 ;

                System.out.printf( "%.2f graus Celsius correspondem a %.2f graus Fahrenheit\n", _temperature, _tempConvert );

            break;

            case "C":

                System.out.print("\nDigite a temperatura em graus Celsius: ");
                _temperature = Double.parseDouble( scanner.nextLine() );

                _tempConvert = (1.8 * _temperature) + 32 ;

                System.out.printf( "%.2f graus Celsius correspondem a %.2f graus Fahrenheit\n", _temperature, _tempConvert );

            break;
                    
            default:

                System.out.print("Opcao invalida!\n");

            break;
        }

        scanner.close();
    }
}
