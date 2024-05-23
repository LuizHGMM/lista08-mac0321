package ex5;


// para testar, executar o programa

//essa diferença de tempo ocorre pois Strings comuns são imutávais e para fazer concatenação entre
//duas strings é necessario criar uma nova string, levando um certo tempo para alocação de memória,
//enquanto a classe StringBuffer é mutavel e não é necessario declarar uma nova string para fazer 
//concatenaçao, assim, economizando tempo de operação




public class TesteDeDesempenhoString {
    public static void main(String[] args) {
    	
    	
    	
        int concatenacoes = 100000; 
        long tempoInicio = System.currentTimeMillis();
        
        
        String stringComum = "";
        StringBuffer buffer = new StringBuffer();
        
        
        
        
//        Teste String comum////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < concatenacoes; i++) {
        	
            stringComum += "S";
        }
        
        long tempoAtual = System.currentTimeMillis();
        
        System.out.println("Tempo usando String comum: " + (tempoAtual - tempoInicio) + "ms");

        
        
//      Teste StringBuffer ////////////////////////////////////////////////////////////////////////////
        tempoInicio = System.currentTimeMillis();
        
        for (int i = 0; i < concatenacoes; i++) {
            buffer.append("a");
        }
        tempoAtual = System.currentTimeMillis();
        
        System.out.println("Tempo usando StringBuffer: " + (tempoAtual - tempoInicio) + "ms");
    }
}
