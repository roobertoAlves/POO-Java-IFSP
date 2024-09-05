import java.awt.event.MouseEvent;

/**
 * Exemplo de tratamento de eventos do mouse.
 * 
 * @author Prof. Dr. David Buzatto
 * @copyright Copyright (c) 2024
 */
public class ExemploMouse extends Engine {

    private class Linha {
        Point2D ini = new Point2D( 0, 0 );
        Point2D fim = new Point2D( 0, 0 );
        boolean desenhar;
    }

    private Linha linhaTemporaria;
    private Linha[] linhas;
    private int quantidadeLinhas;

    public ExemploMouse() {

        super( 600, 400, "Exemplo de Tratamento do Mouse", true, 60 );

        linhas = new Linha[100];
        quantidadeLinhas = 0;

    }

    @Override
    public void criar() {
    }

    @Override
    public void atualizar() {
    }

    @Override
    public void desenhar() {

        if ( linhaTemporaria != null && linhaTemporaria.desenhar ) {
            desenharLinha( linhaTemporaria );
        }
    
        for ( int i = 0; i < quantidadeLinhas; i++ ) {
            desenharLinha( linhas[i] );
        }

    }

    void desenharLinha( Linha linha ) {
        drawLine( linha.ini.x, linha.ini.y, 
                  linha.fim.x, linha.fim.y, DARKPURPLE );
    }

    @Override
    public void tratarMouse( MouseEvent e, MouseEventType met ) {
        
        /* verifica se um botão do mouse foi pressionado uma vez
         *
         * principais constantes para representação dos botões:
         * - BUTTON1: botão da esquerda
         * - BUTTON2: botão do meio
         * - BUTTON3: botão da direita
         */
        if ( met == MouseEventType.PRESSED ) {

            System.out.println( e.getButton() == MouseEvent.BUTTON2 );

            if ( e.getButton() == MouseEvent.BUTTON1 ) {

                System.out.print( "botao da esquerda pressionado: " );

                linhaTemporaria = new Linha();

                /* obtém a posição em x do mouse
                    * int e.getX();
                    */

                /* obtém a posição em y do mouse
                    * int e.getY();
                    */
                System.out.printf( "(%d, %d)\n", e.getX(), e.getY() );

                linhaTemporaria.ini.x = e.getX();
                linhaTemporaria.ini.y = e.getY();

            }

            // soltou
        } else if ( met == MouseEventType.RELEASED ) {

            if ( e.getButton() == MouseEvent.BUTTON1 ) {
                System.out.println( "botao da esquerda solto!" );
                linhas[quantidadeLinhas++] = linhaTemporaria;
            }

            // verifica se um botão do mouse continua pressionado
        } else if ( met == MouseEventType.DRAGGED ) {

            if ( linhaTemporaria != null ) {

                System.out.println( "botao continua pressionado!" );

                linhaTemporaria.fim.x = e.getX();
                linhaTemporaria.fim.y = e.getY();
                linhaTemporaria.desenhar = true;

            }

        }

    }

    public static void main( String[] args ) {
        new ExemploMouse();
    }

}