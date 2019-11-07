
// import java.util.Scanner;

public class Katakana {
  String[] kata;
  // private static final Scanner input = new Scanner(System.in);
  public Katakana() {
    this.kata = kata();
  }
  public static void main(String[] args) {
    // Map<Integer, String> map = new HashMap<Integer, String>();
    // do {
    //   String[] kata = kata();
    //   System.out.format("Try this kata %s. \r\n", kata[0]);
    //   boolean resp = guess(kata);
    //   if (resp) {
    //     System.out.println("you got it.");
    //   } else {
    //     System.out.format("Wrong. It's %s. \r\n", kata[1]);
    //   }
    // } while (true);
    Katakana demo = new Katakana();
    System.out.println(demo.kata[0]);

  }

  private static final String[][] kataO = { { "ア", "a" }, { "イ", "i" }, { "ウ", "u" }, { "エ", "e" }, { "オ", "o" } };
  private static final String[][] kataK = { { "カ", "ka" }, { "キ", "ki" }, { "ク", "ku" }, { "ケ", "ke" }, { "コ", "ko" } };
  private static final String[][] kataS = { { "サ", "sa" }, { "シ", "si" }, { "ス", "su" }, { "セ", "se" }, { "ソ", "so" } };
  private static final String[][] kataT = { { "タ", "ta" }, { "チ", "ti" }, { "ツ", "tu" }, { "テ", "te" }, { "ト", "to" } };
  private static final String[][] kataN = { { "ナ", "na" }, { "ニ", "ni" }, { "ヌ", "nu" }, { "ネ", "ne" }, { "ノ", "no" } };
  private static final String[][] kataH = { { "ハ", "ha" }, { "ヒ", "hi" }, { "フ", "hu" }, { "ヘ", "he" }, { "ホ", "ho" } };
  private static final String[][] kataM = { { "マ", "ma" }, { "ミ", "mi" }, { "ム", "mu" }, { "メ", "me" }, { "モ", "mo" } };
  private static final String[][] kataY = { { "ヤ", "ya" }, { "ユ", "yu" }, { "ヨ", "yo" } };
  private static final String[][] kataR = { { "ラ", "ra" }, { "リ", "ri" }, { "ル", "ru" }, { "レ", "re" }, { "ロ", "ro" } };
  private static final String[][] kataW = { { "ワ", "wa" }, { "ヰ", "wi" }, { "ヱ", "we" }, { "ヲ", "wo" } };
  private static final String[][] kataA = { { "ン", "n" } };

  private static final String[][][] kataAll = { kataO, kataK, kataS, kataT, kataN, kataH, kataM, kataY, kataR, kataW,
      kataA };

  private static String[] kata() {
    int arrInd = (int) (Math.random() * 11);
    return kataAll[arrInd][(int) (Math.random() * kataAll[arrInd].length)];
  }

  // private static boolean guess(String[] kata) {
  //   System.out.println("Enter:");
  //   String answer = input.next();
  //   return answer.contentEquals(kata[1]) ? true : false;
  // }

}