import java.awt.event.MouseEvent;

/**
 * Simulação da bolinha.
 * 
 * @author Prof. Dr. David Buzatto
 * @copyright Copyright (c) 2024
 */
public class Main extends Engine {

    private Bolinha bolinha;
    private double offsetX;
    private double offsetY;
    private int xMouseAnterior;
    private int yMouseAnterior;

    private double delta;

    private static final int GRAVIDADE = 100;

    public Main() {
        super( 800, 450, "Bolinha - Prof. Dr. David Buzatto", true, 60 );
    }

    @Override
    public void criar() {
        bolinha = new Bolinha( getScreenWidth() / 2, getScreenHeight() / 2, 25, BLUE, 400, 400, 0.99, 0.9 );
    }

    @Override
    public void atualizar() {

        delta = getFrameTime();

        if ( !bolinha.isArrastando() ) {

            bolinha.setX( bolinha.getX() + bolinha.getVx() * delta );
            bolinha.setY( bolinha.getY() + bolinha.getVy() * delta );

            if ( bolinha.getX() + bolinha.getRaio() >= getScreenWidth() ) {
                bolinha.setX( getScreenWidth() - bolinha.getRaio() );
                bolinha.setVx( -bolinha.getVx() * bolinha.getElasticidade() );
            } else if ( bolinha.getX() - bolinha.getRaio() <= 0 ) {
                bolinha.setX( bolinha.getRaio() );
                bolinha.setVx( -bolinha.getVx() * bolinha.getElasticidade() );
            }

            if ( bolinha.getY() + bolinha.getRaio() >= getScreenHeight() ) {
                bolinha.setY( getScreenHeight() - bolinha.getRaio() );
                bolinha.setVy( -bolinha.getVy() * bolinha.getElasticidade() );
            } else if ( bolinha.getY() - bolinha.getRaio() <= 0 ) {
                bolinha.setY( bolinha.getRaio() );
                bolinha.setVy( -bolinha.getVy() * bolinha.getElasticidade() );
            }

            bolinha.setVx( bolinha.getVx() * bolinha.getAtrito() );
            bolinha.setVy( bolinha.getVy() * bolinha.getAtrito() + GRAVIDADE );

        }

    }

    @Override
    public void desenhar() {
        bolinha.desenhar( this );
    }

    @Override
    public void tratarMouse( MouseEvent e, MouseEventType met ) {

        if ( met == MouseEventType.PRESSED ) {
            if ( e.getButton() == MouseEvent.BUTTON1 ) {
                double cat1 = e.getX() - bolinha.getX();
                double cat2 = e.getY() - bolinha.getY();
                double hip = Math.sqrt( cat1 * cat1 + cat2 * cat2 );
                if ( hip <= bolinha.getRaio() ) {
                    bolinha.setArrastando( true );
                    offsetX = e.getX() - bolinha.getX();
                    offsetY = e.getY() - bolinha.getY();
                } else {
                    bolinha.setArrastando( false );
                }
            }
        } else if ( met == MouseEventType.RELEASED ) {
            if ( e.getButton() == MouseEvent.BUTTON1 ) {
                bolinha.setArrastando( false );
            }
        } else if ( met == MouseEventType.DRAGGED ) {
            if ( bolinha.isArrastando() ) {

                bolinha.setX( e.getX() - offsetX );
                bolinha.setY( e.getY() - offsetY );

                bolinha.setVx( ( e.getX() - xMouseAnterior ) / delta );
                bolinha.setVy( ( e.getY() - yMouseAnterior ) / delta );

                xMouseAnterior = e.getX();
                yMouseAnterior = e.getY();

            }
        }

    }

    public static void main( String[] args ) {
        new Main();
    }

}