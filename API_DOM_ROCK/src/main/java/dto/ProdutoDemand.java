package dto;

public class ProdutoDemand {
	
	public String Vox;
	public String MarketingPlanning;
	public String SalesDistribution;
	public String Pricing;
	public String DadosMinimosVox;
	public String DadosMinimosMarketingPlanning;
	public String DadosMinimosSalesDistribution;
	public String DadosMinimosPricing;
	
	public ProdutoDemand  (String Vox, String MarketingPlanning, String SalesDistribution, String Pricing, 
			String DadosMinimosVox, String DadosMinimosMarketingPlanning, String DadosMinimosSalesDistribution,
			String DadosMinimosPricing) {
		
	}

	public String getVox() {
		return Vox;
	}

	public void setVox(String vox) {
		Vox = vox;
	}

	public String getMarketingPlanning() {
		return MarketingPlanning;
	}

	public void setMarketingPlanning(String marketingPlanning) {
		MarketingPlanning = marketingPlanning;
	}

	public String getSalesDistribution() {
		return SalesDistribution;
	}

	public void setSalesDistribution(String salesDistribution) {
		SalesDistribution = salesDistribution;
	}

	public String getPricing() {
		return Pricing;
	}

	public void setPricing(String pricing) {
		Pricing = pricing;
	}

	public String getDadosMinimosVox() {
		return DadosMinimosVox;
	}

	public void setDadosMinimosVox(String dadosMinimosVox) {
		DadosMinimosVox = dadosMinimosVox;
	}

	public String getDadosMinimosMarketingPlanning() {
		return DadosMinimosMarketingPlanning;
	}

	public void setDadosMinimosMarketingPlanning(String dadosMinimosMarketingPlanning) {
		DadosMinimosMarketingPlanning = dadosMinimosMarketingPlanning;
	}

	public String getDadosMinimosSalesDistribution() {
		return DadosMinimosSalesDistribution;
	}

	public void setDadosMinimosSalesDistribution(String dadosMinimosSalesDistribution) {
		DadosMinimosSalesDistribution = dadosMinimosSalesDistribution;
	}

	public String getDadosMinimosPricing() {
		return DadosMinimosPricing;
	}

	public void setDadosMinimosPricing(String dadosMinimosPricing) {
		DadosMinimosPricing = dadosMinimosPricing;
	}
	
	
}
