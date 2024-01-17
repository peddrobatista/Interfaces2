package model.entities;

import java.util.Date;

public class Parcela {
	private Date dataVencimento;
	private Double quantia;
	
	public Parcela() {
		
	}

	public Parcela(Date dataVencimento, Double quantia) {
		this.dataVencimento = dataVencimento;
		this.quantia = quantia;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}
	
}
