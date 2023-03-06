package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

public class App2 {

	public static void main(String[] args) {
		Service<String, ItemDTO> service = new ItemService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input Command(q, rg, rm, mo)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if (cmd.equals("rg")) {
				System.out.println("Input Item Number...");
				String itmNumStr = sc.next();
				int itmNum = Integer.parseInt(itmNumStr);
				System.out.println("Input Item Name...");
				String itmName = sc.next();
				System.out.println("Input Item Price...");
				String itmPriceStr = sc.next();
				int itmPrice = Integer.parseInt(itmPriceStr);
				
				ItemDTO item = new ItemDTO(itmNum, itmName, itmPrice);
				service.register(item);
			} else if (cmd.equals("rm")) {
				System.out.println("Input Item Number...");
				String itmNumStr = sc.next();
				
				service.remove(itmNumStr);
			} else if (cmd.equals("mo")) {
				System.out.println("Input Item Number...");
				String itmNumStr = sc.next();
				int itmNum = Integer.parseInt(itmNumStr);
				System.out.println("Input Item Name...");
				String itmName = sc.next();
				System.out.println("Input Item Price...");
				String itmPriceStr = sc.next();
				int itmPrice = Integer.parseInt(itmPriceStr);
				
				ItemDTO item = new ItemDTO(itmNum, itmName, itmPrice);
				service.modify(item);
			}

		}
		sc.close();
		
		
		
	}

}
