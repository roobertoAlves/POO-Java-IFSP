import java.util.Scanner;

public class Exercicio2$13 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        Scanner scanner = new Scanner( System.in );

        double _firstGrade;
        double _secGrade;
        double _recGrade;
        double _media;

        //#endregion    

        System.out.print( "Digite a nota da primeira avaliação: " );
        _firstGrade = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite a nota da segunda avaliação: " );
        _secGrade = Double.parseDouble( scanner.nextLine() );

        System.out.print( "Digite a nota optativa, caso não tenha feito digite um valor negativo: ");
        _recGrade = Double.parseDouble( scanner.nextLine() );

            if(_recGrade > _firstGrade)
            {
                _firstGrade = _recGrade;

                _media = (_firstGrade + _secGrade)/2;
            }
            else if(_recGrade > _secGrade)
            {
                _secGrade = _recGrade;
                _media = (_firstGrade + _secGrade)/2;
            }
            else
            {
                _media = (_firstGrade + _secGrade)/2;
            }

            if(_media >= 6)
            {
                System.out.printf( "Media: %.2f\n", _media); 
                System.out.printf( "Aprovado!\n" );
            }
            else if(_media >= 4 && _media < 6)
            {
                System.out.printf( "Media: %.2f\n", _media); 
                System.out.printf( "Exame.\n" );
            }
            else
            {
                System.out.printf( "Media: %.2f\n", _media); 
                System.out.printf( "Reprovado...\n" );
            }
            
        scanner.close();
    }    
}
