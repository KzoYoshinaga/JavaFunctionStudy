package function01;

/**
 * 関数型インターフェイスの定義
 * @FunctionalInterface アノテーションを付け
 * 1つだけ関数を宣言することで関数型のインターフェイスになる
 * コレを実装した関数オブジェクトはラムダ式で使える
 *
 * @author Kzo
 *
 */
@FunctionalInterface
public interface Printer {
	public void print(Object o);
}
