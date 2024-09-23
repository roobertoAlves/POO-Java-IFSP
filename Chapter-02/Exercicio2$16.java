import java.util.Scanner;

public class Exercicio2$16
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        int _number;
        String _roman = "";
        int _originalNumber;

        //#endregion

        System.out.print( "Digite um número: " );
        _originalNumber = Integer.parseInt( scanner.nextLine() );

        _number = _originalNumber;

        if(_number >= 1 && _number <= 3999)
        {
            if (_number >= 1000) 
            {
                if (_number >= 3000) 
                {
                    _roman += "MMM";
                    _number -= 3000;
                } 
                else if (_number >= 2000) 
                {
                    _roman += "MM";
                    _number -= 2000;
                } 
                else
                 {
                    _roman += "M";
                    _number -= 1000;
                }
            }

            // Centenas
            if (_number >= 100) 
            {
                if (_number >= 900) 
                {
                    _roman += "CM";
                    _number -= 900;
                } 
                else if (_number >= 500) 
                {
                    _roman += "D";
                    _number -= 500;
                } 
                else if (_number >= 400) 
                {
                    _roman += "CD";
                    _number -= 400;
                } 
                else if (_number >= 300) 
                {
                    _roman += "CCC";
                    _number -= 300;
                } 
                else if (_number >= 200) 
                {
                    _roman += "CC";
                    _number -= 200;
                } 
                else 
                {
                    _roman += "C";
                    _number -= 100;
                }
            }

            // Dezenas
            if (_number >= 10) 
            {
                if (_number >= 90) 
                {
                    _roman += "XC";
                    _number -= 90;
                } 
                else if (_number >= 50) 
                {
                    _roman += "L";
                    _number -= 50;
                } 
                else if (_number >= 40) 
                {
                    _roman += "XL";
                    _number -= 40;
                } 
                else if (_number >= 30) 
                {
                    _roman += "XXX";
                    _number -= 30;
                } 
                else if (_number >= 20) 
                {
                    _roman += "XX";
                    _number -= 20;
                } 
                else 
                {
                    _roman += "X";
                    _number -= 10;
                }
            }

            // Unidades
            if (_number >= 1) 
            {
                if (_number == 9) 
                {
                    _roman += "IX";
                } 
                else if (_number >= 5) 
                {
                    _roman += "V";
                    _number -= 5;
                } 
                else if (_number == 4) 
                {
                    _roman += "IV";
                } 
                else if (_number == 3) 
                {
                    _roman += "III";
                } 
                else if (_number == 2) 
                {
                    _roman += "II";
                } 
                else 
                {
                    _roman += "I";
                }
            }

            // Exibe o número _roman final
            System.out.printf("%d = %s" , _originalNumber, _roman);
        }
        else
        {
            System.out.printf("Numero incorreto!");
        }

        scanner.close();
    }
}
