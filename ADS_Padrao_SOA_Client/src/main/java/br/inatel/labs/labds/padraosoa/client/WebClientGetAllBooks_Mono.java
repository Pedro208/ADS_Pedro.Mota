package br.inatel.labs.labds.padraosoa.client;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class WebClientGetAllBooks_Mono {
    public static void main(String[] args){
        Mono<BookDTO[]> monoArrayBook = WebClient.create("http://localhost:8080")
                .get()
                .uri("/book")
                .retrieve()
                .bodyToMono(BookDTO[].class);

        monoArrayBook.subscribe();
        BookDTO[] arrayBook = monoArrayBook.block();

        for(BookDTO dto : arrayBook){
            System.out.println(dto);
        }

        //Com Fluz
        List<BookDTO> bookList = new ArrayList<>();

        Flux<BookDTO> fluxBook = WebClient.create("http://10ca1host:8Ø8Ø")
                . get()
                .uri("/book")
                .retrieve()
                .bodyToFlux( BookDTO. class);

        fluxBook.subscribe(b -> bookList. add(b) );
        fluxBook.blockLast();
        bookList.forEach( System.out::println );
    }
}
