public class Vaga 
{
    private String sign;
    private int hoursQuantity;    
    
    public Vaga( String sing, int hoursQuantity )
    {
        this.sign = sing;

        if( hoursQuantity <= 0)
        {
            this.hoursQuantity = 1;
        }
        else
        { 
            this.hoursQuantity = hoursQuantity;
        }
    }

    public double GetTax()
    {
        double tax = 2;
        int hours = hoursQuantity;

        if( hours <= 3 )
        {
            return tax;
        }
        
        if( hours > 3 )
        {
            hours = hoursQuantity - 3;

            tax += hours * 0.5;
        }

        if( tax <= 10 )
        {
            return tax;
        }
        else
        {
            return 10;
        }
    }

    public String toString()
    {
        String stringToReturn = 
        """
        Vaga: 
            placa = %s
            quantidade = %d
            taxa = R$%.2f        
        """;

        return String.format( stringToReturn, sign, hoursQuantity, GetTax() );
    }
}
