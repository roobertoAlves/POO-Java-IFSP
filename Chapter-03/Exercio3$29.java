import java.util.Scanner;

public class Exercio3$29 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _number2;
        int _div;

        String _option;
        //#endregion

        System.out.print( "Digite o valor do primeiro número: " );
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o valor do segundo número: " );
        _number2 = Integer.parseInt( scanner.nextLine() );


        do
        {

            System.out.print( "Você deseja realizar outro calculo? (S/N): " );
            _option = scanner.nextLine();

            switch (_option) 
            {
                case 'S':
                    
                    break;

                case 's':
                    
                    break;

                default:
                    break;
            }

        } while( _option == 'n' || _option == 'N');
    }    
}
