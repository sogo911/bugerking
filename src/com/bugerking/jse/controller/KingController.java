package com.bugerking.jse.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.bugerking.jse.pool.Value;
import com.bugerking.jse.service.KingService;
import com.bugerking.jse.serviceImpl.KingServiceImpl;

public class KingController {
	public static void main(String[] args) {
		KingService service = new KingServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog(Value.MENU)) {
			case "0":
				return;
			case "1":
				String[] dummy = {
					"햄버거/5500",
					"콜라/1000",
					"감자칩/1000",
					"커피/900"
				};
				service.readyMenu(dummy);
				
				break;
			case "2":
				String a = JOptionPane.showInputDialog("상품/갯수입력");
				String b = service.choiceMenu(a);
					JOptionPane.showMessageDialog(null, b);
				break;
			case "3":
				System.out.println();
				JOptionPane.showMessageDialog(null, 
						new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(new Date()));
				break;
			}
			
		}
	}

}
