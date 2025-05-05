// Construa uma classe Aviao contendo como atributo um número inteiro representando a quantidade de horas de atividade do avião e 
// implemente nesta classe um método construtor que inicialize este atributo com zero. 
// Crie um método fazVoo(int horas, Piloto piloto) que receba como parâmetro a quantidade de horas do vôo, e um objeto da classe Piloto. 
// Este método deve ser responsável de incrementar a quantidade de horas de atividade do avião e atualizar a quantidade de horas de vôo do piloto. 
// Sabe-se que um avião faz uma revisão a cada 200 horas de atividade. Vôos só devem ser realizados para aviões que tenham feito revisões a cada 200 horas. 
// Crie um método fazRevisao() que zera a quantidade de horas de atividade do avião e um método imprime() que imprima a quantidade de horas de atividade e 
// se o avião precisa ou não de revisão.

public class Aviao {
    private final String nomeAviao;
    private int horasAtividade;

    public Aviao(String nomeAviao) {
        this.horasAtividade = 0;
        this.nomeAviao = nomeAviao;
    }

    public void fazVoo(int horas, Piloto piloto) {
        if (horasAtividade + horas > 200) {
            System.out.println(" Voo " + nomeAviao + " não autorizado: avião precisa de revisão.");
        } else {
            this.horasAtividade += horas;
            piloto.adicionaHoras(horas);
            System.out.println(" Voo " + nomeAviao + " realizado com sucesso!");
        }
    }

    public void fazRevisao() {
        this.horasAtividade = 0;
        System.out.println("Revisão realizada com sucesso! Horas do avião " + nomeAviao + " de atividade zeradas.");
    }

    public void imprime() {
        System.out.println("Horas de Atividade do Avião " + nomeAviao + ": " + horasAtividade);
        if (horasAtividade >= 200) {
            System.out.println(" O avião" + nomeAviao + " precisa de revisão.");
        } else {
            System.out.println(" O avião " + nomeAviao + " não precisa de revisão.");
        }
    }
}