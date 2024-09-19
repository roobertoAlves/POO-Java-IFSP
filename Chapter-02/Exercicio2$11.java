import java.util.Scanner;

public class Exercicio2$11 
{
    public static void main(String[] args)
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _betaAn;
        double _alfaAn;
        double _gamaAn;

        //#endregion

        System.out.print("Digite o valor do ângulo Alfa: ");
        _alfaAn = Double.parseDouble( scanner.nextLine() );

        System.out.print("Digite o valor do ângulo Beta: ");
        _betaAn = Double.parseDouble( scanner.nextLine() );

        System.out.print("Digite o valor do ângulo Gama: ");
        _gamaAn = Double.parseDouble( scanner.nextLine() );

        if( _betaAn + _alfaAn + _gamaAn == 180)
        {
            if(_alfaAn == 90 && _betaAn != 0 && _gamaAn != 0|| _betaAn == 90 && _alfaAn != 0 && _gamaAn != 0|| _gamaAn == 90 && _betaAn != 0 && _alfaAn != 0)
            {
                System.out.printf( "Triangulo RETANGULO" );
            }
            else if(_alfaAn == 90 && _betaAn != 0 && _gamaAn != 0|| _betaAn == 90 && _alfaAn != 0 && _gamaAn != 0|| _gamaAn == 90 && _betaAn != 0 && _alfaAn != 0)
        }
        else
        {
            System.out.printf( "As medidas fornecidas dos angulos nao representam um triangulo valido!" );
        }
    }    
}
