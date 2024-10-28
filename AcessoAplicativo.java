import java.awt.event.*;
import javax.swing.*;

public class AcessoAplicativo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Acesso ao aplicativo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel userLabel = new JLabel("Usuário:");
        JTextField userText = new JTextField(20);
        JLabel passwordLabel = new JLabel("Senha:");
        JPasswordField passwordText = new JPasswordField(20);
        JButton confirmButton = new JButton("Confirmar");
        JButton cancelButton = new JButton("Cancelar");

        // Layout (você pode personalizar o layout conforme sua preferência)
        JPanel panel = new JPanel();
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(confirmButton);
        panel.add(cancelButton);
        frame.add(panel);

        // ActionListener para o botão Confirmar
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());

                if (user.equals("denys.dj") && password.equals("Teste@2024")) {
                    JOptionPane.showMessageDialog(null, "Acesso confirmado!");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
                }
            }
        });

        // ActionListener para o botão Cancelar
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}