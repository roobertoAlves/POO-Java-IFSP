import java.util.Scanner;

public class Exercicio3$28 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _inicialValue;
        double _atualValue;
        double _withdraw;
        double _deposit;
        int _option;

        //#endregion

        System.out.print( "\nDigite o saldo inicial da sua conta: " );
        _inicialValue = Double.parseDouble( scanner.nextLine() );

        _atualValue = _inicialValue;

        do {

            System.out.println( "\nOperacoes\n\t Digite (1) para depositar;\n\t Digite (2) para sacar\n\t Digite (3) para encerrar o programa" );

            System.out.print( "\nDigite a operacao desejada: " );
            _option = Integer.parseInt( scanner.nextLine() );

            switch (_option) {

                case 1:

                        System.out.print( "Valor a depositar: " );
                        _deposit = Double.parseDouble( scanner.nextLine() );

                        _atualValue += _deposit;
                    
                    break;

                case 2:

                        System.out.print( "Valor a sacar: " );
                        _withdraw = Double.parseDouble( scanner.nextLine() );

                        _atualValue -= _withdraw;

                    break;

                case 3: 

                    break;
            
                default:

                        System.out.println("Operacao invalida");

                    break;
            }

        } while (_option != 3);



        if(_atualValue == 0)
        {
            System.out.printf("Saldo final: R$%.2f\n", _atualValue);
            System.out.println( "Sem saldo." );
        }
        else if(_atualValue > 0)
        {
            System.out.printf("Saldo final: R$%.2f\n", _atualValue);
            System.out.println( "Conta preferencial." );
        }
        else
        {
            _atualValue = _atualValue * -1;
            System.out.printf("Saldo final: -R$%.2f\n", _atualValue);
            System.out.println( "Conta devedora." );
        }


        scanner.close();

    }    
}
