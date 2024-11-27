import java.util.Scanner;

public class TesteEmpregado 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        String _name;
        String _surname;
        double _salary;

        //#endregion

        System.out.print( "Digite seu nome: " );
        _name = scanner.nextLine();

        System.out.print( "Digite seu sobrenome: " );
        _surname = scanner.nextLine();

        System.out.print( "Digite seu salario: ");
        _salary = Double.parseDouble( scanner.nextLine() );

        Empregado _empregado = new Empregado(_name, _surname, _salary);

        _empregado.GiveIncrease();

        System.out.println( _empregado );

        scanner.close();
    }
}
