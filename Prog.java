
public class Prog {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato("Campeonato Brasileiro");
        TimeFutebol time1 = new TimeFutebol("Time A", 0);
        TimeFutebol time2 = new TimeFutebol("Time B", 1);

        campeonato.realizaJogo(time1, time2);
        campeonato.imprime();

        TimeFutebol time3 = new TimeFutebol("Time C", 1);
        TimeFutebol time4 = new TimeFutebol("Time D", 0);

        campeonato.realizaJogo(time3, time4);
        campeonato.imprime();
    }
}
