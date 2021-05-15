package com.covid.info.covidinfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.info.covidinfo.bean.CvoidInfoDTO;

public interface CvoidInfoDTORepository extends JpaRepository<CvoidInfoDTO, Long> {
	
	
	}
