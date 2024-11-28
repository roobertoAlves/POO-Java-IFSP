public class Cor 
{
    private int red;
    private int blue;
    private int green;
    
    public Cor( int red, int green, int blue )
    {
        if( red < 0 )
        {
            this.red = 0;
        }
        else if(red > 255)
        {
            this.red = 255;
        }
        else
        {
            this.red = red;
        }

        if( green < 0 )
        {
            this.green = 0;
        }
        else if(green > 255)
        {
            this.green = 255;
        }
        else
        {
            this.green = green;
        }

        if( blue < 0 )
        {
            this.blue = 0;
        }
        else if(blue > 255)
        {
            this.blue = 255;
        }
        else
        {
            this.blue = blue;
        }
    }

    @Override
    public String toString()
    {
        return String.format( "Cor: rgb( %d, %d, %d )", red, green, blue );
    }
}
