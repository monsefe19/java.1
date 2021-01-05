public class StirngDemo {
  public static void main(String[] args) {
      String sentence = "Text processing is hard!";
      int postion = sentence.indexOf("hard");
      System.out.println(sentence);
      sentence = sentence.substring(0, postion) + "easy!";
      System.out.println(sentence.toUpperCase());
      System.out.println(sentence.replace("easy", "hard"));
  }  
}
