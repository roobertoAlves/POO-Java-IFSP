import java.util.Scanner;

public class Exercicio3$22 
{

    public static void main(String[] args) {
        
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _number1;
        int _number2;
        int _number3;
        int _number4;
        int _number5;

        int _biggest = 0;

        //#endregion


        System.out.print("Digite o primeiro numero: ");
        _number1 = Integer.parseInt( scanner.nextLine() );

        System.out.print("Digite o segundo numero: ");
        _number2 = Integer.parseInt( scanner.nextLine() );

        System.out.print("Digite o terceiro numero: ");
        _number3 = Integer.parseInt( scanner.nextLine() );

        System.out.print("Digite o quarto numero: ");
        _number4 = Integer.parseInt( scanner.nextLine() );

        System.out.print("Digite o quinto numero: ");
        _number5 = Integer.parseInt( scanner.nextLine() );


        if(_number1 > _biggest)
        {
            _biggest = _number1;
        }
        
        if(_number2 > _biggest)
        {
            _biggest = _number2;
        }
        if(_number3 > _biggest)
        {
            _biggest = _number3;
        }
        
        if(_number4 > _biggest)
        {
            _biggest = _number4;
        }
        if(_number5 > _biggest)
        {
            _biggest = _number5;
        }


        if(_number1 < 0 || _number2 < 0 || _number3 < 0 || _number4 < 0 || _number5 < 0)
        {
            System.out.println( "Forneca apenas numeros positivos." );
        }
        else
        {
            for(int i = _biggest; i >= 1; i--)
            {
                System.out.printf( "%04d  ", i );
                
                System.out.printf( "%c%c%c%c%c\n",
                    i <= _number1 ? '*' : ' ',
                    i <= _number2 ? '*' : ' ',
                    i <= _number3 ? '*' : ' ',
                    i <= _number4 ? '*' : ' ',
                    i <= _number5 ? '*' : ' '
                );  
            
            }
        }

        scanner.close();

    }
}
