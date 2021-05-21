package com.covid.info.covidinfo.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrunchifyLoadGithubContent2 {

//	public static void main(String[] args) throws Throwable {
//		String link = "https://github.com/CSSEGISandData/COVID-19/blob/master/csse_covid_19_data/csse_covid_19_daily_reports/";
//		URL crunchifyUrl = new URL(link);
//		HttpURLConnection crunchifyHttp = (HttpURLConnection) crunchifyUrl.openConnection();
//		Map<String, List<String>> crunchifyHeader = crunchifyHttp.getHeaderFields();
//		iteratemap(crunchifyHeader);
//		System.out.println("----------------------------------------------------------------");
//
//		// If URL is getting 301 and 302 redirection HTTP code then get new URL link.
//		// This below for loop is totally optional if you are sure that your URL is not
//		// getting redirected to anywhere
//		for (String header : crunchifyHeader.get(null)) {
//			if (header.contains(" 302 ") || header.contains(" 301 ")) {
//				link = crunchifyHeader.get("Location").get(0);
//				crunchifyUrl = new URL(link);
//				crunchifyHttp = (HttpURLConnection) crunchifyUrl.openConnection();
//				System.out.println("crunchifyHttp" + crunchifyHttp);
//				crunchifyHeader = crunchifyHttp.getHeaderFields();
//				iteratemap(crunchifyHeader);
//			}
//		}
//		InputStream crunchifyStream = crunchifyHttp.getInputStream();
//		System.out.println("crunchifyStream.toString()" + crunchifyStream.toString());
//		String crunchifyResponse = crunchifyGetStringFromStream(crunchifyStream);
//		PrintStream o = new PrintStream(new File("C:\\Users\\HP\\OneDrive\\Desktop\\C\\A.txt"));
//		  
//        // Store current System.out before assigning a new value
//        PrintStream console = System.out;
//  
//        // Assign o to output stream
//        System.setOut(o);
//		System.out.println(crunchifyResponse);
//
//	}
//
//	// ConvertStreamToString() Utility - we name it as
//	// crunchifyGetStringFromStream()
//	private static String crunchifyGetStringFromStream(InputStream crunchifyStream) throws IOException {
//		if (crunchifyStream != null) {
//			Writer crunchifyWriter = new StringWriter();
//
//			char[] crunchifyBuffer = new char[2048];
//			try {
//				Reader crunchifyReader = new BufferedReader(new InputStreamReader(crunchifyStream, "UTF-8"));
//				int counter;
//				while ((counter = crunchifyReader.read(crunchifyBuffer)) != -1) {
//					crunchifyWriter.write(crunchifyBuffer, 0, counter);
//				}
//			} finally {
//				crunchifyStream.close();
//			}
//			return crunchifyWriter.toString();
//		} else {
//			return "No Contents";
//		}
//	}
//
//	public static void iteratemap(Map<String, List<String>> crunchifyHeader) {
//		Map<String, List<String>> crunchifyHeadermap = new HashMap<>();
//
//		// Get keys and values
//		for (Map.Entry<String, List<String>> entry : crunchifyHeadermap.entrySet()) {
//			String k = entry.getKey();
//			List<String> v = entry.getValue();
//			System.out.println("Key: " + k + ", Value: " + v);
//		}
//
//		// Java 8
//		// map.forEach((k, v) -> {
//		// System.out.println("Key: " + k + ", Value: " + v);
//		// });
//	}

}
