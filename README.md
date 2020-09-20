# Use_zipcloud_json

## 概要

APIが投げてくるJSONを読み込みたい。  
nullの値の扱いを確認する。

## API

```
http://zipcloud.ibsnet.co.jp/api/search?zipcode=2500011
```

### API実行結果

```
{
	"message": null,
	"results": [
		{
			"address1": "神奈川県",
			"address2": "小田原市",
			"address3": "栄町",
			"kana1": "ｶﾅｶﾞﾜｹﾝ",
			"kana2": "ｵﾀﾞﾜﾗｼ",
			"kana3": "ｻｶｴﾁｮｳ",
			"prefcode": "14",
			"zipcode": "2500011"
		}
	],
	"status": 200
}
```

## 参考

[Qiita : WebAPIについての説明](https://qiita.com/busyoumono99/items/9b5ffd35dd521bafce47)

[Github : SampleUser0001 : 
Use_Json_in_Java](https://github.com/SampleUser0001/Use_Json_in_Java/tree/feature/nullToEmpty)

[Qiita : 簡単！Spring BootでWebAPIをたたいてJSON形式のレスポンスをjavaオブジェクトに変換](https://qiita.com/yk0614/items/c306bddc66ab7882c7ba)