package jsgevscode;

import br.com.davidbuzatto.jsge.core.engine.EngineFrame;

/**
 * JSGE basic game template.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Main extends EngineFrame {
    
    Bola bolinha;

    public static final double GRAVIDADE = 50;

    public Main() {
        
        super (
            800,             // width
            450,             // height
            "Bolinha",       // title
            60,              // target FPS
            true,            // antialiasing
            false,           // resizable
            false,           // full screen
            false,           // undecorated
            false            // always on top
        );
        
    }
    
    /**
     * Creates the game world.
     * 
     * This method runs just one time during engine initialization.
     */
    @Override
    public void create() {
        bolinha = new Bola();
        bolinha.x = getScreenWidth() / 2;
        bolinha.y = getScreenHeight() / 2;
        bolinha.raio = 50;
        bolinha.vx = 200;
        bolinha.vy = 200;
        bolinha.atrito = 0.99;
        bolinha.elasticidade = 0.9;
        bolinha.cor = LIME;
    }

    /**
     * Reads user input and update game world.
     * 
     * Input methods should be used here.
     * You MUST NOT use any of the engine drawing methods here.
     * 
     * @param delta Time passed between frames.
     */
    @Override
    public void update( double delta ) {

        bolinha.atualizar( delta, this );

    }
    
    /**
     * Draws the game world.
     * 
     * All drawing related operations MUST be performed here.
     */
    @Override
    public void draw() {
        
        clearBackground( WHITE );

        bolinha.desenhar( this );
    
    }
    
    public static void main( String[] args ) {
        new Main();
    }
    
}
