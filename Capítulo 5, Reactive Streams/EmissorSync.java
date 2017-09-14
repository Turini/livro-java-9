public class EmissorSync {
	
	public static void main(String[] args) {
		// venda concluída
		System.out.println("Gerando a nota");
		NF nf = new NF("Turini", "Livro Java 9", 39.99);
		WSPrefeitura.emit(nf);
		// outras ações necessárias
		System.out.println("Parabéns pela sua compra");
	}
}