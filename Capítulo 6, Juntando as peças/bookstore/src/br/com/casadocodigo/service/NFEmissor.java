package br.com.casadocodigo.service;

import java.util.concurrent.*;
import java.util.concurrent.Flow.*;
import br.com.casadocodigo.model.*;

public class NFEmissor {

  private SubmissionPublisher<NF> publisher;

  public NFEmissor() {
    this.publisher = new SubmissionPublisher<>();
    publisher.subscribe(new NFSubscriber());
  }

  public void emit(String clientName, Book book) {
    NF nf = new NF(clientName, book.getName(), 39.99);
    publisher.submit(nf);
  }

  public void close() {
    this.publisher.close();
  }
}