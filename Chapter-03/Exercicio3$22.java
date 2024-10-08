import java.util.Scanner;

public class Exercicio3$22 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner(System.in);
        int _number1; 
        int _number2;
        int _number3;
        int _number4;
        int _number5;

        //#endregion

        
        System.out.print("Digite o primeiro numero: ");
        _number1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o segundo numero: ");
        _number2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o terceiro numero: ");
        _number3 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o quarto numero: ");
        _number4 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o quinto numero: ");
        _number5 = Integer.parseInt(scanner.nextLine());

        scanner.close();

        if (_number1 < 0 || _number2 < 0 || _number3 < 0 || _number4 < 0 || _number5 < 0)
        {
            System.out.println("Forneca apenas numeros positivos.");
        }
        else
        {
            // Desenhar gráfico de barras com asteriscos
            for (int i = 10; i >= 1; i--) 
            {
                System.out.printf("%04d  ", i);

                if (_number1 >= i) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }

                
                if (_number2 >= i) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }

                
                if (_number3 >= i) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }

                
                if (_number4 >= i) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }

                
                if (_number5 >= i) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }

                System.out.println();
            }
        }
    }
}
