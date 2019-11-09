
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class FunkyTypewriter {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("sf.txt");
    System.out.println(path);
    typewriter(path);
  }

  private static void typewriter(Path path) {

    try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

      String line;
      while ((line = br.readLine()) != null) {
        TimeUnit.SECONDS.sleep(1);
        CharBuffer buffer = CharBuffer.allocate(100);
        for (int i = 0; i < line.length(); i++) {
          char c = line.charAt(i);
          buffer.put(c);
        }

        buffer.flip();

        while (buffer.hasRemaining()) {
          TimeUnit.MILLISECONDS.sleep(300);
          char n = buffer.get();
          System.out.print(COLORS[(int) (Math.random() * COLORS.length)] + n + COLOR_RESET);
        }
        System.out.format("\r\n");
        // buffer.clear();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static final String COLOR_RESET = "\u001B[0m";

  public static final String COLOR_BLACK = "\u001B[40m";
  public static final String COLOR_RED = "\u001B[41m";
  public static final String COLOR_GREEN = "\u001B[42m";
  public static final String COLOR_YELLOW = "\u001B[43m";
  public static final String COLOR_BLUE = "\u001B[44m";
  public static final String COLOR_PURPLE = "\u001B[45m";
  public static final String COLOR_CYAN = "\u001B[46m";
  public static final String COLOR_WHITE = "\u001B[47m";

  public static final String[] COLORS = { COLOR_BLACK, COLOR_RED, COLOR_GREEN, COLOR_YELLOW, COLOR_BLUE, COLOR_PURPLE,
      COLOR_CYAN, COLOR_WHITE };

}