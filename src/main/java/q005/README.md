[目次](../toc.md)
[前の問題](../004/README.md)　[次の問題](../006/README.md)


***
## 005：システムプロパティ

* Javaプログラムが利用するプロキシサーバとして、`proxy.example.com:80`を使用するように指定して #001 のプログラムを実行するjavaコマンドを実行せよ。ただし、`*.noproxy.example.com`へのアクセスはプロキシサーバを利用せず直接接続するようにすること。

## 解答
1. myanswerで解答．
1. 環境変数を用いて設定することに．
    - [The Twelve Factors](https://12factor.net/ja/config)
1. プロキシサーバを利用させないものの設定にワイルドカードが使えなさそうなため断念．
1. javaコマンドのオプションに渡すことに．

## 参考文献
- [Java ネットワークとプロキシ](https://docs.oracle.com/javase/jp/7/technotes/guides/net/proxies.html)
- [The Twelve Factors](https://12factor.net/ja/config)
