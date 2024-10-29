import java.util.Scanner;

public class Exercicio2$12 
{
    public static void main(String[] args) 
    {
        //#region Variaveis 
        
        Scanner scanner = new Scanner( System.in );

        int _womanBirth1;
        int _womanBirth2;
        int _menBirth1;
        int _menBirth2;
        int _mult;
        int _adic;

        //#endregion

        System.out.print("Digite a idade do primeiro homem: ");
        _menBirth1 = Integer.parseInt( scanner.nextLine() );

        System.out.print("Digite a idade do segundo homem: ");
        _menBirth2 = Integer.parseInt( scanner.nextLine() );

        System.out.print("Digite a idade da primeira mulher: ");
        _womanBirth1 = Integer.parseInt( scanner.nextLine() );

        System.out.print("Digite a idade da sagunda mulher: ");
        _womanBirth2 = Integer.parseInt( scanner.nextLine() );

        if(_menBirth1 > _menBirth2 && _womanBirth1 < _womanBirth2)
        {
            _adic = _menBirth1 + _womanBirth1;
            _mult = _menBirth2 * _womanBirth2;

            System.out.printf("Idade homem mais velho + idade mulher mais nova: %d\n", _adic);
            System.out.printf("Idade homem mais novo * idade mulher mais velha: %d\n", _mult);
        }
        else if(_menBirth1 > _menBirth2 && _womanBirth2 < _womanBirth1)
        {
            _adic = _menBirth1 + _womanBirth2;
            _mult = _menBirth2 * _womanBirth1;

            System.out.printf("Idade homem mais velho + idade mulher mais nova: %d\n", _adic);
            System.out.printf("Idade homem mais novo * idade mulher mais velha: %d\n", _mult);
        }
        else if(_menBirth2 > _menBirth1 && _womanBirth1 < _womanBirth2)
        {   
            _adic = _menBirth2 + _womanBirth1;
            _mult = _menBirth1 * _womanBirth2;

            System.out.printf("Idade homem mais velho + idade mulher mais nova: %d\n", _adic);
            System.out.printf("Idade homem mais novo * idade mulher mais velha: %d\n", _mult);

        }
        else if(_menBirth2 > _menBirth1 && _womanBirth2 < _womanBirth1)
        {
            _adic = _menBirth2 + _womanBirth2;
            _mult = _menBirth1 * _womanBirth1;

            System.out.printf("Idade homem mais velho + idade mulher mais nova: %d\n", _adic);
            System.out.printf("Idade homem mais novo * idade mulher mais velha: %d\n", _mult);

        }

        scanner.close();
    }    
}
