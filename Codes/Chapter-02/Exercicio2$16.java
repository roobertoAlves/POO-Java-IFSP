import java.util.Scanner;

public class Exercicio2$16
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number;
        int _unit;
        int _tens;
        int _hundred;
        int _thousand;

        //#endregion

        System.out.print( "Digite um número: " );
        _number = Integer.parseInt( scanner.nextLine() );


        if(_number >= 1 && _number <= 3999)
        {
        
            System.out.printf("%d = ", _number);


            _thousand = _number / 1000;
            _number = _number % 1000;

            _hundred = _number / 100;
            _number = _number % 100;

            _tens = _number / 10;
            _unit = _number % 10;


            //#region Milhar

            if( _thousand == 1 )
            {
                System.out.print( "M" );
            }
            else if( _thousand == 2 )
            {
                System.out.print( "MM" );
            }
            else if( _thousand == 3 )
            {
                System.out.print( "MM" );
            }

            //#endregion

            //#region Centena

            if( _hundred == 1 )
            {
                System.out.print( "C" );
            }
            else if( _hundred == 2 )
            {
                System.out.print( "CC" );
            }
            else if( _hundred == 3 )
            {
                System.out.print( "CCC" );
            }
            else if( _hundred == 4 )
            {   
                System.out.print( "CD" );
            }
            else if( _hundred == 5 )
            {
                System.out.print( "D" );
            }
            else if( _hundred == 6 )
            {
                System.out.print( "DC" );
            }
            else if( _hundred == 7 )
            {
                System.out.print( "DCC" );
            }
            else if( _hundred == 8 )
            {
                System.out.print( "DCCC" );
            }
            else if( _hundred == 9 )
            {
                System.out.print( "CM" );
            }

            //#endregion

            //#region Dezena

            if( _tens == 1 )
            {
                System.out.print( "X" );
            }
            else if( _tens == 2 )
            {
                System.out.print( "XX" );
            }
            else if( _tens == 3 )
            {
                System.out.print( "XXX" );
            }   
            else if( _tens == 4 )
            {
                System.out.print( "XL" );
            }
            else if( _tens == 5 )
            {
                System.out.print( "L" );
            }
            else if( _tens == 6 )
            {
                System.out.print( "LX" );
            }
            else if( _tens == 7 )
            {
                System.out.print( "LXX" );
            }
            else if( _tens == 8 )
            {
                System.out.print( "LXXX" );
            }
            else if( _tens == 9 )
            {
                System.out.print( "XC" );
            }

            //#endregion

            //#region Unidade

            if( _unit == 1 )
            {
                System.out.print( "I" );
            }
            else if( _unit == 2 )
            {
                System.out.print( "II" ); 
            }
            else if( _unit == 3 )
            {
                System.out.print( "III" );
            }
            else if( _unit == 4 )
            {
                System.out.print( "IV" );
            }
            else if( _unit == 5 )
            {
                System.out.print( "V" );    
            }
            else if( _unit == 6 )
            {
                System.out.print( "VI" );
            }
            else if( _unit == 7 )
            {
                System.out.print( "VII" ); 
            }
            else if( _unit == 8 )
            {
                System.out.print( "VIII" );
            }
            else if( _unit == 9 )
            {  
                System.out.print( "IX" );
            }

            //#endregion

        }
        else
        {
            System.out.printf("Numero incorreto!");
        }

        scanner.close();


    }
}
