public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        System.out.println(container.getCount());

        for (char c = 'А'; c <= 'я'; c++) {
            System.out.println((int) c);
        }

        System.out.println((int) 'Ё');
        System.out.println((int) 'ё');
    }
}
