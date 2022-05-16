package DTO;

public class Core {
	
	private String webApp;
	private String apiGateway;
	private String filas;
	private String stepFunction;
	private String lambda;
	private String quicksight;
	private String fargate;
	private String conteiners;
	private String s3;
	private String mongodb;
	private String parquet;
	private String cloudwatch;

	
	public Core(String webApp, String apiGateway, String filas, String stepFunction, String lambda, String quicksight,
			String fargate, String conteiners, String s3, String mongodb, String parquet, String cloudwatch) {
		this.webApp = webApp;
		this.apiGateway = apiGateway;
		this.filas = filas;
		this.stepFunction = stepFunction;
		this.lambda = lambda;
		this.quicksight = quicksight;
		this.fargate = fargate;
		this.conteiners = conteiners;
		this.s3 = s3;
		this.mongodb = mongodb;
		this.parquet = parquet;
		this.cloudwatch = cloudwatch;
	}


	public String getWebApp() {
		return webApp;
	}
	public void setWebApp(String webApp) {
		this.webApp = webApp;
	}

	public String getApiGateway() {
		return apiGateway;
	}
	public void setApiGateway(String apiGateway) {
		this.apiGateway = apiGateway;
	}

	public String getFilas() {
		return filas;
	}
	public void setFilas(String filas) {
		this.filas = filas;
	}

	public String getStepFunction() {
		return stepFunction;
	}
	public void setStepFunction(String stepFunction) {
		this.stepFunction = stepFunction;
	}

	public String getLambda() {
		return lambda;
	}
	public void setLambda(String lambda) {
		this.lambda = lambda;
	}

	public String getQuicksight() {
		return quicksight;
	}
	public void setQuicksight(String quicksight) {
		this.quicksight = quicksight;
	}

	public String getFargate() {
		return fargate;
	}
	public void setFargate(String fargate) {
		this.fargate = fargate;
	}

	public String getConteiners() {
		return conteiners;
	}
	public void setConteiners(String conteiners) {
		this.conteiners = conteiners;
	}

	public String getS3() {
		return s3;
	}
	public void setS3(String s3) {
		this.s3 = s3;
	}

	public String getMongodb() {
		return mongodb;
	}
	public void setMongodb(String mongodb) {
		this.mongodb = mongodb;
	}

	public String getParquet() {
		return parquet;
	}
	public void setParquet(String parquet) {
		this.parquet = parquet;
	}

	public String getCloudwatch() {
		return cloudwatch;
	}
	public void setCloudwatch(String cloudwatch) {
		this.cloudwatch = cloudwatch;
	}

}
