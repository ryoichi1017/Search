public class Search {
  public static void main(String[] args) {
     System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
    int selicted = new java.util.Scanner(System.in).nextInt();
      switch (selicted) {
        case 1:
          System.out.println("検索します");
          break;
  
        case 2:
          System.out.println("登録します");
          break;
      
        case ３:
          System.out.println("削除します");
          break;
      
        case 4:
          System.out.println("変更します");
          break;
      }
    }
  }

