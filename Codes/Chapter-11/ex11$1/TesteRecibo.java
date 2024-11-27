import java.util.Scanner;

public class TesteRecibo 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        String _id;
        String _description;
        int _quantity;
        double _price;

        //#endregion

        System.out.print( "Digite o identificado do produto: " );
        _id = scanner.nextLine();

        System.out.print( "Digite a descricao do produto: " );
        _description = scanner.nextLine();

        System.out.print( "Digite a quantidade de produtos : ");
        _quantity = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Digite o preco unitario do produto: " );
        _price = Double.parseDouble( scanner.nextLine() );

        Recibo _recibo = new Recibo(_id, _description, _quantity, _price);

        System.out.println( _recibo );

        scanner.close();
    }   

}
