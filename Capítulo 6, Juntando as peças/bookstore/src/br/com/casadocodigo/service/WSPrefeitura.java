package br.com.casadocodigo.service;

import br.com.casadocodigo.model.*;

public class WSPrefeitura {
  
  public static void emit(NF nf) {
    try {
      System.out.println("emitindo...");
      Thread.sleep(5000);
      System.out.println("emitido!");
    } catch(Exception e) {
      System.out.println("falha ao emitir a nf");
    }
  }
}