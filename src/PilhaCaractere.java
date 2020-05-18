

public class PilhaCaractere {

	private CelulaCaractere fundo; // referência à célula que está no fundo da pilha. Essa célula é utilizada apenas para controle.
    private CelulaCaractere topo;  // referência à célula que está no topo da pilha.
    // Construtor que cria uma pilha "vazia" inicializando a célula do fundo da pilha e os atributos de controle da pilha (fundo e topo).
    PilhaCaractere() {
    	
        CelulaCaractere aux = new CelulaCaractere();
        fundo = aux;
        topo = aux;
    }

    // Insere o item, passado como parâmetro para esse método, no topo da pilha.
    public void empilhar(Caractere l)
    {
    	// inserção da nova célula no topo da pilha.
        CelulaCaractere aux = new CelulaCaractere();
    	aux.proximo = topo;
    	aux.item = l;
    	
        // atualização do atributo de controle topo.
        topo = aux;
        
    }
    public String retorna() 
    {
    	 CelulaCaractere aux = topo;        
    	 @SuppressWarnings("unused")
		Caractere aux2 = null;
    	 int cont = 0, i = 0;
    	 char[] caracteres = new char[obterNumeroItens()];//Apenas para armazenar os valores da pilha
    	 String palavra = " ";//variavel que vai retorna a palavra
         if (!pilhaVazia())
         {
         	 while (aux != fundo) 
         	 {
         		 if(aux.item.getLetra() == '#') 
         		 {
         			aux2 = aux.item;
         			topo = aux.proximo;
                   // System.out.println(aux2.getLetra());
                    cont++;
         		 }
         		 else if(aux.item.getLetra() != '#' && cont > 0) 
         		 {
         			aux2 = aux.item;
         			topo = aux.proximo;
                   // System.out.println(aux2.getLetra());
                    cont--;
         		 }  
         		 else 
         		 {
         			caracteres[i] = aux.item.getLetra();//armazenando os valores da pilha no array de char
         			i++;//contado do array
         		 }
         		 aux = aux.proximo;//apenas para muda de posição
             }
         	inverterVetor(caracteres);//Para não aparecer sanim-cup eu invertir o vetor e aparecera puc-minas
         	palavra =  new String(caracteres);//Para colocar na variavel o vetor de char, essa variavel vai retorna a palavra
         	return palavra;//retorna a palavra;
         } 
         return "Pilha vazia";//caso a pilha esteja vazia retorna "Pilha vazia";
    }
    // método que inverte o vetor
    public static char[] inverterVetor(char vet[]) {		
        char temp;		
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        } 		
        return vet;		
    }
    public int obterNumeroItens() 
    {
        int cont = 0;
        CelulaCaractere aux = topo;        
        if (!pilhaVazia())
        {
        	 while (aux != fundo) {
                 aux = aux.proximo;
                 cont++;
             }
        }    
    	return cont;
    }
    // Retira o item que está no topo da pilha. Se a pilha estiver vazia, esse método deve retornar null; caso contrário, esse método deve retornar o item retirado da pilha.
    public Caractere desempilhar()
    {
        // se a pilha estiver vazia, esse método deve retornar null.
        Caractere aux = null;

        if (!pilhaVazia())
        {
            // aux aponta para o item da pilha que será retornado/desempilhado, ou seja, o item do topo.
            aux = topo.item;

            // atualização do atributo de controle topo.
            topo = topo.proximo;

        }
        return (aux);
    }

    // Verifica se a pilha está vazia. Em caso afirmativo, retorna true e em caso negativo retorna false.
    public Boolean pilhaVazia()
    {
        // se a pilha apresentar apenas a célula sentinela, ela está vazia.
        if (fundo == topo)
            return (true);
        else
            return (false);
    }    
}