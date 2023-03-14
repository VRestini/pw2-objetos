import java.time.LocalDate;

public class CandidatoTeste {
    public static void main(String[] args) {
        Candidato candidato = new Candidato();
        candidato.nome = "Vitor";
        candidato.dtnasc = LocalDate.of(2006, 10, 21);
        candidato.email="vitorsouzalibrelonrestini@gmail.com";
        candidato.celular="(11) 99450-9293";
        candidato.escolaridade="Ensino Médio completo";
        candidato.funcao="Aluno";
        candidato.salario= 10000;
        candidato.empregado=false;
        candidato.estagio=false;
    }
}
