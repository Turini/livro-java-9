public class WSPrefeitura {
	
  public static void emit(NF nf) {
    try {
      String thread = Thread.currentThread().getName();
      System.out.println("emitindo na thread " + thread);
      Thread.sleep(5000);
      System.out.println("emitido!");
    } catch(Exception e) {
      System.out.println("falha ao emitir a nf");
    }
  }
}