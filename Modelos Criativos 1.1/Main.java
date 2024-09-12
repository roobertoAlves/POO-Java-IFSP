import java.util.Scanner;

/**
 * Modelo para desenvolvimento de exercícios criativos em Java 2D.
 * 
 * @author Prof. Dr. David Buzatto
 * @copyright Copyright (c) 2024
 */
public class Main extends Engine {

    //#region Variaveis
    Scanner scanner = new Scanner( System.in );
    double _xStart;
    double _xEnd;
    double _yStart;
    double _yEnd;


    //#endregion

    public Main() 
    {

        // cria a janela do jogo ou simulação
        super( 
            600,                  // 800 pixels de largura
            400,                  // 600 pixels de largura
            "Exercicio Criativo 1.1",   // título da janela
            true,                 // ativa a suavização (antialiasing)
            60 );                 // 60 quadros por segundo

    }

    /**
     * Processa a entrada inicial fornecida pelo usuário e cria
     * e/ou inicializa os objetos/contextos/variáveis do jogo ou simulação.
     */
    @Override
    public void criar() 
    {

        System.out.print("Digite a posição inicial da linha (X): ");
        _xStart = Double.parseDouble( scanner.nextLine() );

        System.out.print("Digite a posição inicial da linha (Y): ");
        _yStart = Double.parseDouble( scanner.nextLine() );

        System.out.print("Digite a posição final da linha (X): ");
        _xEnd = Double.parseDouble( scanner.nextLine() );

        System.out.print("Digite a posição final da linha (Y): ");
        _yEnd = Double.parseDouble( scanner.nextLine() );
    }

    /**
     * Atualiza os objetos/contextos/variáveis do jogo ou simulação.
     */
    @Override
    public void atualizar() 
    {

    }

    /**
     * Desenha o estado dos objetos/contextos/variáveis do jogo ou simulação.
     */
    
    @Override
    public void desenhar() 
    {
        drawLine(_xStart, _yStart , _xEnd , _yEnd , BLACK);
    }

    public static void main( String[] args ) 
    {
        new Main();
    }

}