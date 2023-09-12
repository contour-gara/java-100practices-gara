[目次](../toc.md)
[前の問題](../030/README.md)　[次の問題](../032/README.md)


***
## 031：アノテーション(1)
* 以下のコードのアノテーションは妥当か妥当ではないか。理由も合わせて解答せよ。
    * getStringClass()メソッドは変更不可とする。

```java
@SuppressWarnings("unchecked")
public class Knock031 {
    public static void main(String[] arguments) {
        Class<String> object = getStringClass();
        System.out.println(object);
    }

    public static Class getStringClass() {
        return String.class;
    }
}
```

## 解答
```java
public class Knock031 {
    public static void main(String[] arguments) {
        @SuppressWarnings("unchecked")
        Class<String> object = getStringClass();
        System.out.println(object);
    }

    public static Class getStringClass() {
        return String.class;
    }
}
```
- `Class` を `Class<String>` の変数に代入しようとしているため，注釈がでる．
- > プログラマは、有効な場合、もっとも深度のある入れ子要素でこの注釈を使う必要があります。特定のメソッドで警告を抑制するには、クラスではなくメソッドで注釈を付ける必要があります。
    - [ソース](https://docs.oracle.com/javase/jp/8/docs/api/java/lang/SuppressWarnings.html)

## 参考文献
- [注釈型SuppressWarnings](https://docs.oracle.com/javase/jp/8/docs/api/java/lang/SuppressWarnings.html)
- [クラスClass<T>](https://docs.oracle.com/javase/jp/8/docs/api/java/lang/Class.html)
