public class Cor 
{
    private int red;
    private int blue;
    private int green;
    
    public Cor( int red, int green, int blue )
    {
        this.red = (red < 0) ? 0 : (red > 255) ? 255 : red;
        this.green = (green < 0) ? 0 : (green > 255) ? 255 : green;
        this.blue = (blue < 0) ? 0 : (blue > 255) ? 255 : blue;
    }

    @Override
    public String toString()
    {
        return String.format( "Cor: rgb( %d, %d, %d )", red, green, blue );
    }
}
