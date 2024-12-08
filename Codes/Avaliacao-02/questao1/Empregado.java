public class Empregado
{
    private String name;
    private String surname;
    private double salary;
    private double salaryIncreased;
    

    //#region Get & Sets
    public String GetName()
    {
        return name;
    }
    public String GetSurname()
    {
        return surname;
    }
    public double GetSalary()
    {
        return salary;
    }

    public void SetName( String name )
    {
        this.name = name;
    }
    public void SetSurname( String surname )
    {
        this.surname = surname;
    }
    public void SetSalary( double salary )
    {
        this.salary = salary;
    }
    
    //#endregion
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