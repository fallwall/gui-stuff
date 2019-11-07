public class Katakana {
  public static void main(String[] args) {
    // Map<Integer, String> map = new HashMap<Integer, String>();

    String kata = kata();
    System.out.println(kata);
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

  private static String kata() {
    int arrInd = (int) (Math.random() * 11);
    return kataAll[arrInd][(int) (Math.random() * kataAll[arrInd].length)][0];
  }

}