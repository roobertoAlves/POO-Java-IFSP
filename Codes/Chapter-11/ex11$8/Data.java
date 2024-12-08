public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) 
    {
   
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean IsLeapYear(int year) 
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int GetDayOfTheYear() 
    {
        int baseDays = ((month - 1) * 30 + day) - 1;

        if (IsLeapYear(year) && month > 2) 
        {
            baseDays++;
        }

        return baseDays;
    }

    @Override
    public String toString() 
    {
        return String.format(
            """
            Data: %02d/%02d/%d
            Dia do ano: %d
            """,
            day, month, year, GetDayOfTheYear()
        );
    }
}
