
import sistemadereservas.TelaLogin;
import sistemadereservas.Reserva;
import sistemadereservas.Sala;

public class Principal {
    public static void main(String[] args) {
         new TelaLogin().setVisible(true);
        Sala sala = new Sala();
        sala.setId(1);
        sala.setNome("Sala de Reunião");
        sala.setCapacidade(10);

        Reserva reserva = new Reserva();
        reserva.setId(1);
        reserva.setResponsavel("João Silva");
        reserva.setData("2025-05-10");
        reserva.setHorario("14:00");

        System.out.println("Reserva criada:");
        System.out.println("Sala: " + sala.getNome());
        System.out.println("Responsável: " + reserva.getResponsavel());
        System.out.println("Data: " + reserva.getData() + " às " + reserva.getHorario());
    }
}
