package br.inatel.labs.labds.padraosoa.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

public class WebClientDeleteBookById {
    public static void main(String[] args){

        try{
            Mono<ResponseEntity<Void>> monoVoid = WebClient.create("http://localhost:8080")
                    .put()
                    .uri("/book")
                    .retrieve()
                    .toBodilessEntity();

            monoVoid.subscribe();
            ResponseEntity<Void> responseEntity = monoVoid.block();
            System.out.println( responseEntity.getStatusCode());
        }catch (WebClientResponseException e){
            e.printStackTrace();
        }
    }
}
