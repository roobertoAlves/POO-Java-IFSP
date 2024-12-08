public class Ponto 
{
    private double x;
    private double y;

    public Ponto(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }

    public double getDistance( Ponto outroPonto ) 
    {
        double deltaX = outroPonto.x - this.x;
        double deltaY = outroPonto.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() 
    {
        return String.format("[x=%.2f, y=%.2f]", x, y);
    }

    public String toString(Ponto outroPonto) 
    {
        double distancia = this.getDistance(outroPonto);
        return String.format(
            """

            Ponto 1: [x=%.2f;y=%.2f]
            Ponto 2: [x=%.2f;y=%.2f]
            Distancia entre os pontos: %.2f
            """,
            this.x, this.y, outroPonto.x, outroPonto.y, distancia
        );
    }
}
