package br.gov.inpi.system.dao;

import java.util.List;

import br.gov.inpi.system.model.Address;

public interface AddressDAO {
	
	void cadastrar(Address address);
	
	List<Address> listar();
	
	Address listarPorId(Integer id);
	
	void alterar(Address address);
	
	void deletar(Integer id);
	
}
