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


	@RequestMapping(value = "/start/UK30MINBUY", method = RequestMethod.GET)
	public boolean findUK30MINBUYSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/_30Min/BUY/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UKHOURLYBUY", method = RequestMethod.GET)
	public boolean findUKHOURLYBUYSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/Hourly/BUY/UKEq/" + line.toString();

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

	@RequestMapping(value = "/start/UKDAILYBUY", method = RequestMethod.GET)
	public boolean findUKDAILYBUYSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/Daily/BUY/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UKWEEKLYBUY", method = RequestMethod.GET)
	public boolean findUKWEEKLYBUYSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/Weekly/BUY/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UKMONTHLYBUY", method = RequestMethod.GET)
	public boolean findUKMONTHLYBUYSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/Monthly/BUY/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UK5MINSELL", method = RequestMethod.GET)
	public boolean findUK5MINSELLSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/_5Min/SELL/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UK15MINSELL", method = RequestMethod.GET)
	public boolean findUK15MINSELLSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/_15Min/SELL/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UK30MINSELL", method = RequestMethod.GET)
	public boolean findUK30MINSELLSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/_30Min/SELL/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UKHOURLYSELL", method = RequestMethod.GET)
	public boolean findUKHOURLYSELLSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/Hourly/SELL/UKEq/" + line.toString();

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

	@RequestMapping(value = "/start/UKDAILYSELL", method = RequestMethod.GET)
	public boolean findUKDAILYSELLSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/Daily/SELL/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UKWEEKLYSELL", method = RequestMethod.GET)
	public boolean findUKWEEKLYSELLSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/Weekly/SELL/UKEq/" + line.toString();

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


	@RequestMapping(value = "/start/UKMONTHLYSELL", method = RequestMethod.GET)
	public boolean findUKMONTHLYSELLSignals() throws InterruptedException, IOException {

		boolean result = false;
		
		List<String> urlList = new ArrayList<String>();

		try {
			File file = new File("src/main/java/com/marketwinks/marketsignals/client/services/uksymbols.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {

					String symbuy = serverURL + "/Monthly/SELL/UKEq/" + line.toString();

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