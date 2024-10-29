import java.util.Scanner;

public class Exercicio3$27 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double _weight;
        double _totalWeight = 0;
        double _media;
        double _weighterP = 0;

        int i = 1;
        int x = 0;
        int y = 0;

        //#endregion

        do {
            
            System.out.printf( "Digite o peso da pessoa %02d: ", i );
            _weight = Double.parseDouble( scanner.nextLine() );

            if(_weight > 60)
            {
                _totalWeight += _weight;
                x++;
            }

            if(_weighterP < _weight)
            {
                _weighterP = _weight;
            }

            i++;

            if(_weight > 0)
            {
               y++; 
            }

        } while (_weight > 0);

        if(y > 0 && _totalWeight > 60) 
        {
            _media = _totalWeight / x;
        }
        else
        {
            _media = 0;  
        }

        System.out.printf( "Media dos pesos acima de 60kg: %.2f\n", _media );
        System.out.printf(  "A pessoa mais pesada possui %.2fkg",_weighterP );


        scanner.close();

    }    
}
