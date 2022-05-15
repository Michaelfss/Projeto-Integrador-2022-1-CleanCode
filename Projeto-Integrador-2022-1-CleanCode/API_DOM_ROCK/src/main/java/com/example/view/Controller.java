package com.example.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.*;


public class Controller {

    @FXML
    private CheckBox checkBoxApiGatewayEscopo;

    @FXML
    private CheckBox checkBoxBuscarNlpEscopo;

    @FXML
    private CheckBox checkBoxCloudwatchEscopo;

    @FXML
    private CheckBox checkBoxConteinersEscopo;

    @FXML
    private CheckBox checkBoxDataLakeGeneratorEscopo;

    @FXML
    private CheckBox checkBoxFargateEscopo;

    @FXML
    private CheckBox checkBoxFilasEscopo;

    @FXML
    private CheckBox checkBoxGeradorRelatoriosEscopo;

    @FXML
    private CheckBox checkBoxLambdaEscopo;

    @FXML
    private CheckBox checkBoxMongodbEscopo;

    @FXML
    private CheckBox checkBoxPaineisSolucoesEscopo;

    @FXML
    private CheckBox checkBoxParquetEscopo;

    @FXML
    private CheckBox checkBoxQuicksightEscopo;

    @FXML
    private CheckBox checkBoxS3Escopo;

    @FXML
    private CheckBox checkBoxStepFunctionEscopo;

    @FXML
    private CheckBox checkBoxWebAppEscopo;

    @FXML
    private RadioButton radioButtonApiBronze;

    @FXML
    private RadioButton radioButtonDemandSalesDistributionEscopo;

    @FXML
    private RadioButton radioButtonMarketingPlanningEscopo;

    @FXML
    private RadioButton radioButtonMatchingRiskEscopo;

    @FXML
    private RadioButton radioButtonOptimizationEscopo;

    @FXML
    private RadioButton radioButtonPricingEscopo;

    @FXML
    private RadioButton radioButtonSftpBronze;

    @FXML
    private RadioButton radioButtonUploadBronze;

    @FXML
    private RadioButton radioButtonVoxEscopo;

    @FXML
    private Tab tabBronze;

    @FXML
    private Tab tabEscopo;

    @FXML
    private Tab tabGold;

    @FXML
    private Tab tabSilver;

    @FXML
    private TextArea textAreaDadosMinimosEscopo;

    @FXML
    private TextArea textAreaEntregaveisMinimoEscopo;

    @FXML
    private TextArea textAreaEntregaveisPossiveisEscopo;

    @FXML
    private TextArea textAreaObjetivoDoNegocioEscopo;

    @FXML
    private TextArea textAreaSistemasBronze;

    @FXML
    private TextArea textAreaVolumeDadosBronze;

    @FXML
    private TextField textFieldClienteEscopo;

    @FXML
    private TextField textFieldCnpjBronze;

    @FXML
    private TextField textFieldCnpjEscopo;

    @FXML
    private TextField textFieldFormatoBronze;

    @FXML
    private TextField textFieldFrequenciaDadosBronze;

    @FXML
    private TextField textFieldRazaoSocialEscopo;

    @FXML
    private TextField textFieldSetorEscopo;

    @FXML
    void bronzeParaSilver(ActionEvent event) {

    }

    @FXML
    void cadastrarNovoClienteEscopo(ActionEvent event) {

    }

    @FXML
    void cadastrarNovoProdutoEscopo(ActionEvent event) {

    }

    @FXML
    void cadastrarOutroDadoBronze(ActionEvent event) {

    }

    @FXML
    void condirmarCadastroBronze(ActionEvent event) {

    }

