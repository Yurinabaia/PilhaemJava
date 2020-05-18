public class CelulaCaractere {
	
	Caractere item;          // corresponde ao item armazenado na c�lula da pilha.
    CelulaCaractere proximo; // refer�ncia � pr�xima c�lula de uma pilha.

    CelulaCaractere() {
    	item = new Caractere();
    	proximo = null;
    }
    
    // Construtor que inicializa o item com o valor passado atrav�s do par�metro l desse m�todo; e o atributo que indica a pr�xima c�lula da pilha com null.
    CelulaCaractere(char l) {    
    	item = new Caractere(l);
        proximo = null;
    }
}