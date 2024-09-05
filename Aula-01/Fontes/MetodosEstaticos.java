/*
 * Arquivo: MetodosEstaticos.java
 * Autor: Prof. Dr. David Buzatto
 */

public class MetodosEstaticos {

    /*
     * Métodos Estáticos:
     *
     * Os métodos devem ser nomeados, preferencialmente, usando o padrão
     * camel case com a primeira letra em minúscula.
     * 
     * Na linguagem Java pode haver mais de um método com o mesmo nome
     * em um mesmo escopo, mas para que isso seja válido, a assinatura o
     * método (sua lista de parâmetros) deve ser diferente um do outro.
     *
     * Um parâmetro de um método é parte do método e descreve um tipo de
     * dado que será recebido.
     *
     * Um argumento é o valor em si, passado através de um parâmetro, para o
     * método utilizar. Em Java as passagens de parâmetro são sempre por
     * valor.
     */

    /* método estático público main
     *   - possui como parâmetro um array de String => ( String[] args );
     *   - não retorna nada => void antes do nome do método.
     */
    public static void main( String[] args ) {

        int n1 = 3;
        int n2 = 4;
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int resultado;

        System.out.printf( "%d + %d = %d", n1, n2, adicao( n1, n2 ) );
        pularLinha();

        resultado = subtracao( n1, n2 );
        System.out.printf( "%d - %d = %d", n1, n2, resultado );
        pularLinha();

        System.out.print( "zero a dez: " );
        imprimirNumeros();

        imprimeTabuada( 5 );

        System.out.println( "Dados do array (fora do metodo):" );
        for ( int i = 0; i < 10; i++ ) {
            System.out.printf( "a[%d] = %d\n", i, a[i] );
        }
        processarArray( a, 10 );
        System.out.println( "Dados do array (apos execucao do metodo):" );
        for ( int i = 0; i < 10; i++ ) {
            System.out.printf( "a[%d] = %d\n", i, a[i] );
        }
        
        System.out.printf( "Soma dos valores 1, 2, 3 e 4 = %d\n",
                           somarNumeros( 1, 2, 3, 4 ) );

    }

    /* método estático público adicao:
     *   - possui dois parâmetros inteiros => ( int, int );
     *   - retorna um inteiro => int antes do nome do método;
     *   - obs: todos nossos métodos por enquanto serão públicos e estáticos.
     */
    public static int adicao( int n1, int n2 ) {
        return n1 + n2;
    }

    /* método estático público subtracao:
     *   - possui dois parâmetros inteiros => ( int n1, int n2 );
     *   - retorna um inteiro => int antes do nome do método.
     */
    public static int subtracao( int n1, int n2 ) {

        /* variável resultado é interna ao método!
         * ela tem escopo local ao método.
         */
        int resultado = n1 - n2;

        return resultado;

    }

    /* método estático público  pularLinha
     *   - não possui parâmetros => ();
     *   - não retorna nada => void antes do nome do método;
     *   - obs: construções análogas aos métodos estáticos que não
     *          retornam valores são chamadas também de procedimentos.
     */
    public static void pularLinha() {
        System.out.println();
    }

    /* método estático público  imprimirNumeros
     *   - não possui parâmetros => ();
     *   - não retorna nada => void antes do nome do método.
     */
    public static void imprimirNumeros() {

        for ( int i = 0; i <= 10; i++ ) {
            System.out.print( i + " " );
        }

        pularLinha();

    }

    /* método estático público  processarArray
     *   - possui dois parâmetros, um array de inteiros e um
     *     inteiro => ( int[] a, int n );
     *   - não retorna nada => void antes do nome do método;
     *   - obs: parâmetros que são arrays tem um comportamento "especial".
     *          Iremos aprender os detalhes disso posteriormente!
     *          Por enquanto, entenda que um array passado como
     *          parâmetro poderá ser modificado dentro do método.
     */
    public static void processarArray( int[] a, int n ) {

        System.out.println( "Dados do array (dentro do metodo):" );
        for ( int i = 0; i < n; i++ ) {
            System.out.printf( "a[%d] = %d\n", i, a[i] );
        }

        System.out.println( 
            "Modificando os dados do array (dentro do metodo)..." );
        for ( int i = 0; i < n; i++ ) {
            a[i] += 2;
        }

        System.out.println( 
            "Dados do array apos modificacao (dentro do metodo):" );
        for ( int i = 0; i < n; i++ ) {
            System.out.printf( "a[%d] = %d\n", i, a[i] );
        }

    }

    /* método estático público imprimeTabuada
     *   - possui um parâmetro inteiro => ( int n );
     *   - não retorna nada => void antes do nome do método.
     */
    public static void imprimeTabuada( int n ) {

        for ( int i = 0; i <= 10; i++ ) {
            System.out.printf( "%d x %d = %d\n", n, i, n*i );
        }

    }
    
    /* método estático público somarNumeros
     *   - possui um parâmetro de comprimnento
     *     variável (vararg) => ( int... numeros );
     *   - retorna a soma dos valores passados
     *
     *   Os parâmetros de comprimento variável são
     *     interpretados internamente como se fossem
     *     arrays. Caso nenhum valor seja passado,
     *     existirá o array, entretanto com comprimento 
     *     igual a zero. Outro detalhe é que esse tipo
     *     de parâmetro deve ser fornecido, obrigatoriamente,
     *     no final da lista de parâmetros e cada método
     *     só pode ter um parâmetro desse tipo.
     */
    public static int somarNumeros( int... numeros ) {
        
        int soma = 0;
        
        for ( int i = 0; i <= numeros.length; i++ ) {
            soma += numeros[i]
        }
        
        return soma;

    }

}