package br.com.casadocodigo.model;

import java.util.*;

public class Book {

    private final String name;
    private final String author;
    private final List<Category> categories;

    // outros atributos

    public Book(String name, String author, Category ...categories) {
        this.name = name;
        this.author = author;
		this.categories = List.of(categories);
    }

    public String getAuthor() {
    	return author;
    }

    public String getName() {
    	return name;
    }

    public List<Category> getCategories() {
    	return categories;
    }

    @Override
    public String toString() {
        return "\nLivro " + name
            +  "\nautor: " + author 
            +  "\ncategorias: " + categories;
    }
}