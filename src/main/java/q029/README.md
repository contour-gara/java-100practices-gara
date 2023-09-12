[目次](../toc.md)
[前の問題](../028/README.md)　[次の問題](../030/README.md)


***
## 029：リフレクション
* java.lang.StringBufferクラスのインスタンスを生成しappend(String)メソッドを呼び出すコードをリフレクションを用いて実装せよ。
    * java.lang.StringBufferクラス以外のメソッド呼び出しはリフレクションを使用しなくてよい。

## 解答
- myanswer にて解答．
- 何かが deprecated とでた．
    ```console
    $ source myanswer029.sh
    Note: ./src/MyAnswer029.java uses or overrides a deprecated API.
    Note: Recompile with -Xlint:deprecation for details.
    abc
    ```
    - コンパイルのオプションに `-Xlint:deprecation` を追加．
        ```console
        $ source myanswer029.sh
        ./src/MyAnswer029.java:10: warning: [deprecation] newInstance() in Class has been deprecated
                StringBuffer stringbuffer = (StringBuffer) clazz.newInstance();
                                                                ^
          where T is a type-variable:
            T extends Object declared in class Class
        1 warning
        abc
        ```
    - `newInstance()` を `.getDeclaredConstructor().newInstance()` に変更．
        - [ソース](https://qiita.com/deaf_tadashi/items/3c3118e660861fb43434)
    - `.getConstructor().newInstance()` でも実行可能なことを確認．

## 参考文献
- [入門 Java のリフレクション](https://qiita.com/suke_masa/items/0df3bb92bcb69f4a95d1)
- [クラス Class<T>](https://docs.oracle.com/javase/jp/8/docs/api/java/lang/Class.html#forName-java.lang.String-)
- [クラス Method](https://docs.oracle.com/javase/jp/8/docs/api/java/lang/reflect/Method.html#invoke-java.lang.Object-java.lang.Object...-)
- [クラス StringBuffer](https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/StringBuffer.html#append(java.lang.String))
- [Class.newInstance()はJava9から非推奨になるので今から書き方を変えておこう](https://qiita.com/deaf_tadashi/items/3c3118e660861fb43434)
