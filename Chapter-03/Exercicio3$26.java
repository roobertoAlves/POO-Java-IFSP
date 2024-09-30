import java.util.Scanner;

public class Exercicio3$26 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number;
        int _small = 0;
        int _big = 0;

        boolean _firstNumber = true;

        //#endregion
        

        do {
            System.out.print( "Digite um numero: " );
            _number = Integer.parseInt( scanner.nextLine() );


            if(_number >= 0)
            {
                if(_firstNumber)
                {
                    _small = _number;
                    _big = _number;
                    _firstNumber = false;
                }
                else
                {
                    if(_number < _small)
                    {
                        _small = _number;
                    }

                    if(_number > _big)
                    {
                        _big = _number;
                    }
                }
            }
            
        } while (_number >= 0);


        System.out.printf( "Menor numero: %d\n", _small );
        System.out.printf( "Maior numero: %d", _big );

        scanner.close();
    }    
}
