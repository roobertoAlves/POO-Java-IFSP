public class Ponto 
{
    private double x;
    private double y;
    
    public Ponto( double x, double y )
    {
        this.x = x;
        this.y = y;
    }

    public double getDistance( Ponto cordsPonto )
    {
        double distanceX;
        double distanceY;

        distanceX = cordsPonto.x - cordsPonto.x;

        distanceY = cordsPonto.y - cordsPonto.y; 

        return new Ponto( distanceX, distanceY );
    }

    @Override
    public String toString()
    {
        String stringToReturn = 
        """
        Ponto 1: [x=%.2f;y=%.2f]    
        Ponto 2: [x=%.2f;y=%.2f]
        Distancia entre os pontos: %d, %d
        """;

        return String.format( stringToReturn, x, y, x, y, getDistance( x, y ) );
    }
}
