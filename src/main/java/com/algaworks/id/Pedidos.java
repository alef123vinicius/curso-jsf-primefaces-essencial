package com.algaworks.id;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class Pedidos {
	
	 @Inject
	 private EntityManager manager;
	
	public BigDecimal totalPedidiosMesAtual() {
		return new BigDecimal("100");
	}

}
