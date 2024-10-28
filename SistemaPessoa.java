import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaPessoa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenuItem usuariosItem = new JMenuItem("Usuários");
        JMenuItem pessoasItem = new JMenuItem("Pessoas");
        cadastroMenu.add(usuariosItem);
        cadastroMenu.add(pessoasItem);
        menuBar.add(cadastroMenu);
        JMenu visualizarMenu = new JMenu("Visualização");
        JMenuItem listaUsuariosItem = new JMenuItem("Lista de usuários");
        JMenuItem listaPessoasItem = new JMenuItem("Lista de pessoas");
        visualizarMenu.add(listaUsuariosItem);
        visualizarMenu.add(listaPessoasItem);
        menuBar.add(visualizarMenu);
        JMenu sairMenu = new JMenu("Sair");
        JMenuItem sairItem = new JMenuItem("Sair");
        sairItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        sairMenu.add(sairItem);
        menuBar.add(sairMenu);
        frame.setJMenuBar(menuBar);

        // Rodapé
        JLabel rotulo = new JLabel("Versão: 12.1.2024 Usuário: denys.silva Data de acesso: 20/09/2024 10:58");
        frame.add(rotulo, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}