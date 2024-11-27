public class Empregado
{
    private String name;
    private String surname;
    private double salary;
    private double salaryIncreased;
    
    public Empregado(String name, String surname, double salary)
    {
        this.name = name;
        this.surname = surname;
        
        if( salary < 0 )
        { 
            this.salary = 1412;
        }
        else
        {
            this.salary = salary;
        }
    }

    public void GiveIncrease()
    {

        salaryIncreased = ( salary * 0.10 ) + salary;
    }
    
    @Override
    public String toString()
    {
        String stringToReturn = 
        """
        Empregado:
            nome = %s
            sobrenome = %s
            salario = R$%.2f
        Aumentando o salario...
        Empregado:
            nome = %s
            sobrenome = %s
            salario = R$%.2f   
        """;

        return String.format( stringToReturn, name, surname, salary, name, surname, salaryIncreased );
    }
}