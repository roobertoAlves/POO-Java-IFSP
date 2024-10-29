import java.util.*;

public class Exercicio1$7
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scan = new Scanner( System.in );
        int _sideValue;
        int _area;
        int _per;

        //#endregion
        
        System.out.print( "Digite o comprimento de um dos lados do quadrado: ");
        _sideValue = Integer.parseInt( scan.nextLine() );    

        _area = _sideValue * _sideValue;
        _per = 4 * _sideValue;

        System.out.printf( "Perimetro = %d\n", _per);
        System.out.printf( "Area = %d\n", _area );

            
        scan.close();
    }    
}
