package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoContratado {
	
	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContratado(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processoContrato(Contrato contrato, int meses) {
		
		double parcelaBasica = contrato.getValorTotal() / meses;
		
		for (int i = 1; i <= meses; i++) {
			LocalDate dataVencimento = contrato.getData().plusMonths(i);
			
			double juro = servicoPagamentoOnline.juro(parcelaBasica, i);
			
			double taxa = servicoPagamentoOnline.taxaPagamento(parcelaBasica + juro);
			
			double parcela = parcelaBasica + juro + taxa;
			
			contrato.getParcelas().add(new Parcela(dataVencimento, parcela));
		}
	}
}
