package sistemadereservas;

import javax.swing.*;
import sistemadereservas.TelaMenu;

public class TelaLogin extends JFrame {
    public TelaLogin() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel labelUser = new JLabel("Usuário:");
        JTextField fieldUser = new JTextField(15);
        JLabel labelTipo = new JLabel("Tipo (admin ou padrao):");
        JTextField fieldTipo;
        fieldTipo = new JTextField(15);
        JButton btnLogin = new JButton("Entrar");

        btnLogin.addActionListener(e -> {
            String tipo = fieldTipo.getText().toLowerCase();
            if (tipo.equals("admin") || tipo.equals("padrao")) {
                new TelaMenu(tipo).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Tipo inválido. Use 'admin' ou 'padrao'.");
            }
        });

        panel.add(labelUser);
        panel.add(fieldUser);
        panel.add(labelTipo);
        panel.add(fieldTipo);
        panel.add(btnLogin);
        add(panel);
    }
}