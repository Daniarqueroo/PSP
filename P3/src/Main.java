import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder(args);
        pb.start();
    }
}
