package com.covid.info.covidinfo.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covid.info.covidinfo.bean.CvoidInfoDTO;
import com.covid.info.covidinfo.bean.FinalData;
import com.covid.info.covidinfo.common.gitdownload;
import com.covid.info.covidinfo.service.CvoidInfoDTOService;

@RestController
@RequestMapping("/api")
public class CovidController {

	@Autowired
	private CvoidInfoDTOService Service;

	List<CvoidInfoDTO> CvoidInfofindAll = new ArrayList<CvoidInfoDTO>();

	@GetMapping("/index")
	public String viewHomePage(Model model) {

		return "index";
	}

	@GetMapping(value = "/saveExceltoDB")
	public String saveExceltoDB() throws IOException, URISyntaxException {
		gitdownload gd = new gitdownload();
		List<CvoidInfoDTO> listCvoidInfoDTO = gd.saveDataTODB();
		for (int i = 0; i <= listCvoidInfoDTO.size(); i++) {
			Service.save(listCvoidInfoDTO.get(i));
		}
		return "redirect:/";
	}

	@GetMapping("/DBtoListAllData")
	public List<CvoidInfoDTO> DBtoListAllData() {
		return Service.listAll();
	}

	@GetMapping("/overAllData")
	public CvoidInfoDTO overAllData() {
		return Service.overAllData();
	}

	@GetMapping("/countryWise/{countryname}")
	public CvoidInfoDTO getCovidDataByCounrty(@PathVariable String countryname) {
		return Service.getCovidDataByCounrty(countryname);
	}

	@GetMapping("/statewise/{statename}")
	public CvoidInfoDTO getCovidDataByprovinceState(@PathVariable String statename) {
		return Service.getCovidDataByprovinceState(statename);
	}

	@GetMapping("/statewise/{cityName}")
	public CvoidInfoDTO getCovidDataByCity(@PathVariable String cityName) {
		return Service.getCovidDataByCity(cityName);
	}
}
