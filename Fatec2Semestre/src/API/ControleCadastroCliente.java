package API;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControleCadastroCliente {

    @FXML
    private Button botaoConfirmar;

    @FXML
    private Button botaoProximaPagina;

    @FXML
    private TextField campoCEP;

    @FXML
    private TextField campoCNPJ;

    @FXML
    private TextField campoEndereco;

    @FXML
    private TextField campoNumero;

    @FXML
    private TextField campoRazaoSocial;

    @FXML
    void cadastrarCliente(ActionEvent event) {
        String razaoSocial = campoRazaoSocial.getText();
        String cnpj = campoCNPJ.getText();
        String CEP = campoCEP.getText();
        String endereco = campoEndereco.getText();
        String numero = campoNumero.getText();
        

        System.out.format("Razão Social: %s \nCNPJ: %s, \nCEP: %s \nEndereço: %s, %s",
       razaoSocial, cnpj, CEP, endereco, numero);
    }
}
