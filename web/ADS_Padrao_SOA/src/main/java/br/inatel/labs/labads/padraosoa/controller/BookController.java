package br.inatel.labs.labads.padraosoa.controller;

import br.inatel.labs.labads.padraosoa.model.entity.Book;
import br.inatel.labs.labads.padraosoa.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBook(){
        List<Book> books = service.searchBook();
        return books;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") long bookId){
        Optional<Book> opBook = service.findBookById(bookId);

        if(opBook.isPresent()){
            Book book = opBook.get();
            return book;

        }else{
            String msgErro = "There is no book with this id: " + bookId;
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, msgErro);
        }
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Book postBook(@RequestBody Book newBook){
        Book createdBook = service.createBook(newBook);
        return createdBook;
    }
}
