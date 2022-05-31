package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entidades.Banco;
import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.ContaCorrente;
import com.example.demo.entidades.ContaPoupanca;

@SpringBootApplication
public class BancoCentralApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoCentralApplication.class, args);

		Cliente cliente = new Cliente();
		cliente.setNome("Renato Pereira");

		ContaCorrente cc = new ContaCorrente(cliente);
		ContaPoupanca poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		
	}

}
