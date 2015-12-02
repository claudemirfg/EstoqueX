package br.com.estoque.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.estoque.dao.AbateDAO;
import br.com.estoque.model.Abate;

@ManagedBean
@SessionScoped
public class AbateBean {
	
	private Abate abate;
	
	@PostConstruct
	public void init() {
		AbateDAO abateDAO = new AbateDAO();

	}
}
