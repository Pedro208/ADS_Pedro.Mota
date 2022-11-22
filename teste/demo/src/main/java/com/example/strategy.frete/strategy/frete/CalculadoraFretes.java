
public class CalculadoraFretes {
    
    public double calcularValor(String servico, double pesoEmKg) {
        if(servico.equals("sedex")){
            if (pesoEmKg < 10.0){
                return 50.0;
            }
            else if(pesoEmKg <20.0){
                return 70.0;
            }else return 90.0;
            
        }
        if(servico.equals("dhl")){
            if(pesoEmKg <20.0){
                return 100.0;
            }else return 90.0;
        }
        if(servico.equals("jadlog")){
            if(pesoEmKg < 30.0){
                return 0.0;
            }else return 150.0;
        }
        throw new RuntimeException("Serviço desconhecido " + servico);    
    }
}
