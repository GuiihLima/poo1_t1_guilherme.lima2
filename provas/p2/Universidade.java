package p2;

public class Universidade {

    public static void main(String[] args) {
        Universitarios[] estudantes = {
                new EstudanteGrad("Maria Joaquina", "012.123.432-44", "12411BSI382"),
                new EstudanteGrad("Jaime Palillo", "231.123.222-46", "12421BSI082"),
                new EstudanteGrad("Kokimoto Mishima", "982.147.472-34", "12421BSI142"),
                new EstudantePosGrad("Cirilo Rivera", "482.347.472-44", "12313CCP105"),
                new EstudantePosGrad("Valéria Ferreira", "352.147.482-35", "12213CCP055"),
                new EstudantePosGrad("Helena Fernandes", "788.245.742-94", "12213CCP048")
        };

        estudantes[0].informacoesUniversitario();
        estudantes[1].informacoesUniversitario();
        estudantes[2].informacoesUniversitario();
        estudantes[3].informacoesUniversitario();
        estudantes[4].informacoesUniversitario();
        estudantes[5].informacoesUniversitario();

        try{
            estudantes[1].setCargaHorariaDisciplinas(3001);
         }catch(InvalidNumException e){
            System.out.println(e);
         }

    }
}
