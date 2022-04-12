package API;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControleCadastroCliente {

    @FXML
    private Button botaoConfirmar;

    @FXML
    private TextField campoCNPJ;

    @FXML
    private TextField campoEndereco;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoNumero;

    @FXML
    private TextField campoRazaoSocial;

    @FXML
    void cadastrarCliente(ActionEvent event) {
        String nome = campoNome.getText();
        String razaoSocial = campoRazaoSocial.getText();
        String cnpj = campoCNPJ.getText();
        String endereco = campoEndereco.getText();
        String numero = campoNumero.getText();

        System.out.format("Nome: %s \nRazão Social: %s \nCNPJ: %s \nEndereço: %s, %s",
        nome, razaoSocial, cnpj, endereco, numero);
    }
}
