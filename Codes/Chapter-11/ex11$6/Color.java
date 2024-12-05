public class Color
{
    private int red;
    private int green;
    private int blue;

    public Color( int red, int green, int blue )
    {
        this.red = ( red < 0 ) ? 0 : ( red > 255 ) ? 255 : red;
        this.green = ( green < 0 ) ? 0 : ( green > 255 ) ? 255 : green; 
        this.blue = ( blue < 0 ) ? 0 : ( blue > 255 ) ? 255 : blue;
    }
    
    public Color lighten()
    {
        int newRed;
        int newGreen;
        int newBlue;

       

        newRed = ( red > 0 ) && ( red < 3 ) ? 3 : red;
        newGreen = ( green > 0 ) && ( green < 3 ) ? 3 : green;
        newBlue = ( blue > 0 ) && ( blue < 3 ) ? 3 : blue;

        int lightRed = ( int ) ( newRed / 0.7 );
        int lightGreen = ( int ) ( newGreen / 0.7 );
        int lightBlue = ( int ) ( newBlue / 0.7 );

        lightRed = ( lightRed > 255 ) ? 255 : lightRed;
        lightGreen = ( lightGreen > 255 ) ? 255 : lightGreen;
        lightBlue = ( lightBlue > 255 ) ? 255 : lightBlue;

        if( red == 0 && green == 0 && blue == 0 )
        {
            lightRed = 3;
            lightGreen = 3;
            lightBlue = 3;
        }

        return new Color( lightRed, lightGreen, lightBlue );
    }

    public String toString()
    {
        Color lightCor = this.lighten();

        String stringToReturn = 
        """
        Cor base: rgb( %d, %d, %d )
        Cor clareada: rgb( %d, %d, %d )
        """;

        return String.format( stringToReturn, red, green, blue, lightCor.red, lightCor.green, lightCor.blue );
    }
}