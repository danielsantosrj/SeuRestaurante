package br.gov.inpi.system.model;

public class Price {

	private Integer id;
	private Integer idRest;
	private Double priceHundredGrams;
	private String conditions;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdRest() {
		return idRest;
	}
	public void setIdRest(Integer idRest) {
		this.idRest = idRest;
	}
	public Double getPriceHundredGrams() {
		return priceHundredGrams;
	}
	public void setPriceHundredGrams(Double priceHundredGrams) {
		this.priceHundredGrams = priceHundredGrams;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	
}
