// Construa uma classe Piloto contendo como atributos a quantidade de horas de vôo e o nome do piloto. 
// Implemente nesta classe um método construtor que receba como parâmetro uma string com o nome do piloto,
// e os métodos de acesso/ modificadores apenas para o atributo do nome do piloto. 
// Todo objeto piloto instanciado deve inicialmente estar com a quantidade de horas de vôo zerada. 
// A classe deve disponibilizar um método adicionaHoras(int horas) que adiciona uma quantidade de horas de vôo ao piloto. 
// Crie um método imprime() que imprima o nome do piloto e a quantidade de horas de vôo, 
// sendo que deverá ser impresso o tipo do piloto: até 200 horas, co-piloto, caso contrário comandante.

public class Piloto {
    private String nome;
    private int horasDeVoo;

    public Piloto(String nome) {
        this.nome = nome;
        this.horasDeVoo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public void adicionaHoras(int horas) {
        if (horas > 0) {
            this.horasDeVoo += horas;
        } else {
            System.out.println("Número de horas inválido.");
        }
    }

    public void imprime() {
        String tipoPiloto;
        if (horasDeVoo <= 200) {
            tipoPiloto = "Co-piloto";
        } else {
            tipoPiloto = "Comandante";
        }
        System.out.println("Nome do Piloto: " + nome);
        System.out.println("Horas de Voo: " + horasDeVoo);
        System.out.println("Tipo de Piloto: " + tipoPiloto);
    }
}