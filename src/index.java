
public class index 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		 //Exercicio 3 apenas tire os comentarios para executar e comente o Exercicio 6;
		PilhaCaractere minhaPilha = new PilhaCaractere();
        Caractere aux;

        aux = new Caractere('A');
        minhaPilha.empilhar(aux);
        aux = new Caractere('E');
        minhaPilha.empilhar(aux);
        aux = new Caractere('D');
        minhaPilha.empilhar(aux);
        aux = new Caractere('s');
        minhaPilha.empilhar(aux);
        aux = new Caractere('I');
        minhaPilha.empilhar(aux);
        aux = new Caractere('I');
        minhaPilha.empilhar(aux);
        System.out.println( "Quantidade " + minhaPilha.obterNumeroItens());

        minhaPilha.desempilhar();
        minhaPilha.desempilhar();
		*/
		
		//Exercicio 6
		PilhaCaractere minhaPilha = new PilhaCaractere();
        Caractere aux;

        String palavra = "PO#UCTE##-MIB#NADR##S";
        
        System.out.println("Entrada =          " + palavra);
        for (int i = 0; i < palavra.length(); i++) 
        {
        	 aux = new Caractere(palavra.charAt(i));
             minhaPilha.empilhar(aux);
		}
        System.out.println("Saída =" + minhaPilha.retorna());
        minhaPilha.desempilhar();
        minhaPilha.desempilhar();
        
	}

}
