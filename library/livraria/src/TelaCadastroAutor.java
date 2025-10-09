import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;


//JFrame: é a janela principal.

//JLabel: rótulos para os campos de texto.

//JTextField: campos de texto para o usuário preencher.

//JPasswordField: campo de senha.

//JButton: botão para o usuário enviar os dados.


// Tela de cadastro com Swing

public class TelaCadastroAutor extends JFrame {

    private JLabel labelId, labelNome, labelCidade;
    private JTextField campoId, campoNome, campoCidade;
    private JButton botaoSalvar, botaoFechar;

    public TelaCadastroAutor() {
        setTitle("Cadastro de Autor");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        labelId = new JLabel("ID:");
        labelNome = new JLabel("Nome:");
        labelCidade = new JLabel("Cidade:");

        campoId = new JTextField();
        campoNome = new JTextField();
        campoCidade = new JTextField();

        botaoSalvar = new JButton("Salvar");
        botaoFechar = new JButton("Fechar");

        add(labelId);
        add(campoId);
        add(labelNome);
        add(campoNome);
        add(labelCidade);
        add(campoCidade);
        add(botaoSalvar);
        add(botaoFechar);

        // Ação do botão Salvar
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(campoId.getText().trim());
                    String nome = campoNome.getText().trim();
                    String cidade = campoCidade.getText().trim();

                    if (nome.isEmpty() || cidade.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                        return;
                    }

                    Autor autor = new Autor(id, nome, cidade);

                    try (FileWriter writer = new FileWriter("autores.txt", true)) {
                        writer.write(autor.getNome() + "\n");
                    }

                    JOptionPane.showMessageDialog(null, "Autor salvo no arquivo com sucesso!");

                    // Limpar campos
                    campoId.setText("");
                    campoNome.setText("");
                    campoCidade.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um ID válido (número inteiro).");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar no arquivo: " + ex.getMessage());
                }
            }
        });

        // Ação do botão Fechar
        botaoFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // fecha a aplicação
            }
        });
    }
}