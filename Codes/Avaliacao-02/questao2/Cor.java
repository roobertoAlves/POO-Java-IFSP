public class Cor 
{
    private int red;
    private int blue;
    private int green;

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


    @Override
    public String toString()
    {
        return String.format( "Cor: rgb( %d, %d, %d )", red, green, blue );
    }
}
