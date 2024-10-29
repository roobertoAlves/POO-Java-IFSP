public class Exercicio3$20
{
    public static void main(String[] args) 
    {
        //#region Primeiro Desenho

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print( "*" );
            }
            
            System.out.println();
            
        }    

        //#endregion

        System.out.println();

        //#region Segundo Desenho

        for(int x = 5; x >= 1; x--)
        {
            for(int y = 1; y <= x; y++)
            {
                System.out.print( "*" );
            }
            
            System.out.println();
            
        }    

        //#endregion
        
        System.out.println();
        
        //#region Terceiro Desenho

        for( int i = 1; i <= 5; i++ )
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

        //#endregion

        System.out.println();

        //#region Quarto Desenho

        for( int x = 1; x <= 5; x++ )
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

        
        //#endregion
    }
}
