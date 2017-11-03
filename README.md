# sampleai

Clojure用もげRPG AIテンプレート。

## ビルド

`target/uberjar/sampleai-0.1.0-SNAPSHOT-standalone.jar` を作成する。

    $ lein uberjar
    Compiling sampleai.core
    Created /home/plonk/g/mogeRPGserver/clojure-moge-rpg-ai-template/target/uberjar/sampleai-0.1.0-SNAPSHOT.jar
    Created /home/plonk/g/mogeRPGserver/clojure-moge-rpg-ai-template/target/uberjar/sampleai-0.1.0-SNAPSHOT-standalone.jar

## 使い方

こんな感じ。

    $ mogeRPGserver --ai 'java -jar clojure-moge-rpg-ai-template/target/uberjar/sampleai-0.1.0-SNAPSHOT-standalone.jar'

## License

好き勝手にしてください。

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
