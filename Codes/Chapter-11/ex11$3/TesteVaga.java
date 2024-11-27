import java.util.Scanner;

public class TesteVaga 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
            
        Scanner scanner = new Scanner( System.in );
    
        String _sign;
        int _hoursSpend;
    
        //#endregion
    
        System.out.print( "Digite a placa do seu veiculo: " );
        _sign = scanner.nextLine();
    
    
        System.out.print( "Digite a quantidade de horas ficadas no estacionamento: ");
        _hoursSpend = Integer.parseInt( scanner.nextLine() );
    
        Vaga _vaga = new Vaga(_sign, _hoursSpend);
    
        System.out.println( _vaga );
    
        scanner.close();
    }
}
       
