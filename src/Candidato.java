import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Candidato {
    public String nome;
    public LocalDate dtnasc;
    public String email;
    public String celular;
    public String escolaridade;
    public String funcao;
    public double salario;
    public boolean empregado;
    public boolean estagio;
    private String ano;

    public String idade(){
        LocalDate.now().getYear();
        if (dtnasc.getYear() < 2005 ){
            ano = ("Maior de idade");
            return ano;
        }
        else{
            ano = ("menor de idade");
            return ano;
        }
    }
    void exibir(){
        System.out.println(idade());
    }
    void cursando(){
        if(estagio = true){
            if (escolaridade != "Cursando ensino médio" || escolaridade != "Cursando ensino superior" ){
                System.out.println("O estágio só será permitido caso esteja cursando um curso, favor alterar sua escolha");
            }
        }
    }
}



