import java.util.Scanner;

public class Exercicio2$14 
{
    public static void main(String[] args) 
    {
        //#region Variaveis

        Scanner scanner = new Scanner( System.in );

        double _height;
        double _weight;
        double _imc;
        
        //#endregion

        System.out.print( "Digite seu peso em quilogramas: " );
        _weight = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite sua altura em metros: " );
        _height = Double.parseDouble( scanner.nextLine() );


        _imc = _weight/(_height * _height);

        if(_imc < 17)
        {
            System.out.printf( "IMC: %.2f\n", _imc );
            System.out.printf( "Voce esta muito abaixo do peso ideal!\n" ); 
        }
        else if(_imc >= 17 && _imc < 18.5)
        {
            System.out.printf( "IMC: %.2f\n", _imc );
            System.out.printf( "Voce esta abaixo do peso ideal!\n" ); 
        }
        else if(_imc >= 18.5 && _imc < 25)
        {
            System.out.printf( "IMC: %.2f", _imc );
            System.out.printf( "Parabens! Voce esta em seu peso normal!\n" ); 
        }
        else if(_imc >= 25 && _imc < 30)
        {
            System.out.printf( "IMC: %.2f\n", _imc );
            System.out.printf( "Atencao, voce esta acima de seu peso (sobrepeso)!\n" ); 
        }
        else if(_imc >= 30 && _imc < 35)
        {
            System.out.printf( "IMC: %.2f\n", _imc );
            System.out.printf( "Cuidado! Obesidade grau I!\n" ); 
        }
        else if(_imc >= 35 && _imc  < 40)
        {
            System.out.printf( "IMC: %.2f\n", _imc );
            System.out.printf( "Cuidado! Obesidade grau II!\n" ); 
        }
        else
        {
            System.out.printf( "IMC: %.2f\n", _imc );
            System.out.printf( "Muito cuidado!!! Obesidade grau III!\n" ); 
        }
        scanner.close();
    }
}
