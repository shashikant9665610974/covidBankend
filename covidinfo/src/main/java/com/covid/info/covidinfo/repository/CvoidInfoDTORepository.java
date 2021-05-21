package com.covid.info.covidinfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.covid.info.covidinfo.bean.CvoidInfoDTO;

@Repository
public interface CvoidInfoDTORepository extends JpaRepository<CvoidInfoDTO, Long> {
	
	@Query(value = "SELECT t FROM CvoidInfoDTO t WHERE t.countryRegion= :countryRegion")
	 CvoidInfoDTO getCovidDataByCounrty(@Param("countryRegion") String countryRegion); 
	

	@Query(value = "SELECT t FROM CvoidInfoDTO t WHERE t.admin2= :admin2")
	 CvoidInfoDTO getCovidDataByCity(@Param("admin2") String admin2); 
	
	@Query(value="select t from CvoidInfoDTO t where t.provinceState= :provinceState")
    CvoidInfoDTO getCovidDataByprovinceState(@Param("provinceState") String provinceState);
	
//	List<String> listOfCountry();
//	
//	List<String> listOfCity();
//	
//	List<CvoidInfoDTO> activeCaseCountryWise();
//	
//	List<CvoidInfoDTO> activeCaseCityWise();
//	
//	long totalActiveCase  totalctiveCase();
	
	
	
	}
