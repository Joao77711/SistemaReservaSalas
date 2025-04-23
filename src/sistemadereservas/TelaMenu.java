package sistemadereservas;

import javax.swing.*;

public class TelaMenu extends JFrame {
    public TelaMenu(String tipoUsuario) {
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton btnCadastrarSala = new JButton("Cadastrar Sala");
        JButton btnReservarSala = new JButton("Reservar Sala");
        JButton btnConsultarReservas = new JButton("Consultar Reservas");

        if (tipoUsuario.equals("admin")) {
            panel.add(btnCadastrarSala);
        }
        panel.add(btnReservarSala);
        panel.add(btnConsultarReservas);

        add(panel);
    }
}