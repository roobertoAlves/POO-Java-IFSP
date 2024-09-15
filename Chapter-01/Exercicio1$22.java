import java.util.Scanner;

public class Exercicio1$22 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double _price;
        double _totalPrice;

        //#endregion
        
        System.out.printf( "Digite o preço do produto: ");
        _price = Double.parseDouble( scanner.nextLine() );

        _totalPrice = _price * 0.91;

        System.out.printf( "Preco de venda com 9%% de desconto: %.2f ", _totalPrice);

        scanner.close();
    }    
}
