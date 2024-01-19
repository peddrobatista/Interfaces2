package model.services;

public class ServicoPayPal implements ServicoPagamentoOnline {
	
	@Override
	public double taxaPagamento(double quantia) {
		return quantia * 0.02;
	}
	
	@Override
	public double juro(double quantia, int meses) {
		return quantia * 0.01 * meses;
	}
}
