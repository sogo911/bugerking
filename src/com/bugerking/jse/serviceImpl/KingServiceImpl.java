package com.bugerking.jse.serviceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.bugerking.jse.service.KingService;

public class KingServiceImpl implements KingService{
	private Map<String,String> map;
	public KingServiceImpl() {
		map = new HashMap<String,String>();
	}
	@Override
	public void readyMenu(String[] dummy) {
		for(String s : dummy) {
			System.out.println(s);
			String[] arr = s.split("/");
			map.put(arr[0], arr[1]); // 맵에서 풋을하여 값을 저장.
			System.out.println(map);
			
		}
	}
	@Override
	public String choiceMenu(String a) {
		System.out.println("주문내용 : "+a);
		String[] arr = a.split("/");
		for(int i = 0; i < arr.length; i++ ) {
			System.out.println("주문내용 :" + arr[i]);
		}
		String item = arr[0];
		String count = arr[1];
		Set<String> keys = map.keySet();
		System.out.println("키 갯수 :"+keys.size());
		String price = "";
		for(String key : keys) {
				if(item.equals(key)) {
					price = map.get(key);
				}
			System.out.println("결과값 :"+key);
		}
		int pay = Integer.parseInt(price)
				* Integer.parseInt(count);
		return "결재금액" + pay;
	}
}
