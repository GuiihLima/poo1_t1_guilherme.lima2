public class Ponto {
    protected int x;
    protected int y;

    public void defPontos(int point){
        x = point;
        y = point;
        //Caso a mensagem seja de um unico argumento, os pontos sao iguais
    }

    public void defPontos(int m, int n){
        x = m;
        y = n;
        //define os pontos no plano
    }
}
