package br.gov.inpi.system.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraBanco {

	public static void main(String[] args) {

//		AnnotationConfiguration cfg = new AnnotationConfiguration();  
//		cfg.addAnnotatedClass(Address.class);  
//		new SchemaExport(cfg).create(true, true);
		
		Configuration cfg = new AnnotationConfiguration();       
		cfg.configure("hibernate.cfg.xml");       
		SchemaExport se = new SchemaExport(cfg);       
		se.create(true, true);
		
	}

}
