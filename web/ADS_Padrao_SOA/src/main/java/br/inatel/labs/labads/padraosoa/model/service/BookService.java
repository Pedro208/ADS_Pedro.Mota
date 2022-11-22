package br.inatel.labs.labads.padraosoa.model.service;

import br.inatel.labs.labads.padraosoa.model.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private List<Book> bookList = new ArrayList<>();

    public List<Book> searchBook(){
        return bookList;
    }
    public Optional<Book> findBookById(Long id){
        Optional<Book> bookEncontrado = bookList.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();

        return bookEncontrado;
    }

    public Book createBook(Book b){

        return b;
    }
}
