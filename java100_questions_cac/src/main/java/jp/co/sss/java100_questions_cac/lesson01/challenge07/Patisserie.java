/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge07;

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
		double cit = Double.parseDouble(x);

		System.out.println("ショコラ\t >");
		String y = reader.readLine();
		double choco = Double.parseDouble(y);

		System.out.println("ピスターシュ >");
		String z = reader.readLine();
		double pista = Double.parseDouble(z);

		System.out.println("\nシトロン\t " + cit + "個");
		System.out.println("ショコラ\t " + choco + "個");
		System.out.println("ピスターシュ " + pista + "個");

		double totalstock = cit + choco + pista;
		int totalcost = (int) (cit * 250 + choco * 280 + pista * 320);

		System.out.println("合計個数\t" + totalstock + "個");
		System.out.println("合計金額  " + totalcost + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		int citronRest = citronStock - (int) cit - 1;
		int chocolatRest = chocolatStock - (int) choco - 1;
		int pistacheRest = pistacheStock - (int) pista - 1;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronRest + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatRest + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheRest + "個");

	}
}