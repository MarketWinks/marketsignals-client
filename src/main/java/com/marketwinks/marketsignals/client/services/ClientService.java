package com.marketwinks.marketsignals.client.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class ClientService {

	String serverURL = "https://marketsignals.herokuapp.com/baseURL/findMarketSignals/MACD";

	@RequestMapping(value = "/start/UK5MINBUY", method = RequestMethod.GET)
	public boolean findUK5MINBUYSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/_5Min/BUY/UKEq/" + line.toString();

					urlList.add(symbuy);

					line = br.readLine();
				}

			} finally {
				br.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
			return result;
		}

		//while (urlList.size() > 0) {
			for (int i = 0; i < urlList.size(); i++) {
				ProcessorThread.process(urlList.get(i));
			}

//			Thread.sleep(30 * 1000);
//		}
			result = true;
			return result;
	}


	@RequestMapping(value = "/start/UK15MINBUY", method = RequestMethod.GET)
	public boolean findUK15MINBUYSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/_15Min/BUY/UKEq/" + line.toString();

					urlList.add(symbuy);

					line = br.readLine();
				}

			} finally {
				br.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
			return result;
		}

		//while (urlList.size() > 0) {
			for (int i = 0; i < urlList.size(); i++) {
				ProcessorThread.process(urlList.get(i));
			}

//			Thread.sleep(30 * 1000);
//		}
			result = true;
			return result;
	}

}