package br.gov.inpi.system.model;

public class EvaluationRest {

	private Integer id;
	private Integer idRest;
	private Integer conceptMain;
	private String comment;
	private User user;
	/* Add news concepts */
	
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
	public Integer getConceptMain() {
		return conceptMain;
	}
	public void setConceptMain(Integer conceptMain) {
		this.conceptMain = conceptMain;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
