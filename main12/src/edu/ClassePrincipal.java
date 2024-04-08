package edu;

public class ClassePrincipal {

	public static void main(String[] args) {
		ClasseConta objeto_conta_um = new ClasseConta();
		ClasseConta objeto_conta_dois = new ClasseConta();
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
		System.out.println(objeto_conta_um.atributoNomeCliente);
		System.out.println(objeto_conta_um.atributoDocumentoCliente);

		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.atributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
		System.out.println(objeto_conta_dois.atributoNomeCliente);
		System.out.println(objeto_conta_dois.atributoDocumentoCliente);
	}

}
