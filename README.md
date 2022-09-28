# maven-nasa1

- [javaでhttpリクエストを作成する5つの方法](https://www.twilio.com/blog/5-ways-to-make-http-requests-in-java-jp)
- [mjg123/java-http-clients](https://github.com/mjg123/java-http-clients)

を元にした練習。いちおうJava 11。


# compile & run

```bash
mvn compile
mvn exec:java
```


# package & run

```bash
mvn clean package
# maven-shade-plugin で executable な fatJAR ができる
java -jar target/nasa1-1.0-SNAPSHOT.jar
```

# メモ

このなかから選ぶなら
[Maven Repository: org.apache.httpcomponents.client5 » httpclient5](https://mvnrepository.com/artifact/org.apache.httpcomponents.client5/httpclient5)
がいいかなあ。
