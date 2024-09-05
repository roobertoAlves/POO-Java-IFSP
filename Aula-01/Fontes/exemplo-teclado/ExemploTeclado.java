import java.awt.event.KeyEvent;

/**
 * Exemplo de tratamento de eventos do teclado.
 * 
 * @author Prof. Dr. David Buzatto
 * @copyright Copyright (c) 2024
 */
public class ExemploTeclado extends Engine {

    private char[] caracteres;
    private int quantidadeCaracteres;

    public ExemploTeclado() {
        super( 600, 400, "Exemplo de Tratamento do Teclado", true, 60 );
        caracteres = new char[100];
        quantidadeCaracteres = 0;
    }

    @Override
    public void criar() {
    }

    @Override
    public void atualizar() {
    }

    @Override
    public void desenhar() {

        int x;
        int y = 10;
        int k = 0;

        int tamanhoFonte = 20;

        for ( int i = 0; i < quantidadeCaracteres; i++ ) {
            char caractere = caracteres[i];
            if ( caractere == '\n' ) {
                y += tamanhoFonte;
                k = 0;
            } else {

                x = 10 + k * tamanhoFonte;
                k++;

                drawText( textFormat( "%c", caracteres[i] ), 
                          x, y + 10, 
                          tamanhoFonte, DARKPURPLE );

            }
        }

    }

    @Override
    public void tratarTeclado( KeyEvent e, KeyboardEventType ket ) {

        // tratamento dos eventos do teclado
        switch ( ket ) {

            // tecla pressionada
            case PRESSED: {

                // verifica se é a tecla de espaço que está pressionada
                if ( e.getKeyCode() == KeyEvent.VK_SPACE ) {
                    System.out.println( "tecla <espaco> pressionada!" );
                }

                // Obtém o código da tecla que foi pressionada.
                int codigo = e.getKeyCode();
                if ( codigo != 0 ) {
                    System.out.printf( "codigo tecla pressionada: %d\n",
                                       codigo );
                    if ( codigo == KeyEvent.VK_ENTER ) {
                        caracteres[quantidadeCaracteres++] = '\n';
                    }
                }

                // Obtém o caractere da tecla que foi pressionada.
                char caractere = e.getKeyChar();
                if ( caractere != '\0' ) {
                    if ( quantidadeCaracteres < 100 ) {
                        caracteres[quantidadeCaracteres++] = caractere;
                    }
                }

                break;

            }

            // tecla liberada
            case RELEASED: {

                // verifica se é a tecla de espaço que foi solta
                if ( e.getKeyCode() == KeyEvent.VK_SPACE ) {
                    System.out.println( "tecla <espaco> solta!" );
                }

                break;
            }

        }

    }

    public static void main( String[] args ) {
        new ExemploTeclado();
    }

}