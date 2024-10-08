import java.util.Scanner;

public class Exercicio3$21 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner(System.in);
        int _height;

        //#endregion

        System.out.print("Digite a altura do triangulo: ");
        _height = Integer.parseInt(scanner.nextLine());

        scanner.close();

        if (_height == 0)
        {
            return; 
        }

        if (_height > 0)
        {
            // Triângulo normal (de base para cima)
            for (int i = 1; i <= _height; i++)
            {
                for (int j = 1; j <= _height - i; j++)
                {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        {
            // Triângulo invertido (de cabeça para baixo)
            _height = -_height;
            for (int i = _height; i >= 1; i--)
            {
                for (int j = 1; j <= _height - i; j++)
                {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
