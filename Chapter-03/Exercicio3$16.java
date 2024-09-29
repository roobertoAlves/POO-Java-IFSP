public class Exercicio3$16 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        int _a = 1;
        int _b = 0;
        int _temp = 0;

        //#endregion

        for(int i = 0; i < 20; i++)
        {
            _temp = _b + _a;

            System.out.printf("%d ", _a );

            _b = _a;
            _a = _temp;

        }
    }    
}
