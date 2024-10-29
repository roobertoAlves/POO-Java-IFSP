import java.util.Scanner;

public class Exercicio1$24 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _inss;
        double _inssDescont;
        double _liqSalary;
        double _brutSalary;
        int _classQuant;
        double _hourPerClass;

        //#endregion

        System.out.print( "Digite o valor da hora/aula: " );
        _hourPerClass = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Quantidade de aulas: " );
        _classQuant = Integer.parseInt( scanner.nextLine() );

        System.out.print( "Porcentagens de desconto de INSS: " );
        _inss = Double.parseDouble( scanner.nextLine() );

        _brutSalary = _hourPerClass * _classQuant;
        _inssDescont = _brutSalary * (_inss / 100);

        _liqSalary = _brutSalary - _inssDescont;

        System.out.printf( "Salario Liquido: %.2f", _liqSalary);

        scanner.close();
    }    
}
