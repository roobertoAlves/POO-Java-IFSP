public class Cor 
{
    private int red;
    private int blue;
    private int green;
    private int newRed;
    private int newBlue;
    private int newGreen;

    
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

    public Cor escurecer( int redN, int greenN, int blueN )
    {
        double newRed = (red * 0.7) + red;
        redN = (int)newRed;

        double newGreen = (green * 0.7)  + green;
        greenN = (int)newGreen;

        double newBlue = ( blue * 0.7 ) + blue;
        blueN = (int)newBlue;

       return escurecer( redN , greenN , blueN );
      
    }

    @Override
    public String toString()
    {
        String oldColor =
        """
        Cor: rgb( %d, %d, %d )  
        Cor escurecida: rgb( %d, %d, %d )        
        """;

        return String.format(oldColor, red, green, blue, escurecer( newRed, newGreen, newBlue ) );


    }
}
