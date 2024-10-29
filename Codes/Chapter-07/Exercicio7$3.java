import java.util.Scanner;

public class Exercicio7$3 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double [ ] _fUserInputArray = new double [ 5 ];
        double [ ] _sUserInputArray = new double [ 5 ];
        double total;
 
        //#endregion

            
        for( int i = 0; i < _fUserInputArray.length; i++ )
        {
            System.out.printf( "Digite o valor para o primeiro array[%d]: ",  i );
            _fUserInputArray[ i ] = Double.parseDouble( scanner.nextLine() );

            if( _fUserInputArray[ i ] < 0 )
            {
                do{
                    System.out.print( "Entre com um valor positivo!\n" );
    
                    System.out.printf( "Digite o valor para o primeiro array[%d]: ",  i );
                    _fUserInputArray[ i ] = Double.parseDouble( scanner.nextLine() );
    
                }while(_fUserInputArray[ i ] < 0);
            }



            System.out.printf( "Digite o valor para o segundo array[%d]: ",  i );
            _sUserInputArray[ i ] = Double.parseDouble( scanner.nextLine() );

            if( _sUserInputArray[ i ] < 0)
            {
                do{
                    System.out.print( "Entre com um valor positivo!\n" );
    
                    System.out.printf( "Digite o valor para o segundo array[%d]: ",  i );
                    _sUserInputArray[ i ] = Double.parseDouble( scanner.nextLine() );
    
                }while(_sUserInputArray[ i ] < 0);
    
            }
        }   

        System.out.println();

        for( int i = 0; i < _fUserInputArray.length; i++ )
        {
            total = GreatherNumber( _fUserInputArray[ i ], _sUserInputArray[ i ] );

            if(total == -1)
            {
                System.out.printf( "%.2f, %.2f: Eles sao iguais\n", _fUserInputArray[ i ], _sUserInputArray[ i ] );
            }
            else
            {
                System.out.printf( "%.2f, %.2f: O maior valor e %.2f\n", _fUserInputArray[ i ], _sUserInputArray[ i ], GreatherNumber(_fUserInputArray[ i ], _sUserInputArray[ i ]) );
            }
        }

        scanner.close();
    }  
   

    public static double GreatherNumber( double x, double y )
    {
        if( x == y )
        {
            return -1;
        }

        return (x > y ) ? x : y;
    }
}
