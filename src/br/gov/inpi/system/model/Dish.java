package br.gov.inpi.system.model;

import java.util.List;

public class Dish {

	private Integer id;
	private Integer idRest;
	private String name;
	private String composition;
	private Double price;
	private List<EvaluationDish> listEvaluationDish;
	private String comment;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<EvaluationDish> getListEvaluationDish() {
		return listEvaluationDish;
	}
	public void setListEvaluationDish(List<EvaluationDish> listEvaluationDish) {
		this.listEvaluationDish = listEvaluationDish;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
