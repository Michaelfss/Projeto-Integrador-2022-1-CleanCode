package com.example.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloAplication extends Application {

	@Override
	public void start(Stage cadastroStage) throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(HelloAplication.class.getResource("AtivacaoCadastro.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        cadastroStage.setTitle("Ativação de Clientes DomRock");
        cadastroStage.setScene(tela);
        cadastroStage.show();
        
	}
    public static void main(String[] args) {
    		launch(args);
	}
}
