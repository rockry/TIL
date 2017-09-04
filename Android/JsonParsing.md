
javascript와는 다르게 일일이 parsing해줘야 한다.
gson으로 class에 바로 매칭시키는 방법도 있지만, 객체화하여 지속적으로 사용할 것이 아니라면 json으로 한번 파싱하는게 낫다.

```java
                jsonObject = new JSONObject(res);
                JSONObject addrObj = jsonObject.getJSONObject("result");
                JSONArray itemArr = addrObj.getJSONArray("items");
                for(int i = 0; i < itemArr.length(); i++) {
                    JSONObject itemObj = itemArr.getJSONObject(i);
                    String address = itemObj.getString("address");
                    double x = itemObj.getJSONObject("point").getDouble("x");
                    double y = itemObj.getJSONObject("point").getDouble("y");
                    System.out.println(address);
                    addrList.add(address);
                    Item item = new Item(address, x, y);
                    itemList.add(item);
                }
```

parsing할 Data는 아래와 같이 Naver 지도에서 지역 검색한 결과.
```java
                String addr = URLEncoder.encode(params[0], "UTF-8");
                String apiURL = "https://openapi.naver.com/v1/map/geocode?query=" + addr; //json
                URL url = new URL(apiURL);
                HttpURLConnection con = (HttpURLConnection)url.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("X-Naver-Client-Id", NAVER_OAUTH_CLIENT_ID);
                con.setRequestProperty("X-Naver-Client-Secret", NAVER_OAUTH_CLIENT_SECRET);
                int responseCode = con.getResponseCode();
                BufferedReader br;
                if(responseCode==200) { // 정상 호출
                    br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                } else {  // 에러 발생
                    br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                }
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
```

```
{
	"result": {
		"total": 15,
		"userquery": "중동",
		"items": [{
				"address": "서울특별시 마포구 중동 ",
				"addrdetail": {
					"country": "대한민국",
					"sido": "서울특별시",
					"sigugun": "마포구",
					"dongmyun": "중동",
					"rest": ""
				},
				"isRoadAddress": false,
				"point": {
					"x": 126.9055000,
					"y": 37.5717250
				}
			}, {
				"address": "경기도 부천시 중동 ",
				"addrdetail": {
					"country": "대한민국",
					"sido": "경기도",
					"sigugun": "부천시",
					"dongmyun": "중동",
					"rest": ""
				},
				"isRoadAddress": false,
				"point": {
					"x": 126.7682200,
					"y": 37.4878400
				}
			}, {
				"address": "경기도 수원시 팔달구 중동 ",
				"addrdetail": {
					"country": "대한민국",
					"sido": "경기도",
					"sigugun": "수원시 팔달구",
					"dongmyun": "중동",
					"rest": ""
				},
				"isRoadAddress": false,
				"point": {
					"x": 127.0165204,
					"y": 37.2737743
				}
			}, {
				"address": "경기도 용인시 기흥구 중동 ",
				"addrdetail": {
					"country": "대한민국",
					"sido": "경기도",
					"sigugun": "용인시 기흥구",
					"dongmyun": "중동",
					"rest": ""
				},
				"isRoadAddress": false,
				"point": {
					"x": 127.1577000,
					"y": 37.2704000
				}
			}, {
				"address": "충청남도 공주시 중동 ",
				"addrdetail": {
					"country": "대한민국",
					"sido": "충청남도",
					"sigugun": "공주시",
					"dongmyun": "중동",
					"rest": ""
				},
				"isRoadAddress": false,
				"point": {
					"x": 127.1257000,
					"y": 36.4539679
				}
			}, {
				"address": "대전광역시 동구 중동 ",
				"addrdetail": {
					"country": "대한민국",
					"sido": "대전광역시",
					"sigugun": "동구",
					"dongmyun": "중동",
					"rest": ""
				},
				"isRoadAddress": false,
				"point": {
					"x": 127.4296000,
					"y": 36.3315833
				}
			}, {
				"address": "전라북도 군산시 중동 ",
				"addrdetail": {
					"country": "대한민국",
					"sido": "전라북도",
					"sigugun": "군산시",
					"dongmyun": "중동",
					"rest": ""
				},
				"isRoadAddress": false,
				"point": {
					"x": 126.7246000,
					"y": 35.9840930
				}
			}, {
				"address": "전라북도 전주시 완산구 중동 ",
				"addrdetail": {
					"country": "대한민국",
					"sido": "전라북도",
					"sigugun": "전주시 완산구",
					"dongmyun": "중동",
					"rest": ""
				},
				"isRoadAddress": false,
				"point": {
					"x": 127.0636500,
					"y": 35.8362990
				}
            }
        }]
    }
}
```
