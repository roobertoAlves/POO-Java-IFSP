public class Hora 
{
    private int hours;
    private int minutes;
    private int seconds;    
    
    
    public Hora( int seconds )
    {
        if( seconds > 0 )
        {
            this.hours = seconds / 3600;
            this.minutes = (seconds % 3600 ) / 60;
            this.seconds = seconds % 60;
        }
        else
        {
            this.seconds = 0;
            minutes = 0;
            hours = 0;   
        }
    }

    @Override
    public String toString()
    {
        return String.format(
        """
        Hora: %d:%d:%d        
        """, hours, minutes, seconds
        );
    }
}
