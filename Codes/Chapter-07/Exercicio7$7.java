public class Exercicio7$7 
{
    public static void main(String[] args) 
    {
        for( int i = 1; i <= 20; i++ )
        {   
            if( IsAPrimeNumber(i) )
            {
                System.out.printf( "%d: eh primo\n", i );
            }
            else
            {
                System.out.printf( "%d: nao eh primo\n", i );
            }
        }
    }

    public static boolean IsAPrimeNumber( int x )
    {
        for( int i = 2; i <= Math.sqrt( x ); i++ )
        {
            if( x % i == 0)
            {
                return false;
            }
        }
        
        if(x <= 1)
        { 
            return false;
        }

        return true;
    }
}
