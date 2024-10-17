public class Exercicio4$11 
{
    public static void main(String[] args) 
    {
        //#region Variaveis
        
        //#endregion


        for( int i = _quantity - 1; i >= 0; i--)
        {
            _userInputArray[ i+1 ] = _userInputArray[ i ];
        }

        _userInputArray[ 0 ] = _newInputValue;
    }    
}
