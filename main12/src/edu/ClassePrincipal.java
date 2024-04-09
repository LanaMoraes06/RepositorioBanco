package edu;

public class ClassePrincipal {

	public static void main(String[] args) {
		ClasseConta objeto_conta_um = new ClasseConta();
		ClasseConta objeto_conta_dois = new ClasseConta();
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
		 

		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.atributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
		
		objeto_conta_um.atributoNumeroConta = 123;
		objeto_conta_um.atributoSaldoConta = 2_600.00F; 
		objeto_conta_um.atributoTipoConta = "Conta Poupança";
		
		objeto_conta_dois.atributoNumeroConta = 789;
		objeto_conta_dois.atributoSaldoConta = 4_000.00F;
		objeto_conta_dois.atributoTipoConta = "Conta Corrente";
		
		System.out.println();
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
		
		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.atributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
		
		objeto_conta_um.atributoPessoa = new ClassePessoa(); 
		
		objeto_conta_um.atributoPessoa.atributoNomeCliente = "Lana Linda";
		objeto_conta_um.atributoPessoa.atributoDocumentoPessoa = 333;
		
		objeto_conta_um.atributoPessoa = new ClassePessoa(); 
		
		objeto_conta_dois.atributoPessoa.atributoNomeCliente = "Lana Maravilhosa";
		objeto_conta_dois.atributoPessoa.atributoDocumentoPessoa = 444;
		
		objeto_conta_um.metodoDepositar(500.00F);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		
		objeto_conta_um.metodoSacar(1_000.00F);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		
		objeto_conta_um.metodoTransferir(500.00f, objeto_conta_um, objeto_conta_dois);
		
		System.out.println(objeto_conta_um.atributoSaldoConta);
	}

}
