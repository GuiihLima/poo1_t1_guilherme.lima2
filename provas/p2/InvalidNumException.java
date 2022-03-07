package p2;

public class InvalidNumException extends IllegalArgumentException{
    public InvalidNumException() {
        throw new IllegalArgumentException("Valor de carga horária inválido");
    }
}
