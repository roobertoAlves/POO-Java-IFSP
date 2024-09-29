import java.util.Scanner;

public class Exercicio3$21 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        int _height;

        //#endregion

        System.out.print( "Digite a altura do triângulo: " );
        _height = Integer.parseInt( scanner.nextLine() );

        if(_height >= 0)
        {
            for( int i = 1; i <= _height; i++ )
            {
                // Espaços
                for(int j = 5; j > i; j--)
                {
                    System.out.print(" ");
                }  
 
                // Asteriscos
 
                for( int k = 1; k <= i; k++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
        else
        {
            for( int x = 1; x <= (_height * -1); x++ )
            {
                for( int z = 1; z < x; z++)
                {
                    System.out.print(" ");
                }
                for( int y = 5; y >= x; y--)
                {
                    System.out.print("*");
                }
 
             System.out.println();
         }
        }
        
        scanner.close();
    }    
}
