import java.awt.event.KeyEvent;

/**
 * Jogo de ping-pong.
 * 
 * @author Prof. Dr. David Buzatto
 * @copyright Copyright (c) 2024
 */
public class Main extends Engine {

    private Bolinha bolinha;
    private Jogador jogador1;
    private Jogador jogador2;
    private Placar placar;
    private boolean pausado;

    public Main() {
        super( 800, 450, "Pong - By Prof. Dr. David Buzatto", true, 60 );
    }

    @Override
    public void criar() {
        bolinha = new Bolinha( getScreenWidth() / 2, getScreenHeight() / 2, 15, WHITE, 0, 0 );
        jogador1 = new Jogador( 30, getScreenHeight() / 2 - 60, 20, 120, WHITE );
        jogador2 = new Jogador( getScreenWidth() - 50, getScreenHeight() / 2 - 60, 20, 120, WHITE );
        placar = new Placar( getScreenWidth() / 2, 50, 0, 0, null, WHITE );
        pausado = true;
    }

    @Override
    public void atualizar() {
        
        atualizarBolinha();

        if ( tocouJogador1() ) {
            bolinha.setX( jogador1.getX() + jogador1.getLargura() + bolinha.getRaio() );
            bolinha.setVx( -bolinha.getVx() * 1.1 );
        }

        if ( tocouJogador2() ) {
            bolinha.setX( jogador2.getX() - bolinha.getRaio() );
            bolinha.setVx( -bolinha.getVx() * 1.1 );
        }

    }

    @Override
    public void desenhar() {
        clearBackground( BLACK );
        bolinha.desenhar( this );
        jogador1.desenhar( this );
        jogador2.desenhar( this );
        placar.desenhar( this );
    }

    @Override
    public void tratarTeclado( KeyEvent e, KeyboardEventType met ) {

        if ( met == KeyboardEventType.PRESSED ) {

            atualizarJogador1( e );
            atualizarJogador2( e );

            if ( pausado && e.getKeyCode() == KeyEvent.VK_ENTER ) {
    
                pausado = false;
        
                if ( placar.getUltimoPontuar() == null || placar.getUltimoPontuar() == jogador2 ) {
                    bolinha.setVx( 3 );
                } else {
                    bolinha.setVx( -3 );
                }
        
                bolinha.setVy( (int) (Math.random() * 2) == 0 ? -3 : 3 );
        
            }

        }

    }

    private void atualizarJogador1( KeyEvent e ) {

        if ( !pausado ) {
    
            if ( e.getKeyCode() == KeyEvent.VK_W ) {
                jogador1.setY( jogador1.getY() - 5 );
            } else if ( e.getKeyCode() == KeyEvent.VK_S ) {
                jogador1.setY( jogador1.getY() + 5 );
            }
    
            if ( jogador1.getY() <= 0 ) {
                jogador1.setY( 0 );
            }
    
            if ( jogador1.getY() + jogador1.getAltura() >= getScreenHeight() ) {
                jogador1.setY( getScreenHeight() - jogador1.getAltura() ) ;
            }
    
        }
    
    }

    private void atualizarJogador2( KeyEvent e ) {

        if ( !pausado ) {
    
            if ( e.getKeyCode() == KeyEvent.VK_UP ) {
                jogador2.setY( jogador2.getY() - 5 );
            } else if ( e.getKeyCode() == KeyEvent.VK_DOWN ) {
                jogador2.setY( jogador2.getY() + 5 );
            }
    
            if ( jogador2.getY() <= 0 ) {
                jogador2.setY( 0 );
            }
    
            if ( jogador2.getY() + jogador2.getAltura() >= getScreenHeight() ) {
                jogador2.setY( getScreenHeight() - jogador2.getAltura() ) ;
            }
    
        }
    
    }
    
    private void atualizarBolinha() {
    
        boolean resetarPosicoes = false;
    
        bolinha.setX( bolinha.getX() + bolinha.getVx() );
        bolinha.setY( bolinha.getY() + bolinha.getVy() );
    
        if ( bolinha.getX() + bolinha.getRaio() >= getScreenWidth() ) {
            placar.setPontosJogador1( placar.getPontosJogador1() + 1 );
            placar.setUltimoPontuar( jogador1 );
            resetarPosicoes = true;
        }
    
        if ( bolinha.getX() - bolinha.getRaio() <= 0 ) {
            placar.setPontosJogador2( placar.getPontosJogador2() + 1 );
            placar.setUltimoPontuar( jogador2 );
            resetarPosicoes = true;
        }
    
        if ( resetarPosicoes ) {
    
            bolinha.setX( getScreenWidth()/2 );
            bolinha.setY( getScreenHeight()/2 );
            bolinha.setVx( 0 );
            bolinha.setVy( 0 );
    
            jogador1.setY( getScreenHeight()/2 - 60 );
            jogador2.setY( jogador1.getY() );
    
            pausado = true;
    
            resetarPosicoes = false;
    
        }
    
        if ( bolinha.getY() + bolinha.getRaio() >= getScreenHeight() ) {
            bolinha.setY( getScreenHeight() - bolinha.getRaio() );
            bolinha.setVy( -bolinha.getVy() );
        }
    
        if ( bolinha.getY() - bolinha.getRaio() <= 0 ) {
            bolinha.setY( bolinha.getRaio() );
            bolinha.setVy( -bolinha.getVy() );
        }
    
    }
    
    private boolean tocouJogador1() {
        return ( bolinha.getX() - bolinha.getRaio() <= jogador1.getX() + jogador1.getLargura() ) &&
               ( bolinha.getY() >= jogador1.getY() && bolinha.getY() < jogador1.getY() + jogador1.getAltura() );
    }
    
    private boolean tocouJogador2() {
        return ( bolinha.getX() + bolinha.getRaio() >= jogador2.getX() ) &&
               ( bolinha.getY() >= jogador2.getY() && bolinha.getY() < jogador2.getY() + jogador2.getAltura() );
    }

    public static void main( String[] args ) {
        new Main();
    }

}