public class Recibo 
{
    private String id;
    private String description;
    private int quantity;
    private double price;


    public Recibo( String id, String description, int quantity, double price )
    {
        this.id = id;
        this.description = description;

        if(quantity <= 0)
        {
            this.quantity = 1;
        }
        else
        {
            this.quantity = quantity;
        }

        if(price < 0)
        {
            this.price = 0.0;
        }
        else
        {
            this.price = price;
        }
    }

    public double GetValorTotal()
    {
        return quantity * price;
    }

    @Override
    public String toString()
    {

        String retorno = """
                Recibo:
                    id = %s
                    descricao = %s
                    quantidade = %d
                    preco = R$%.2f
                    valor total = R$%.2f
                """;
                
        return String.format( retorno, id, description, quantity, price, GetValorTotal() );
    }
}
