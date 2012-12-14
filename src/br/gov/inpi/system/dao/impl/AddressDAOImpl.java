package br.gov.inpi.system.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.gov.inpi.system.dao.AddressDAO;
import br.gov.inpi.system.model.Address;

public class AddressDAOImpl implements AddressDAO {
	
	private final Session session;

	public AddressDAOImpl(Session session) {
		this.session = session;
	}

	public void cadastrar(Address address) {
		try{
			session.save(address);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Address> listar() {
		List<Address> listAddress = new ArrayList<Address>();
		try {
			Criteria criteria = session.createCriteria(Address.class);
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			listAddress = criteria.list();
			
			return listAddress;			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return null;
	}

	public Address listarPorId(Integer id) {
		try {
			Criteria criteria = session.createCriteria(Address.class);
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			criteria.add(Restrictions.eq("id", id));
			Address address = (Address) criteria.uniqueResult();
			
			return address;			
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return null;
	}

	public void alterar(Address address) {
		try{
			session.update(address);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void deletar(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
