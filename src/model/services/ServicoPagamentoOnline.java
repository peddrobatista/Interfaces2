package model.services;

public interface ServicoPagamentoOnline {
	
	double taxaPagamento(double quantia);
	double juro(double quantia, int meses);
}
