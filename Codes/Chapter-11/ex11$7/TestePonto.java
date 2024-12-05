import java.util.Scanner;

public class TestePonto 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _xCord;
        double _yCord;

        //#endregion

        System.out.println( "Ponto 1: " );
        System.out.print( "\n\tDigite a coordenada X:" );
        _xCord = Double.parseDouble( scanner.nextLine() );

        System.out.print( "\n\tDigite a coordenada Y:" );
        _yCord = Double.parseDouble( scanner.nextLine() );

        Ponto _ponto = new Ponto( _xCord, _yCord );

        System.out.println( "Ponto 2: " );
        System.out.print( "\n\tDigite a coordenada X:" );
        _xCord = Double.parseDouble( scanner.nextLine() );

        System.out.print( "\n\tDigite a coordenada Y:" );
        _yCord = Double.parseDouble( scanner.nextLine() );

        Ponto _ponto2 = new Ponto( _xCord, _yCord );

        System.out.println( _ponto2 );

        scanner.close();
    }
}
