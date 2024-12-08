public class Hora 
{
    private int hours;
    private int minutes;
    private int seconds;    
    
    public Hora( int hours, int minutes, int seconds )
    {
        this.hours = ( hours > 59 ) ? 59 : ( hours < 0 ) ? 0 : hours;
        this.minutes = ( minutes > 59 ) ? 59 : ( minutes < 0 ) ? 0 : minutes;
        this.seconds = ( seconds > 59 ) ? 59 : ( seconds < 0 ) ? 0 : seconds;
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
