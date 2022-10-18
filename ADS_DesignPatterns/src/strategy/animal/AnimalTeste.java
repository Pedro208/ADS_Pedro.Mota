package strategy.frete;
import java.util.ArrayList;
import java.util.List;


public class AnimalTeste {
    @Test
    void deveListaAnimal(){
        List<Animal> listaAniamais = new ArrayList<>();

        Animal a1 = new Animal("Tartaruga");
        Animal a2 = new Animal("Coelho");
        Animal a3 = new Animal("Cachorro");
        Animal a4 = new Animal("Gato");
        Animal a5 = new Animal("Girafa");

        listaAniamais.add(a1);
        listaAniamais.add(a2);
        listaAniamais.add(a3);
        listaAniamais.add(a4);
        listaAniamais.add(a5);

        System.out.println(listaAniamais);

        listaAniamais.sort(new Comparador);


    }
}
