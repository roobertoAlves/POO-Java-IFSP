import java.util.*;

public class Exercicio1$9 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );
        int _area;
        int _base;
        int _height;

        //#endregion

        System.out.print("Digite o comprimento da altura do triângulo: ");    
        _height = Integer.parseInt( scanner.nextLine() );

        System.out.print("Digite o comprimento da base do triângulo: ");    
        _base = Integer.parseInt( scanner.nextLine() );

        _area = (_base * _height)/2;

        System.out.printf( "Area = %d\n", _area );

            
        scanner.close();
    }    
}
