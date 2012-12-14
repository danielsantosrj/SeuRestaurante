package br.gov.inpi.system.model;

import java.util.List;

public class Rest {

	private Integer id;
	private String name;
	private String nickname;
	private Address address;
	private List<Phone> listPhone;
	private boolean selfService;
	private List<Price> listPrice;
	private boolean aLaCarte;
	private List<Dish> listDish;
	private List<EvaluationRest> listEvaluation;
	private Integer averageRating;
	private Integer classification;	
	private String comment;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Phone> getListPhone() {
		return listPhone;
	}
	public void setListPhone(List<Phone> listPhone) {
		this.listPhone = listPhone;
	}
	public boolean isSelfService() {
		return selfService;
	}
	public void setSelfService(boolean selfService) {
		this.selfService = selfService;
	}
	public List<Price> getListPrice() {
		return listPrice;
	}
	public void setListPrice(List<Price> listPrice) {
		this.listPrice = listPrice;
	}
	public boolean isaLaCarte() {
		return aLaCarte;
	}
	public void setaLaCarte(boolean aLaCarte) {
		this.aLaCarte = aLaCarte;
	}
	public List<Dish> getListDish() {
		return listDish;
	}
	public void setListDish(List<Dish> listDish) {
		this.listDish = listDish;
	}
	public List<EvaluationRest> getListEvaluation() {
		return listEvaluation;
	}
	public void setListEvaluation(List<EvaluationRest> listEvaluation) {
		this.listEvaluation = listEvaluation;
	}
	public Integer getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(Integer averageRating) {
		this.averageRating = averageRating;
	}
	public Integer getClassification() {
		return classification;
	}
	public void setClassification(Integer classification) {
		this.classification = classification;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
