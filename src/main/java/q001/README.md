[目次](../toc.md)
　[次の問題](../002/README.md)


***
## 001：インストール
* OracleのWebサイトから Java SE Development Kit 8 （以降JDK）をダウンロードして手元のOSにインストールせよ。その後、標準出力に`Hello, World!`と出力するプログラムを作成し、JDK付属のコマンドのみを使用してコンパイル、実行せよ。

## 解答
1. answerで動作チェック．
1. シェルスクリプトを実行してもターミナルが閉じられるだけだったので，シェルスクリプトを確認した．
    - エラーチェックでエラーがあった場合exitするようになっていたので修正．
1. エラーログを見たところJavaのバージョンがあってないよう．
    ```console
    $ source answer001.sh
    Error: LinkageError occurred while loading main class Answer001
            java.lang.UnsupportedClassVersionError: Answer001 has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 55.0
    Error!!!
    ```
    - ~~SDKMAN!で11.0.20-amznをインストールしデフォルトに設定~~
        ```console
        $ sdk install java 11.0.20-amzn
        $ sdk default java 11.0.20-amzn
        $ sdk use java 11.0.20-amzna
        ```
    - ~~*SDKMAN!でjavaのバージョンを切り替えても`java --version`の結果が変わらない．**~~
        ```consol
        $ sdk use java 11.0.20-amzna
        $ java --version
        openjdk 11.0.18 2023-01-17
        OpenJDK Runtime Environment (build 11.0.18+10-post-Debian-1deb11u1)
        OpenJDK 64-Bit Server VM (build 11.0.18+10-post-Debian-1deb11u1, mixed mode, sharing)
        $ sdk use java 17.0.7-amzn
        $ java --version
        openjdk 11.0.18 2023-01-17
        OpenJDK Runtime Environment (build 11.0.18+10-post-Debian-1deb11u1)
        OpenJDK 64-Bit Server VM (build 11.0.18+10-post-Debian-1deb11u1, mixed mode, sharing)
        ```
    - ***SDKMAN!とaptでインストールしたJavaが混在していた．***
        - 解決手順は[この記事](https://qiita.com/contour_gara/items/4478db29aa691123e2c5)に．
1. シェルスクリプト実行で正常終了．
    ```console
    $ source answer001.sh
    Hello, World!
    ```
1. testに移動してシェルスクリプトを実行したところ，JUnitがないとのエラー．
    ```console
    $ source ./test001.sh
    src/Test001.java:5: error: package org.junit does not exist
    import org.junit.Assert;
    ~~~省略~~~
    Error: Could not find or load main class org.junit.runner.JUnitCore
    Caused by: java.lang.ClassNotFoundException: org.junit.runner.JUnitCore
    Error!!!
    ```
    - ~~Mavenで実行するためにpomを書こうか検討．~~
    - シェルスクリプトをよく見たところ，java-100practiceのlibにJUnitとHamcrestのjarファイルが必要みたい．
    - とりあえず何も考えずに最新版をMaven Centralからwget．
        ```console
        $ cd ~/git/java-100practices/lib
        $ wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
        $ wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/2.2/hamcrest-core-2.2.jar
        ```
    - なんかエラーが出た．
        ```console
        $ source ./test001.sh
        JUnit version 4.13.2
        Exception in thread "main" java.lang.NoClassDefFoundError: org/hamcrest/SelfDescribing
                at java.base/java.lang.ClassLoader.defineClass1(Native Method)
                at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
                at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:174)
                at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:800)
                at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:698)
                at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:621)
                at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:579)
                at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
                at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
                at org.junit.runner.Computer.getSuite(Computer.java:28)
                at org.junit.runner.Request.classes(Request.java:77)
                at org.junit.runner.JUnitCommandLineParseResult.createRequest(JUnitCommandLineParseResult.java:116)
                at org.junit.runner.JUnitCore.runMain(JUnitCore.java:77)
                at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
        Caused by: java.lang.ClassNotFoundException: org.hamcrest.SelfDescribing
                at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
                at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
                at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
                ... 14 more
        ```
    - [この記事](https://qiita.com/Takaichi00/items/b848de60ca3e553fdcac#%E3%83%86%E3%82%B9%E3%83%88%E5%AE%9F%E8%A1%8C)を参考にバージョン違いを入れてみる．
        ```console
        $ wget https://repo1.maven.org/maven2/junit/junit/4.12-beta-3/junit-4.12-beta-3.jar
        $ wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
        ```
    - シェルスクリプト実行，いけたっぽい．
        ```console
        $ source ./test001.sh
        JUnit version 4.12-beta-3
        .
        Time: 0.004

        OK (1 test)

        ```
1. myanswerで解答．
1. test実行．
    - test001.sh
        - myanswerをクラスパスに入れるように変更．
    - Test001.java
        - MyTest001のmainメソッドを実行するように変更．

## 参考文献
- [Javaバージョン](https://www.ne.jp/asahi/hishidama/home/tech/java/version.html)
- [javacコマンドを知らなくてもプロダクトをリリースできてしまう世の中](https://qiita.com/Takaichi00/items/b848de60ca3e553fdcac#%E3%83%86%E3%82%B9%E3%83%88%E5%AE%9F%E8%A1%8C)
