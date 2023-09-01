public class Main {
    public static void main(String[] args) {
        double celsius = 51.8;
        double fahrenreit;

        fahrenreit = (celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", celsius, fahrenreit);
        System.out.println(mensagem);

        fahrenreit = (int) fahrenreit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + fahrenreit);

    }
}