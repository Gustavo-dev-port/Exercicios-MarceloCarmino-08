// Construa uma classe Campeonato contendo como atributo um número inteiro representando a quantidade de jogos realizados 
// e implemente nesta classe um método construtor que inicialize este atributo com zero. 
// Crie um método realizaJogo(TimeFutebol timeCasa, TimeFutebol timeVisitante) que recebe como parâmetro dois objeto da classe TimeFutebol.
// Este método é responsável em analisar e registrar o resultado do jogo para cada time. 
// Sabe-se que um time retranqueiro sempre ganha quando joga na casa de um adversário que joga no ataque. 
// Times que jogam no ataque em jogos na casa do adversário sempre ganham. As outras combinações, sempre resultam em empate. 
// Crie um método imprime() que imprima a quantidade de jogos realizados no campeonato.

public class Campeonato {
    private final String nomeCampeonato;
    private int jogosRealizados;

    public Campeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
        this.jogosRealizados = 0;
    }

    public void realizaJogo(TimeFutebol timeCasa, TimeFutebol timeVisitante) {
        if (timeCasa.getEstiloJogo() == 0 && timeVisitante.getEstiloJogo() == 1) {
            timeCasa.venceu();
            timeVisitante.perdeu();
            System.out.println("Time " + timeCasa.getNome() + " venceu o jogo contra " + timeVisitante.getNome());
        } else if (timeCasa.getEstiloJogo() == 1 && timeVisitante.getEstiloJogo() == 0) {
            timeCasa.perdeu();
            timeVisitante.venceu();
            System.out.println("Time " + timeVisitante.getNome() + " venceu o jogo contra " + timeCasa.getNome());
        } else {
            timeCasa.empatou();
            timeVisitante.empatou();
            System.out.println(
                    "O jogo entre " + timeCasa.getNome() + " e " + timeVisitante.getNome() + " terminou em empate.");
        }
        jogosRealizados++;
    }

    public void imprime() {
        System.out.println("Quantidade de jogos realizados no campeonato" + nomeCampeonato + ": " + jogosRealizados);
    }
}
