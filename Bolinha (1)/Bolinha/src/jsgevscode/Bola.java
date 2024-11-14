package jsgevscode;

import java.awt.Color;

import br.com.davidbuzatto.jsge.core.engine.EngineFrame;

public class Bola {
    
    //#region Variaveis


    double x;
    double y;
    double raio;

    double vx;
    double vy;

    double atrito;
    double elasticidade;

    Color cor;

    boolean arrastando;

    double offsetX;
    double offsetY;

    double lastX;
    double lastY;

    //#endregion

    void atualizar (double delta, EngineFrame e )
    {
        double xMouse = e.getMouseX();
        double yMouse = e.getMouseY();

        if( e.isMouseButtonPressed(( e.MOUSE_BUTTON_LEFT )))
        {

            double c1 = xMouse - x;
            double c2 = yMouse - y; 
            double distancia = Math.sqrt(c1 * c1 + c2 * c2);

            if(distancia <= raio)
            {
                arrastando = true;
            }
        }
            
        if(e.isMouseButtonReleased(e.MOUSE_BUTTON_LEFT))
        {
            arrastando = false;
        }
        

        if( arrastando )
        {
            x = xMouse - offsetX;
            y = yMouse - offsetY;

            vx = (x - lastX) / delta;
            vy = (y - lastY) / delta;

            lastX = x;
            lastY = y;
        }
        else
        {
            x += vx * delta;
            y += vy * delta;
        
            if ( x + raio >= e.getScreenWidth() ) {
                x = e.getScreenWidth() - raio;
                vx = -vx * elasticidade;
                raio = 1;
            } 
            else if ( x - raio <= 0 )
            {
                x = raio;
                vx = -vx * elasticidade;
                raio *= 2;
            }
        
            if ( y + raio >= e.getScreenHeight() ) 
            {
                y = e.getScreenHeight() - raio;
                vy = -vy * elasticidade;
                raio *= -2;
            } 
            else if ( y - raio <= 0 ) 
            {
                y = raio;
                vy = -vy * elasticidade;
            }
                
            vx = vx * atrito;
            vy = vy * atrito + Main.GRAVIDADE;
        }
    }

    void desenhar( EngineFrame e ) {
        e.fillCircle( x, y, raio, cor );
    }

}
