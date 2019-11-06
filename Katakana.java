import sun.net.www.content.text.plain;

public class Katakana {
  public static void main(String[] args) {
    String kata = kata();
    System.out.println(kata);
  }

  private static final String[] kataO = { "ア", "イ", "ウ", "エ", "オ" };
  private static final String[] kataK = { "カ", "キ", "ク", "ケ", "コ" };
  private static final String[] kataS = { "サ", "シ", "ス", "セ", "ソ" };
  private static final String[] kataT = { "タ", "チ", "ツ", "テ", "ト" };
  private static final String[] kataN = { "ナ", "ニ", "ヌ", "ネ", "ノ" };
  private static final String[] kataH = { "ハ", "ヒ", "フ", "ヘ", "ホ" };
  private static final String[] kataM = { "マ", "ミ", "ム", "メ", "モ" };
  private static final String[] kataY = { "ヤ", "ユ", "ヨ" };
  private static final String[] kataR = { "ラ", "リ", "ル", "レ", "ロ" };
  private static final String[] kataW = { "ワ", "ヰ", "ヱ", "ヲ"};
  private static final String[] kataA = { "ン"};
  
  private static final String[][] kataAll = { kataO, kataK, kataS, kataT, kataN, kataH, kataM, kataY, kataR, kataW, kataA};

  
  private static String kata() {
    int arrInd = (int) Math.round(Math.random() * 11);
    return kataAll[arrInd][(int) Math.round(Math.random() * kataAll[arrInd].length)];
  }
  
}