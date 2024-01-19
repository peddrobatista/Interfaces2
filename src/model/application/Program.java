package model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.ServicoContratado;
import model.services.ServicoPayPal;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Digite os dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Digite o número de parcelas: ");
		int n = sc.nextInt();
		
		ServicoContratado servicoContratado = new ServicoContratado(new ServicoPayPal());
		
		servicoContratado.processoContrato(contrato, n);
		
		System.out.println("Parcelas: ");
		for (Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}

}
