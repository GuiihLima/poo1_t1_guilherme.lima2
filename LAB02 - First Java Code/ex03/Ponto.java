package ex03;

public class Ponto {
    public int x, y;

    public Ponto() {

    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto soma_ponto(Ponto a, Ponto b) {
        return new Ponto((a.x + b.x), (a.y + b.y));
    }

    public static void soma_ponto(Ponto a, Ponto b, Ponto c) {
        c.x = (a.x + b.x);
        c.y = (a.y + b.y);
    }

    public static int calc_area(Ponto a, Ponto b) {
        int area;
        if (a.x == b.x || a.y == b.y)
            return 0;
        else {
            int x1 = Math.max(a.x, b.x);
            int x2 = Math.min(a.x, b.x);
            int y1 = Math.max(a.y, b.y);
            int y2 = Math.min(a.y, b.y);

            area = (x1 - x2) * (y1 - y2);
        }
        return area;
    }

    public static void mult_ponto(Ponto a, int c) {
        a.x = a.x * c;
        a.y = a.y * c;
    }

    public void inc_dir(char option) {
        imprime_ponto();
        switch (option) {
            case 'n':
                this.y++;
                System.out.print(" norte => ");
                break;

            case 's':
                this.y--;
                System.out.print(" sul => ");
                break;

            case 'l':
                this.x++;
                System.out.print(" leste => ");
                break;

            case 'o':
                this.x--;
                System.out.print(" oeste => ");
                break;

            default:
                break;
        }
        imprime_ponto();
    }

    public void inc_diag(String option) {
        imprime_ponto();
        switch (option) {
            case "sudeste":
                inc_dir('s');
                inc_dir('l');
                System.out.print(" sudeste => ");
                break;

            case "sudoeste":
                inc_dir('s');
                inc_dir('o');
                System.out.print(" sudoeste => ");
                break;

            case "nordeste":
                inc_dir('n');
                inc_dir('l');
                System.out.print(" nordeste => ");
                break;

            case "noroeste":
                inc_dir('n');
                inc_dir('o');
                System.out.print(" noroeste => ");
                break;

            default:
                break;
        }
        imprime_ponto();
    }

    public void imprime_ponto() {
        System.out.printf("(%d, %d)", x, y);
    }
}
