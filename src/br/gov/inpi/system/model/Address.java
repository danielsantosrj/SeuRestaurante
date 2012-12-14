package br.gov.inpi.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Address {

	@Id
	@GeneratedValue
	@Column(name="id_address")
	private Integer id;
	
	@Column(name="id_rest")
	private Rest idRest;
	
	@Column
	private String street;
	
	@Column
	private String number;
	
	@Column
	private String neighborhood;
	
	@Column
	private String city;
	
	
	
	public Address() { }

	public Address(Rest idRest, String street, String number, String neighborhood, String city) {
		this.idRest = idRest;
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.city = city;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Rest getIdRest() {
		return idRest;
	}
	public void setIdRest(Rest idRest) {
		this.idRest = idRest;
	}
	
}
