/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("それぞれ何個ずつかいますか？（最大30個まで）");

		System.out.println("シトロン\t >");
		String x = reader.readLine();
		int cit = Integer.parseInt(x);

		System.out.println("ショコラ\t >");
		String y = reader.readLine();
		int choco = Integer.parseInt(y);

		System.out.println("ピスターシュ >");
		String z = reader.readLine();
		int pista = Integer.parseInt(z);

		System.out.println("\nシトロン\t " + cit + "個");
		System.out.println("ショコラ\t " + choco + "個");
		System.out.println("ピスターシュ " + pista + "個");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");
	}

}