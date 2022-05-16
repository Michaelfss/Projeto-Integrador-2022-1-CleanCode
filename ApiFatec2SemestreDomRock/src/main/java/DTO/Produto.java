package DTO;

public class Produto {
	
	private String nxtDemandVox;
	private String nxtDemandMarketingPlanning;
	private String nxtDemandSalesDistribution;
	private String nxtDemandPricing;
	private String nxtDemandOperationsOptimization;
	private String nxtDemandOperationsMatchingRisk;
	private String dadosMinimos;

	
	public Produto(String nxtDemandVox, String nxtDemandMarketingPlanning, String nxtDemandSalesDistribution,
			String nxtDemandPricing, String nxtDemandOperationsOptimization, String nxtDemandOperationsMatchingRisk,
			String dadosMinimos) {
		this.nxtDemandVox = nxtDemandVox;
		this.nxtDemandMarketingPlanning = nxtDemandMarketingPlanning;
		this.nxtDemandSalesDistribution = nxtDemandSalesDistribution;
		this.nxtDemandPricing = nxtDemandPricing;
		this.nxtDemandOperationsOptimization = nxtDemandOperationsOptimization;
		this.nxtDemandOperationsMatchingRisk = nxtDemandOperationsMatchingRisk;
		this.dadosMinimos = dadosMinimos;
	}


	public String getNxtDemandVox() {
		return nxtDemandVox;
	}
	public void setNxtDemandVox(String nxtDemandVox) {
		this.nxtDemandVox = nxtDemandVox;
	}

	public String getNxtDemandMarketingPlanning() {
		return nxtDemandMarketingPlanning;
	}
	public void setNxtDemandMarketingPlanning(String nxtDemandMarketingPlanning) {
		this.nxtDemandMarketingPlanning = nxtDemandMarketingPlanning;
	}

	public String getNxtDemandSalesDistribution() {
		return nxtDemandSalesDistribution;
	}
	public void setNxtDemandSalesDistribution(String nxtDemandSalesDistribution) {
		this.nxtDemandSalesDistribution = nxtDemandSalesDistribution;
	}

	public String getNxtDemandPricing() {
		return nxtDemandPricing;
	}
	public void setNxtDemandPricing(String nxtDemandPricing) {
		this.nxtDemandPricing = nxtDemandPricing;
	}

	public String getNxtDemandOperationsOptimization() {
		return nxtDemandOperationsOptimization;
	}
	public void setNxtDemandOperationsOptimization(String nxtDemandOperationsOptimization) {
		this.nxtDemandOperationsOptimization = nxtDemandOperationsOptimization;
	}

	public String getNxtDemandOperationsMatchingRisk() {
		return nxtDemandOperationsMatchingRisk;
	}
	public void setNxtDemandOperationsMatchingRisk(String nxtDemandOperationsMatchingRisk) {
		this.nxtDemandOperationsMatchingRisk = nxtDemandOperationsMatchingRisk;
	}

	public String getDadosMinimos() {
		return dadosMinimos;
	}
	public void setDadosMinimos(String dadosMinimos) {
		this.dadosMinimos = dadosMinimos;
	}
}
