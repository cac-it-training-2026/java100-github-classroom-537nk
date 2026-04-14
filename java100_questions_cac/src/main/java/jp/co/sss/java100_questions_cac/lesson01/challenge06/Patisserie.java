/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

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

		System.out.println("合計個数\t" + (cit + choco + pista) + "個");
		System.out.println("合計金額  " + (cit * 250 + choco * 280 + pista * 320) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		int citronRest = citronStock - cit;
		int chocolatRest = chocolatStock - choco;
		int pistacheRest = pistacheStock - pista;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronRest + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatRest + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheRest + "個");

	}

}
