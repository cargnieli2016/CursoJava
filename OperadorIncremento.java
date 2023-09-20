public class OperadorIncremento {
    public static void main(String[] args) {
        int totalDownloads = 10;
        totalDownloads++; // pós fixada

        int novoTotalDownloads = ++totalDownloads; // pré fixada

        System.out.println("Total de downloads: " + totalDownloads);
        System.out.println("Novo total de downloads: " + novoTotalDownloads);
    }
}
