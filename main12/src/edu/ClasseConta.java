package edu;

public class ClasseConta {

	short atributoNumeroConta;
	float atributoSaldoConta;
	String atributoTipoConta;
	
	ClassePessoa atributoPessoa;
	
	void metodoDepositar(float parametroValorEnviar){
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValorEnviar;
	}
	
	void metodoSacar(float parametroValorSaque){
	
		
		if (this.atributoSaldoConta < parametroValorSaque){
			System.out.println("Limite insuficiente! Pobre!");
		} 
		else{
			this.atributoSaldoConta = this.atributoSaldoConta - parametroValorSaque;
		}
	}
	void metodoTransferir(float parametroTransferido, ClasseConta origem, ClasseConta destino){
		origem.atributoSaldoConta -= parametroTransferido;
		destino.atributoSaldoConta += parametroTransferido;
	}
}
