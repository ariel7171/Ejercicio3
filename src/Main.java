import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listaOriginal = List.of("Holas", "mundO", "java");

        System.out.println("--------------Lista original---------------");
        listaOriginal.stream().forEach(System.out::println);

        System.out.println("--------------Lista Transformada-----------");
        transformador(listaOriginal).stream().forEach(System.out::println);

        System.out.println("--------------Lista Concatenada-----------");
        System.out.println(transformador(listaOriginal, 4));

    }

    public static List<String> transformador(List<String> lista) {
        return lista.stream()
                .map(palabra -> palabra.toUpperCase())
                .collect(Collectors.toList());
    }

    public static String transformador(List<String> lista, int n) {
        return lista.stream()
                .filter(palabra -> palabra.length() > n)
                .collect(Collectors.joining(", "));
    }
}