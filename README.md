# 環境構築

## ドッカーのインストール

https://qiita.com/kurkuru/items/127fa99ef5b2f0288b81


## ドッカーコンテナの作成と起動

```
docker-compose up　--build
```

※ buildオプションは初回起動時のみつける

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
