package API;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class API extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TelaCadastroCliente.fxml"));
        Parent root = fxmlLoader.load();
        Scene TelaCadastroCliente = new Scene(root);

        primaryStage.setTitle("Cadastro de Cliente");
        primaryStage.setScene(TelaCadastroCliente);
        primaryStage.show();
    }
}
