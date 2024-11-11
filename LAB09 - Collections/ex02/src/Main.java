import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Deque<Estudante> studentDeque = new ArrayDeque<>();

        studentDeque.add(new Estudante("Alice"));
        studentDeque.add(new Estudante("Bob"));
        studentDeque.add(new Estudante("Charlie"));

        try {
            Estudante primeiroEstudante = studentDeque.pollFirst();
            if (primeiroEstudante != null) {
                System.out.println("Primeiro estudante: " + primeiroEstudante.getNome());
            } else {
                System.out.println("O deque está vazio.");
            }

            Estudante ultimoEstudante = studentDeque.removeLast();
            System.out.println("Último estudante: " + ultimoEstudante.getNome());

            Estudante peekFirstStudent = studentDeque.getFirst();
            System.out.println("Primeiro estudante (sem removê-lo): " + peekFirstStudent.getNome());

        } catch (NoSuchElementException e) {
            System.out.println("Exceção: O deque está vazio. Não é possível realizar a operação.");
            e.printStackTrace();
        }
    }
}
