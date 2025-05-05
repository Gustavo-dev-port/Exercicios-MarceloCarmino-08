// Construa uma classe TimeFutebol contendo como atributos: o nome do time, um inteiro que representa a quantidade de jogos realizados pelo time, 
// um inteiro que indica o número de pontos ganhos, e um inteiro que segue a seguinte representação: 
// 0 – retranqueiro, 1 – joga no ataque. 
// Implemente nesta classe um método construtor que receba como parâmetro uma string com o nome do time e um inteiro indicando se o time é retranqueiro ou joga no ataque. 
// Este método construtor deve inicializar a quantidade de jogos e os pontos ganhos com zero. 
// Crie apenas um método de acesso para retornar o valor do estilo de jogo do time. 
// A classe deve disponibilizar um método venceu(), um método empatou(), e um método perdeu() para registrar respectivamente 
// a vitória (3 pontos), empate (1 ponto), e derrota (0 pontos), atualizando devidamente os pontos ganhos e jogos realizados. 
// Crie um método imprime que imprima qual a situação do time.

public class TimeFutebol {
    String nomeTime;
    int jogosRealizados;
    int pontosGanhos;
    int estiloJogo;

    public TimeFutebol(String nomeTime, int estiloJogo) {
        this.nomeTime = nomeTime;
        this.estiloJogo = estiloJogo;
        this.jogosRealizados = 0;
        this.pontosGanhos = 0;
    }

    public int getEstiloJogo() {
        return estiloJogo;
    }

    public String getNome() {
        return nomeTime;
    }

    public void venceu() {
        pontosGanhos += 3;
        jogosRealizados++;
    }

    public void empatou() {
        pontosGanhos += 1;
        jogosRealizados++;
    }

    public void perdeu() {
        jogosRealizados++;
    }

    public void imprime() {
        System.out.println("Nome do time: " + nomeTime);
        System.out.println("Jogos realizados: " + jogosRealizados);
        System.out.println("Pontos ganhos: " + pontosGanhos);
        if (estiloJogo == 0) {
            System.out.println("Estilo de jogo: Retranqueiro");
        } else {
            System.out.println("Estilo de jogo: Joga no ataque");
        }
    }
}