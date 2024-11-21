package DataAniversary;
public class Data 
{
    private int _day;
    private int _month;
    private int _year;

    public Data(int day, int month, int year)
    {   
        this._day = day;
        this._month = month;
        this._year = year;
    }    

    @Override
    public String toString( )
    {
        return String.format("%02d/%02d/%04d\n", _day, _month, _year);
    }

    public static void main(String[] args) 
    {

    }

}

