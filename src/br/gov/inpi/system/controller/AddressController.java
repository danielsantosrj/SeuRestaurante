package br.gov.inpi.system.controller;

import org.apache.log4j.Logger;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.caelum.vraptor.view.Results;

@Resource
@Path("/address")
public class AddressController {
	
	static Logger logger = Logger.getLogger(AddressController.class);
	
	private Result result;
	private Validator validator;
	//private SessionUser sessionUser;
	
	public AddressController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
	}
	
	
	@Get("/principal")
	public void index(){
		try{
			
		}catch (Exception e) {
			logger.error("=> ERRO :: RelatorioAvaliacaoController :: index() :: " + e.getMessage()); 
			this.validator.add(new ValidationMessage("Erro interno na aplica&ccedil;&atilde;o, favor entrar em contato com a CGMI","erro"));
			this.validator.onErrorUse(Results.page()).of(AddressController.class).index();
		}
	}
	
	@Get("/cadastrar")
	public void cadastrar(){
		try{
			
		}catch (Exception e) {
			logger.error("=> ERRO :: RelatorioAvaliacaoController :: index() :: " + e.getMessage()); 
			this.validator.add(new ValidationMessage("Erro interno na aplica&ccedil;&atilde;o, favor entrar em contato com a CGMI","erro"));
			this.validator.onErrorUse(Results.page()).of(AddressController.class).cadastrar();
		}
	}

}
