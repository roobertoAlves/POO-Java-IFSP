public class Cor 
{
    private int red;
    private int blue;
    private int green;  

    public Cor( int red, int green, int blue )
    {
        SetRed( red );
        SetGreen( green );
        SetBlue( blue );
    }

    //#region Get & Sets
    
    public int GetRed()
    {
        return red;
    }
    public int GetGreen()
    {
        return green;
    }
    public int GetBlue()
    {
        return blue;
    }

    public void SetRed( int red )
    {
        this.red = (red < 0) ? 0 : (red > 255) ? 255 : red;
    }
    public void SetGreen( int green )
    {
        this.green = (green < 0) ? 0 : (green > 255) ? 255 : green;
    }
    public void SetBlue( int blue )
    {
        this.blue = (blue < 0) ? 0 : (blue > 255) ? 255 : blue;
    }

    //#endregion


    public Cor dark()
    {
       int newRed = ( int ) (red * 0.7 );
       int newGreen = ( int ) ( green * 0.7 );
       int newBlue = ( int ) ( blue * 0.7 );
      
       return new Cor( newRed, newGreen, newBlue );
    }

    @Override
    public String toString()
    {
        Cor darkColor = this.dark();

        String oldColor =
        """
        Cor base: rgb( %d, %d, %d )
        Cor escurecida: rgb( %d, %d, %d )   
        """;

        return String.format( oldColor, red, green, blue, darkColor.red, darkColor.green, darkColor.blue );
    }
}
