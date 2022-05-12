package dto;

public class Core {
	
	String WebApp;
	String APIGateway;
	String Filas;
	String StepFunction;
	String Lambda;
	String Quicksight;
	String Fargete;
	String Conteiners;
	String S3;
	String Mongodb;
	String Parquet;
	String Cloudwatch;
	
	public Core (String WebApp, String APIGateway, String Filas, String StepFunction, String Lambda, String Quicksight, 
			String Fargete, String Conteiners, String S3, String Mongodb, String Parquet, String Cloudwatch) {
		
		this.WebApp = WebApp;
		this.APIGateway = APIGateway;
		this.Filas = Filas;
		this.StepFunction = StepFunction;
		this.Lambda = Lambda;
		this.Quicksight = Quicksight;
		this.Fargete = Fargete;
		this.Conteiners = Conteiners;
		this.S3 = S3;
		this.Mongodb = Mongodb;
		this.Parquet = Parquet;
		this.Cloudwatch = Cloudwatch;
		
	}

	public String getWebApp() {
		return WebApp;
	}

	public void setWebApp(String webApp) {
		WebApp = webApp;
	}

	public String getAPIGateway() {
		return APIGateway;
	}

	public void setAPIGateway(String aPIGateway) {
		APIGateway = aPIGateway;
	}

	public String getFilas() {
		return Filas;
	}

	public void setFilas(String filas) {
		Filas = filas;
	}

	public String getStepFunction() {
		return StepFunction;
	}

	public void setStepFunction(String stepFunction) {
		StepFunction = stepFunction;
	}

	public String getLambda() {
		return Lambda;
	}

	public void setLambda(String lambda) {
		Lambda = lambda;
	}

	public String getQuicksight() {
		return Quicksight;
	}

	public void setQuicksight(String quicksight) {
		Quicksight = quicksight;
	}

	public String getFargete() {
		return Fargete;
	}

	public void setFargete(String fargete) {
		Fargete = fargete;
	}

	public String getConteiners() {
		return Conteiners;
	}

	public void setConteiners(String conteiners) {
		Conteiners = conteiners;
	}

	public String getS3() {
		return S3;
	}

	public void setS3(String s3) {
		S3 = s3;
	}

	public String getMongodb() {
		return Mongodb;
	}

	public void setMongodb(String mongodb) {
		Mongodb = mongodb;
	}

	public String getParquet() {
		return Parquet;
	}

	public void setParquet(String parquet) {
		Parquet = parquet;
	}

	public String getCloudwatch() {
		return Cloudwatch;
	}

	public void setCloudwatch(String cloudwatch) {
		Cloudwatch = cloudwatch;
	}
	
	

}
