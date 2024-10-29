import java.util.Scanner;

public class Exercicio3$25 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _number;
        double _media = 0;
        double _sum = 0;

        int _quantity = 0;

        //#endregion

        int i = 0;

        do {
            
            System.out.print("Digite um valor: ");
            _number = Double.parseDouble( scanner.nextLine() );

            if(_number > 0)
            {
                _sum += _number;
                _quantity++;
                i++;
            }

        } while (_number > 0);

        if(i > 0)
        {
            _media = _sum / i;
        }
        else 
        {
            _media = 0;
        }

        System.out.printf( "Somatorio: %.2f\n", _sum );
        System.out.printf( "Media: %.2f\n", _media );
        System.out.printf( "Quantidade: %d", _quantity );

        scanner.close();
    }    
}
