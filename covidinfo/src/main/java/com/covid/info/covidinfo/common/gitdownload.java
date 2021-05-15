package com.covid.info.covidinfo.common;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.springframework.beans.factory.annotation.Autowired;

import com.covid.info.covidinfo.bean.CvoidInfoDTO;
import com.covid.info.covidinfo.service.CvoidInfoDTOService;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class gitdownload {

	@Autowired
	public CvoidInfoDTOService cvoidInfoDTOService;

	public static void main(String[] args) throws IOException, URISyntaxException {
		// String repoUrl = "https://github.com/CSSEGISandData/COVID-19.git";
		// String cloneDirectoryPath = "C:\\Users\\HP\\OneDrive\\Desktop\\C\\c11"; //
		// Ex.in windows
		// // c:\\gitProjects\SpringBootMongoDbCRUD\
		// try {
		// System.out.println("Cloning " + repoUrl + " into " + cloneDirectoryPath);
		// Git.cloneRepository().setURI(repoUrl).setDirectory(Paths.get(cloneDirectoryPath).toFile()).call();
		// System.out.println("Completed Cloning");
		// } catch (GitAPIException e) {
		// System.out.println("Exception occurred while cloning repo");
		// e.printStackTrace();
		// }
		// readfilesnames();
		// readcsvfile();
		// readermethod();
	}

	public static void readfilesnames() throws IOException {
		File file = new File(
				"C:\\Users\\HP\\OneDrive\\Desktop\\C\\c10\\csse_covid_19_data\\csse_covid_19_daily_reports\\");
		String[] fileList = file.list();
		for (String name : fileList) {
			if (name.equals("README.md") || name.equals(".gitignore")) {
				// System.out.println(name);
			} else {
				System.out.println(name);
				FileReader fileReader = new FileReader(
						"C:\\Users\\HP\\OneDrive\\Desktop\\C\\c10\\csse_covid_19_data\\csse_covid_19_daily_reports\\"
								+ name);

			}

		}
	}

	public static List<CvoidInfoDTO> readermethod() throws IOException, URISyntaxException {
		String csvFilePath = "C:\\Users\\HP\\OneDrive\\Desktop\\C\\c10\\csse_covid_19_data\\csse_covid_19_daily_reports\\01-01-2021.csv";
		Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
		final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
		CSVParser csvParser = CSVFormat.DEFAULT.parse(reader);
		List<CSVRecord> csvlist = csvParser.getRecords();
		// CvoidInfoDTO cvoidInfoDTO = new CvoidInfoDTO();
		List<CvoidInfoDTO> cvoidInfoDTOlist = new ArrayList<CvoidInfoDTO>();
		for (int i = 1; i < csvlist.size(); i++) {
			CvoidInfoDTO cvoidInfoDTO = new CvoidInfoDTO();
			int j=0;
			cvoidInfoDTO.setId(j);
			j++;
			if (csvlist.get(i).get(0).isEmpty()) {
				cvoidInfoDTO.setFips("na");
			} else {
				cvoidInfoDTO.setFips(csvlist.get(i).get(0).toString());
			}
			if (csvlist.get(i).get(1).isEmpty()) {
				cvoidInfoDTO.setAdmin2("na");
			} else {
				cvoidInfoDTO.setAdmin2(csvlist.get(i).get(1).toString());
			}
			if (csvlist.get(i).get(2).isEmpty()) {
				cvoidInfoDTO.setProvinceState("na");
			} else {
				cvoidInfoDTO.setProvinceState(csvlist.get(i).get(2).toString());
			}
			if (csvlist.get(i).get(3).isEmpty()) {
				cvoidInfoDTO.setCountryRegion("na");
			} else {
				cvoidInfoDTO.setCountryRegion(csvlist.get(i).get(3).toString());
			}
			if (csvlist.get(i).get(4).isEmpty()) {
				cvoidInfoDTO.setLastUpdate("na");
			} else {
				cvoidInfoDTO.setLastUpdate(csvlist.get(i).get(4).toString());
			}
			if (csvlist.get(i).get(5).isEmpty()) {
				cvoidInfoDTO.setLat("na");
			} else {
				cvoidInfoDTO.setLat(csvlist.get(i).get(5).toString());
			}
			if (csvlist.get(i).get(6).isEmpty()) {
				cvoidInfoDTO.setLng("na");
			} else {
				cvoidInfoDTO.setLng(csvlist.get(i).get(6).toString());
			}
			if (csvlist.get(i).get(7).isEmpty()) {
				cvoidInfoDTO.setConfirmed("na");
			} else {
				cvoidInfoDTO.setConfirmed(csvlist.get(i).get(7).toString());
			}
			if (csvlist.get(i).get(8).isEmpty()) {
				cvoidInfoDTO.setDeaths("na");
			} else {
				cvoidInfoDTO.setDeaths(csvlist.get(i).get(8).toString());
			}
			if (csvlist.get(i).get(9).isEmpty()) {
				cvoidInfoDTO.setRecovered("na");
			} else {
				cvoidInfoDTO.setRecovered(csvlist.get(i).get(9).toString());
			}
			if (csvlist.get(i).get(10).isEmpty()) {
				cvoidInfoDTO.setActive("na");
			} else {
				cvoidInfoDTO.setActive(csvlist.get(i).get(10).toString());
			}
			if (csvlist.get(i).get(11).isEmpty()) {
				cvoidInfoDTO.setCombinedKey("na");
			} else {
				cvoidInfoDTO.setCombinedKey(csvlist.get(i).get(11).toString());
			}
			if (csvlist.get(i).get(12).isEmpty()) {
				cvoidInfoDTO.setIncidentRate("na");
			} else {
				cvoidInfoDTO.setIncidentRate(csvlist.get(i).get(12).toString());
			}
			if (csvlist.get(i).get(13).isEmpty()) {
				cvoidInfoDTO.setCaseFatalityRatio("na");
			} else {
				cvoidInfoDTO.setCaseFatalityRatio(csvlist.get(i).get(13).toString());
			}

			//
			// cvoidInfoDTO.setFips(csvlist.get(i).get(0));
			// cvoidInfoDTO.setAdmin2(csvlist.get(i).get(1));
			// cvoidInfoDTO.setProvinceState(csvlist.get(i).get(2));
			// cvoidInfoDTO.setCountryRegion(csvlist.get(i).get(3));
			// cvoidInfoDTO.setLastUpdate(csvlist.get(i).get(4));
			// cvoidInfoDTO.setLat(csvlist.get(i).get(5));
			// cvoidInfoDTO.setLng(csvlist.get(i).get(6));
			// cvoidInfoDTO.setConfirmed(csvlist.get(i).get(7));
			// cvoidInfoDTO.setDeaths(csvlist.get(i).get(8));
			// cvoidInfoDTO.setRecovered(csvlist.get(i).get(9));
			// cvoidInfoDTO.setActive(csvlist.get(i).get(10));
			// cvoidInfoDTO.setCombinedKey(csvlist.get(i).get(11));
			// cvoidInfoDTO.setIncidentRate(csvlist.get(i).get(12));
			// cvoidInfoDTO.setCaseFatalityRatio(csvlist.get(i).get(13));

			cvoidInfoDTOlist.add(cvoidInfoDTO);

			System.out.println("check list");

		}
		return cvoidInfoDTOlist;

	}

	public List<CvoidInfoDTO> saveDataTODB() throws IOException, URISyntaxException {
		List<CvoidInfoDTO> cvoidInfoDTOlist = readermethod();
		for (int i = 0; i < cvoidInfoDTOlist.size(); i++) {
			
			
			System.out.println("" + cvoidInfoDTOlist.get(i).getId());
			System.out.println("" + cvoidInfoDTOlist.get(i).getFips());
			System.out.println("" + cvoidInfoDTOlist.get(i).getAdmin2());
			System.out.println("" + cvoidInfoDTOlist.get(i).getProvinceState());
			System.out.println("" + cvoidInfoDTOlist.get(i).getCountryRegion());
			System.out.println("" + cvoidInfoDTOlist.get(i).getLastUpdate());
			System.out.println("" + cvoidInfoDTOlist.get(i).getLat());
			System.out.println("" + cvoidInfoDTOlist.get(i).getLng());
			System.out.println("" + cvoidInfoDTOlist.get(i).getConfirmed());

			System.out.println("" + cvoidInfoDTOlist.get(i).getDeaths());
			System.out.println("" + cvoidInfoDTOlist.get(i).getRecovered());
			System.out.println("" + cvoidInfoDTOlist.get(i).getActive());
			System.out.println("" + cvoidInfoDTOlist.get(i).getCombinedKey());
			System.out.println("" + cvoidInfoDTOlist.get(i).getIncidentRate());
			System.out.println("" + cvoidInfoDTOlist.get(i).getCaseFatalityRatio());
			// cvoidInfoDTOService.save(cvoidInfoDTOlist.get(i));
		}
		return cvoidInfoDTOlist;

	}
}
