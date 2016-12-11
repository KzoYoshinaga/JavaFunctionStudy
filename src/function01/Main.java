package function01;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {

		/* Sample 01
		 *
		 *  0 から 10 までを書き出す
		 *
		 */

		/* 古臭いレガシーな実装 */
		System.out.println("*** print numbers in range 0 to 9 ***");{

			for (int i = 0; i <= 10; i++) {			// i が 0 から 10 と等しい数字になるまで i に 1 を足しながら繰り返し
				System.out.print( i + " ");		// i を表示
			}

		}

		/* 関数型アプローチでの実装 */
		System.out.println("\n*** stream ***");{

			IntStream.rangeClosed(0, 10)						// 0 から 10 までの数字の集まり
				.forEach(i -> System.out.print(i + " "));		// -> それぞれ表示


		}


		/* */ System.out.println(); /* */


		/* Sample 02
		 *
		 *  0 から 10 までの偶数を表示
		 *
		 */

		/* 古臭いレガシーな実装 */
		System.out.println("\n*** print even numbers in range 0 to 10 ***");{

			for (int i = 0; i <= 10; i++) {		 // i が 0 から 10 と等しい数字になるまで i に 1 を足しながら繰り返し
				if (i % 2 == 0)						 // もし偶数ならば
					System.out.print( i + " ");		 // 表示する
			}

		}

		/* 関数型アプローチでの実装 */
		System.out.println("\n*** stream ***");{

			IntStream.rangeClosed(0, 10)				   // 0 から 10までの数字の集まり
				.filter(i -> (i % 2) == 0)				   //  ->  その中の偶数だけを取り出し
				.forEach(i -> System.out.print(i + " ")); //  ->  それぞれ表示する


		}

		System.out.println(); /****************************************************************************************

		/* Sample 03
		 *
		 * 0 から始まる偶数を 10 個表示
		 *
		 */

		/* レガシーな書き方 */
		System.out.println("\n*** print 10 even numbers ***");{

			int n = 0;								// 0 からはじまる数字
			int count = 1;							// 1 からはじまるカウンター
			while (count <= 10) {					// カウンターが10を超えなければ繰り返す
				if (n % 2 == 0) {					// 偶数なら
					System.out.print( n + " ");		// 表示
					count++;						// カウンター増やす
				}
				n++;								// 数字を増やす
			}

		}

		/* 関数型アプローチでの実装 */
		System.out.println("\n*** stream ***");	{

			Stream.iterate(0, i -> {return i + 2;})		// 0 から 2 づつ増える数字(偶数)の集まりを作る
				.limit(10)									//  -> 先頭の 10 個取り出す
				.forEach(i -> System.out.print(i + " "));	//  -> 表示

		}

		System.out.println(); /****************************************************************************************

		/* Sample 04
		 *
		 * "a", "b", "c" の文字を表示
		 *
		 */

		/* レガシーな書き方 */
		System.out.println("\n*** print a b c ***");{

			String[] s = new String[]{"a", "b", "c"};	// a b c を要素に持つ配列を宣言
			for (int i = 0; i < s.length; i++)			// 0 で始まる i が配列の長さを超えない限り i を 1 づつ増やしながら繰り返し
				System.out.print(s[i] + " ");			// その i の添え字をもつ配列の要素を表示

		}

		/* 関数型アプローチでの実装 */
		System.out.println("\n*** stream ***");	{

			Stream.of("a","b","c")								// a b c と言う文字の集まり
				.forEach(s -> System.out.print(s + " "));		//  -> それぞれ表示する


		}

		System.out.println(); /****************************************************************************************

		/* Sample 05
		 *
		 * "bob", "keit", "charlie" の中から "i" の文字が含まれている名前を表示
		 *
		 */

		/* レガシーな書き方 */
		System.out.println("\n*** print name contains(\"i\") ***");{

			String[] s = new String[]{"bob", "keit", "charlie"};	// "bob", "keit", "charlie" を要素に持つ配列を宣言
			for (int i = 0; i < s.length; i++)						// 0 で始まる i が配列の長さを超えない限り i を 1 づつ増やしながら繰り返し
				if (s[i].contains("i"))								// その i の添え字をもつ配列の要素に "i" が含まれているなら
					System.out.print(s[i] + " ");			        // それを表示

		}

		/* 関数型アプローチでの実装 */
		System.out.println("\n*** stream ***");	{

			Stream.of("bob","keit","charlie")				// "bob", "keit", "charlie" と言う文字列の集まり
				.filter(s -> s.contains("i"))				//  -> "i" が含まれている要素だけ取り出し
				.forEach(s -> System.out.print(s + " "));	//  -> それぞれ表示する

		}

	}
}
