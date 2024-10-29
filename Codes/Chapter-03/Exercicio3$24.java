import java.util.Scanner;

public class Exercicio3$24 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _years;

        int _oldP = 0;
        int _youngP = 0;

        //#endregion

        int i = 1;
        do {
            
            System.out.printf("Idade da pessoa %02d: ",i);
            _years = Integer.parseInt( scanner.nextLine() );

            if(_years <= 21 && _years > 0)
            {
                _youngP++;
            }

            if(_years >= 50)
            {
                _oldP++;
            }

            i++;

        } while (_years > 0);

        System.out.printf( "Total de pessoas menores de 21 anos: %d\n", _youngP );
        System.out.printf( "Total de pessoas com mais de 50 anos: %d", _oldP );


        scanner.close();

    }    
}
