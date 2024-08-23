package org.example;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

  public static boolean isValidPhoneNumber(String phoneNumber) {
    // 正規表現パターンを定義
    String regex = "^(090|080|070)-\\d{4}-\\d{4}$";

    // パターンをコンパイル
    Pattern pattern = Pattern.compile(regex);

    // 入力された電話番号に対してマッチャーを作成
    Matcher matcher = pattern.matcher(phoneNumber);

    // マッチした場合はtrue、そうでなければfalseを返す
    return matcher.matches();
  }

  public static void main(String[] args) {
    // スキャナで標準入力からデータを受け取る
    Scanner scanner = new Scanner(System.in);

    System.out.print("携帯電話番号を入力してください：");
    String inputPhoneNumber = scanner.nextLine();

    // 電話番号の有効性をチェック
    boolean isValid = isValidPhoneNumber(inputPhoneNumber);

    // 結果を出力
    if (isValid) {
      System.out.println(inputPhoneNumber + " は有効な携帯電話番号です。");
    } else {
      System.out.println(inputPhoneNumber + " は無効な携帯電話番号です。");
    }

    // スキャナをクローズ
    scanner.close();
  }
}
