import java.util.Scanner;

public class Exercicio4$11 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );
        
        int[] _userInputArray = new int[ 10 ];
        
        int _quantity;
        int _firstNumber;

        //#endregion

        do
        {
            System.out.print( "Quantidade de elementos (1 a 9): " );
            _quantity = Integer.parseInt( scanner.nextLine() );
           
            if (_quantity >= 1 && _quantity <= 9) 
            {
                break;
            } 
            else 
            {
                System.out.println( "Quantidade incorreta, forneca novamente!" );
            }

        }while(_quantity < 1 || _quantity > 9);
        
        for ( int i = 0; i < _quantity; i++ )  
        {
            System.out.printf( "Digite o valor para o array[%d]: ", i );
            _userInputArray[i] = Integer.parseInt( scanner.nextLine() );
        }
        
        System.out.println();

        System.out.print( "Valor que será inserido: " );
        _firstNumber = Integer.parseInt( scanner.nextLine() );
        
        
        //Deslocando os elementos do array

        for ( int i = _quantity; i > 0; i-- ) 
        {
            _userInputArray[ i ] = _userInputArray[ i - 1 ];
        }
        
        _userInputArray[0] = _firstNumber;
    
        //Exibindo

        for (int i = 0; i < _quantity + 1; i++) 
        {
            System.out.printf( "array[%d] = %d\n", i, _userInputArray[ i ] );
        }
        
        scanner.close();
    }
}
