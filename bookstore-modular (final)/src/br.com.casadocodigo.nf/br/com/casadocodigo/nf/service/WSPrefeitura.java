package br.com.casadocodigo.nf.service;

import br.com.casadocodigo.nf.model.*;
import br.com.casadocodigo.tracking.*;

public class WSPrefeitura {
  
  public static void emit(NF nf) {
    try {
      System.out.println("emitindo...");
      Thread.sleep(5000);
      System.out.println("emitido!");
      throw new RuntimeException();
    } catch(Exception e) {
      System.out.println("falha ao emitir a nf");
      Stack.logDebugTrace();
    }
  }
}