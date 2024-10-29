import java.util.Scanner;

public class Exercicio3$29 {
    public static void main(String[] args) {
        //#region Variaveis

        Scanner scanner = new Scanner(System.in);
        int _num1;
        int _num2;
        int _div;
        String _option;
        

        //#endregion
        do {
            System.out.print("N1: ");
            _num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("N2: ");
            _num2 = Integer.parseInt(scanner.nextLine());

            if (_num2 == 0) 
            {
                System.out.println("Nao existe divisao inteira por zero!");

                while (_num2 == 0) 
                {
                    System.out.print("Entre novamente com N2: ");
                    _num2 = Integer.parseInt(scanner.nextLine());

                    if(_num2 == 0)
                    {
                        System.out.println("Nao existe divisao inteira por zero!");
                    }
                    
                }
            } 
            
            if(_num2 != 0)
            {
                _div = _num1 / _num2;

                System.out.printf("%d / %d = %d\n", _num1, _num2, _div);
            }

            System.out.print("Voce deseja realizar outro calculo? (S/N): ");
            _option = scanner.nextLine();

        } while (!_option.equalsIgnoreCase("N") && _option.equalsIgnoreCase("S")); 

        scanner.close();
    }
}
