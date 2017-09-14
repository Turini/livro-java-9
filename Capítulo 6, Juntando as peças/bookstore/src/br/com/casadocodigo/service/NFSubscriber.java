package br.com.casadocodigo.service;

import java.util.concurrent.*;
import java.util.concurrent.Flow.*;
import br.com.casadocodigo.model.*;

public class NFSubscriber implements Subscriber<NF> {

  private Subscription subscription;

  @Override  
  public void onSubscribe(Subscription subscription) {  
    this.subscription = subscription;  
    subscription.request(1); 
  }  
  
  @Override  
  public void onNext(NF nf) {  
    WSPrefeitura.emit(nf); 
    subscription.request(1); 
  }  
  
  @Override  
  public void onError(Throwable t) {  
    t.printStackTrace();  
  }  
  
  @Override  
  public void onComplete() {  
    System.out.println(
		"Todas as notas foram emitidas"); 
  }  
}