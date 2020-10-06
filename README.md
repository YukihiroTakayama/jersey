# 環境構築

```
git clone https://github.com/fumimi/jersey.git
```

## ドッカーコンテナの作成と起動

```
docker-compose up　--build
```

※ buildオプションは初回起動時のみつける

## IntelliJ IDEAのインストールと設定手順

https://docs.google.com/spreadsheets/d/1kuUvBJtmKMmX6LNdiVyPbXfRgHMyebvQ1WBlgq-p7wM/edit?usp=sharing

## よく使うdokerコマンド
※ wikiに移動予定
### appコンテナにログイン

```
docker exec -it jersey_app_1 bash
```

### コンテナの情報出力

```
docker ps -a
```

### イメージ情報出力

```
docker images
```

### ボリューム情報出力

```
docker volume ls
````

### コンテナの停止

```
docker-compose stop
```

### コンテナとネットワークの削除

```
docker-compose down
```

### イメージ削除

```
docker image rm [イメージID]
```

### ボリューム削除

```
docker volume rm [ボリュームID]
```

### ドッカーイメージ全削除

```
docker images -aq | xargs docker rmi
```

## mysqlログイン

```
docker exec -it jerey_db_1 mysql -u user -p
```
