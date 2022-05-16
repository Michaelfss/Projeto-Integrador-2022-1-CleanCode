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

import DAO.*;
import DTO.*;

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
    private CheckBox checkBoxPaineisSolucaoEscopo;

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
    private RadioButton radioButtonMarketingPlanningEscopo;

    @FXML
    private RadioButton radioButtonMatchingRiskEscopo;

    @FXML
    private RadioButton radioButtonOptimizationEscopo;

    @FXML
    private RadioButton radioButtonPricingEscopo;

    @FXML
    private RadioButton radioButtonSalesDistributionEscopo;

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
    private TextArea textAreaDadosMinimosEscopo;

    @FXML
    private TextArea textAreaEntregaveisMinimoEscopo;

    @FXML
    private TextArea textAreaEntregaveisPossiveisEscopo;

    @FXML
    private TextArea textAreaObjetivoNegocioEscopo;

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
    void cadastrarNovoClienteEscopo(ActionEvent event) {

        textFieldClienteEscopo.setText("");
        textFieldCnpjEscopo.setText("");
        textFieldRazaoSocialEscopo.setText("");
        textFieldSetorEscopo.setText("");
        textAreaEntregaveisMinimoEscopo.setText("");
        textAreaObjetivoNegocioEscopo.setText("");
        textAreaEntregaveisPossiveisEscopo.setText("");
        textAreaDadosMinimosEscopo.setText("");

        radioButtonVoxEscopo.setSelected(false);
        radioButtonMarketingPlanningEscopo.setSelected(false);
        radioButtonSalesDistributionEscopo.setSelected(false);
        radioButtonPricingEscopo.setSelected(false);
        radioButtonOptimizationEscopo.setSelected(false);
        radioButtonMatchingRiskEscopo.setSelected(false);

        checkBoxWebAppEscopo.setSelected(false);
        checkBoxApiGatewayEscopo.setSelected(false);
        checkBoxFilasEscopo.setSelected(false);
        checkBoxStepFunctionEscopo.setSelected(false);
        checkBoxLambdaEscopo.setSelected(false);
        checkBoxQuicksightEscopo.setSelected(false);
        checkBoxFargateEscopo.setSelected(false);
        checkBoxConteinersEscopo.setSelected(false);
        checkBoxS3Escopo.setSelected(false);
        checkBoxMongodbEscopo.setSelected(false);
        checkBoxParquetEscopo.setSelected(false);
        checkBoxCloudwatchEscopo.setSelected(false);
    }

    @FXML
    void cadastrarNovoProdutoEscopo(ActionEvent event) {
        radioButtonVoxEscopo.setSelected(false);
        radioButtonMarketingPlanningEscopo.setSelected(false);
        radioButtonSalesDistributionEscopo.setSelected(false);
        radioButtonPricingEscopo.setSelected(false);
        radioButtonOptimizationEscopo.setSelected(false);
        radioButtonMatchingRiskEscopo.setSelected(false);

        checkBoxWebAppEscopo.setSelected(false);
        checkBoxApiGatewayEscopo.setSelected(false);
        checkBoxFilasEscopo.setSelected(false);
        checkBoxStepFunctionEscopo.setSelected(false);
        checkBoxLambdaEscopo.setSelected(false);
        checkBoxQuicksightEscopo.setSelected(false);
        checkBoxFargateEscopo.setSelected(false);
        checkBoxConteinersEscopo.setSelected(false);
        checkBoxS3Escopo.setSelected(false);
        checkBoxMongodbEscopo.setSelected(false);
        checkBoxParquetEscopo.setSelected(false);
        checkBoxCloudwatchEscopo.setSelected(false);
    }

    @FXML
    void cadastrarOutroDadoBronze(ActionEvent event) {

    }

    @FXML
    void confirmarCadastroBronze(ActionEvent event) {
        String api = this.radioButtonApiBronze.getText();
        String sftp = this.radioButtonSftpBronze.getText();
        String upload = this.radioButtonUploadBronze.getText();
        String formato = this.textFieldFormatoBronze.getText();
        String volumeDados = this.textAreaVolumeDadosBronze.getText();
        String frequenciaDados = this.textFieldFrequenciaDadosBronze.getText();
        String sistemas = this.textAreaSistemasBronze.getText();

        OrigemDado novoCadastroOrigemDado = new OrigemDado(api, sftp, upload, formato, volumeDados,
        frequenciaDados, sistemas);

        ArrayList<String> OrigemDado = new ArrayList<String>();
        OrigemDado.add(novoCadastroOrigemDado.getApi());
        OrigemDado.add(novoCadastroOrigemDado.getSftp());
        OrigemDado.add(novoCadastroOrigemDado.getUpload());
        OrigemDado.add(novoCadastroOrigemDado.getFormato());
        OrigemDado.add(novoCadastroOrigemDado.getVolumeDados());
        OrigemDado.add(novoCadastroOrigemDado.getFrequenciaDados());
        OrigemDado.add(novoCadastroOrigemDado.getSistemas());
    }

    @FXML
    void confirmarCadastroEscopo(ActionEvent event) {

        /*ClienteDAO clienteDao = new ClienteDAO();
        Cliente c1 = new Cliente(textAreaEntregaveisPossiveisEscopo.getText());
        
         RazaoSocial.setText("");
         CNPJ.setText("");
         Endereco.setText("");
         Numero.setText("");
         CEP.setText("");

        try {
            clienteDao.save(c1);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }*/

        String cliente = this.textFieldClienteEscopo.getText();
        String cnpj = this.textFieldCnpjEscopo.getText();
        String razaoSocial = this.textFieldRazaoSocialEscopo.getText();
        String setor = this.textFieldSetorEscopo.getText();
        String entregaveisMinimos = this.textAreaEntregaveisMinimoEscopo.getText();
        String objetivoNegocio = this.textAreaObjetivoNegocioEscopo.getText();
        String entregaveisPossiveis = this.textAreaEntregaveisPossiveisEscopo.getText();

        String nxtDemandVox = this.radioButtonVoxEscopo.getText();
        String nxtDemandMarketingPlanning = this.radioButtonMarketingPlanningEscopo.getText();
        String nxtDemandSalesDistribution = this.radioButtonSalesDistributionEscopo.getText();
        String nxtDemandPricing = this.radioButtonPricingEscopo.getText();
        String nxtDemandOperationsOptimization = this.radioButtonOptimizationEscopo.getText();
        String nxtDemandOperationsMatchingRisk = this.radioButtonMatchingRiskEscopo.getText();
        String dadosMinimos = this.textAreaDadosMinimosEscopo.getText();

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

        String paineisSolucoes = this.checkBoxPaineisSolucaoEscopo.getText();
        String geradorRelatorios = this.checkBoxGeradorRelatoriosEscopo.getText();
        String buscarNLP = this.checkBoxBuscarNlpEscopo.getText();
        String dataLakeGenerator = this.checkBoxDataLakeGeneratorEscopo.getText();


        Cliente novoCadastroCliente = new Cliente(cliente, cnpj, razaoSocial, setor, entregaveisMinimos,
        entregaveisPossiveis, objetivoNegocio);

        Produto novoCadastroProdutos = new Produto(nxtDemandVox, nxtDemandMarketingPlanning, nxtDemandSalesDistribution,
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
        if(radioButtonVoxEscopo.isSelected()){
            Produtos.add(novoCadastroProdutos.getNxtDemandVox());
        }

        if(radioButtonMarketingPlanningEscopo.isSelected()) {
            Produtos.add(novoCadastroProdutos.getNxtDemandMarketingPlanning());
        }

        if(radioButtonSalesDistributionEscopo.isSelected()) {
            Produtos.add(novoCadastroProdutos.getNxtDemandSalesDistribution());
        }

        if(radioButtonPricingEscopo.isSelected()) {
            Produtos.add(novoCadastroProdutos.getNxtDemandPricing());
        }

        if(radioButtonOptimizationEscopo.isSelected()) {
            Produtos.add(novoCadastroProdutos.getNxtDemandOperationsOptimization());
        }

        if(radioButtonMatchingRiskEscopo.isSelected()) {
            Produtos.add(novoCadastroProdutos.getNxtDemandOperationsMatchingRisk());
        }
    
        Produtos.add(novoCadastroProdutos.getDadosMinimos());


        ArrayList<String> Core = new ArrayList<String>();
        if(checkBoxWebAppEscopo.isSelected()) {
            Core.add(novoCadastroCore.getWebApp());
        }
        
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
    void selecionarOutroClienteBronze(ActionEvent event) {

    }

    @FXML
    void visualizarCadastrosBronze(ActionEvent event) {

    }

    @FXML
    void visualizarCadastrosEscopo(ActionEvent event) {

    }
}