    @FXML
    void confirmarCadastroEscopo(ActionEvent event) {
        String cliente = this.textFieldClienteEscopo.getText();
        String cnpj = this.textFieldCnpjEscopo.getText();
        String razaoSocial = this.textFieldRazaoSocialEscopo.getText();
        String setor = this.textFieldSetorEscopo.getText();
        String entregaveisMinimos = this.textAreaEntregaveisMinimoEscopo.getText();
        String objetivoNegocio = this.textAreaObjetivoDoNegocioEscopo.getText();
        String entregaveisPossiveis = this.textAreaEntregaveisPossiveisEscopo.getText();

        String nxtDemandVox = this.radioButtonVoxEscopo.getText();
        String nxtDemandMarketingPlanning = this.radioButtonMarketingPlanningEscopo.getText();
        String nxtDemandSalesDistribution = this.radioButtonDemandSalesDistributionEscopo.getText();
        String nxtDemandPricing = this.radioButtonDemandSalesDistributionEscopo.getText();
        String nxtDemandOperationsOptimization = this.radioButtonDemandSalesDistributionEscopo.getText();
        String nxtDemandOperationsMatchingRisk = this.radioButtonDemandSalesDistributionEscopo.getText();
        String dadosMinimos = this.radioButtonDemandSalesDistributionEscopo.getText();

        String webApp = this.checkBoxWebAppEscopo.getText();
        String apiGateway = this.checkBoxApiGatewayEscopo.getText();
	    String filas = this.checkBoxFilasEscopo.getText();
	    String stepFunction = this.checkBoxStepFunctionEscopo.getText();
	    String lambda = this.checkBoxLambdaEscopo.getText();
	    String quicksight = this.checkBoxQuicksightEscopo.getText();
	    String fargate = this.checkBoxFargateEscopo.getText();
	    String conteiners = this.checkBoxConteinersEscopo.getText();
	    String s3 = this.checkBoxS3Escopo.getText();
	    String mongodb = this.checkBoxMongodbEscopo.getText();
	    String parquet = this.checkBoxParquetEscopo.getText();
	    String cloudwatch = this.checkBoxCloudwatchEscopo.getText();

        String paineisSolucoes = this.checkBoxPaineisSolucoesEscopo.getText();
	    String geradorRelatorios = this.checkBoxGeradorRelatoriosEscopo.getText();
	    String buscarNLP = this.checkBoxBuscarNlpEscopo.getText();
	    String dataLakeGenerator = this.checkBoxDataLakeGeneratorEscopo.getText();
        

        Cliente novoCadastroCliente = new Cliente(cliente, cnpj, razaoSocial, setor, entregaveisMinimos,
        entregaveisPossiveis, objetivoNegocio);

        Produtos novoCadastroProdutos = new Produtos(nxtDemandVox, nxtDemandMarketingPlanning, nxtDemandSalesDistribution,
        nxtDemandPricing, nxtDemandOperationsOptimization, nxtDemandOperationsMatchingRisk, dadosMinimos);

        Core novoCadastroCore = new Core(webApp, apiGateway, filas, stepFunction, lambda, quicksight, fargate,
        conteiners, s3, mongodb, parquet, cloudwatch);

        Funcionalidade novoCadastroFuncionalidade = new Funcionalidade(paineisSolucoes, geradorRelatorios,
        buscarNLP, dataLakeGenerator);

        ArrayList<String> Cliente = new ArrayList<String>();
        Cliente.add(novoCadastroCliente.getCliente());
        Cliente.add(novoCadastroCliente.getCnpj());
        Cliente.add(novoCadastroCliente.getRazaoSocial());
        Cliente.add(novoCadastroCliente.getSetor());
        Cliente.add(novoCadastroCliente.getEntregaveisMinimos());
        Cliente.add(novoCadastroCliente.getObjetivoNegocio());
        Cliente.add(novoCadastroCliente.getEntregaveisPossiveis());

        ArrayList<String> Produtos = new ArrayList<String>();
        Produtos.add(novoCadastroProdutos.getNxtDemandVox());
        Produtos.add(novoCadastroProdutos.getNxtDemandMarketingPlanning());
        Produtos.add(novoCadastroProdutos.getNxtDemandSalesDistribution());
        Produtos.add(novoCadastroProdutos.getNxtDemandPricing());
        Produtos.add(novoCadastroProdutos.getNxtDemandOperationsOptimization());
        Produtos.add(novoCadastroProdutos.getNxtDemandOperationsMatchingRisk());
        Produtos.add(novoCadastroProdutos.getDadosMinimos());

        ArrayList<String> Core = new ArrayList<String>();
        Core.add(novoCadastroCore.getWebApp());
        Core.add(novoCadastroCore.getApiGateway());
        Core.add(novoCadastroCore.getFilas());
        Core.add(novoCadastroCore.getStepFunction());
        Core.add(novoCadastroCore.getLambda());
        Core.add(novoCadastroCore.getQuicksight());
        Core.add(novoCadastroCore.getFargate());
        Core.add(novoCadastroCore.getConteiners());
        Core.add(novoCadastroCore.getS3());
        Core.add(novoCadastroCore.getMongodb());
        Core.add(novoCadastroCore.getParquet());
        Core.add(novoCadastroCore.getCloudwatch());

        ArrayList<String> Funcionalidade = new ArrayList<String>();
        Funcionalidade.add(novoCadastroFuncionalidade.getPaineisSolucoes());
        Funcionalidade.add(novoCadastroFuncionalidade.getGeradorRelatorios());
        Funcionalidade.add(novoCadastroFuncionalidade.getBuscarNLP());
        Funcionalidade.add(novoCadastroFuncionalidade.getDataLakeGenerator());
        

        JOptionPane.showConfirmDialog(null, Cliente);
        JOptionPane.showConfirmDialog(null, Produtos);
        JOptionPane.showConfirmDialog(null, Core);
        JOptionPane.showConfirmDialog(null, Funcionalidade);
    }

    @FXML
    void escopoParaBronze(ActionEvent event) {

    }

    @FXML
    void selecionarOutroClienteBronze(ActionEvent event) {

    }

    @FXML
    void visualizarCadastrosBronze(ActionEvent event) {

    }

    @FXML
    void visualizarCadastrosEscopo(ActionEvent event) {

    }
}
