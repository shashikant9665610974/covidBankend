package com.covid.info.covidinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.covid.info.covidinfo.bean.CvoidInfoDTO;
import com.covid.info.covidinfo.repository.CvoidInfoDTORepository;

@Service
@Transactional
public class CvoidInfoDTOService {

	@Autowired
	private CvoidInfoDTORepository repo;

	public List<CvoidInfoDTO> listAll() {
		return repo.findAll();
	}

	public void save(CvoidInfoDTO cvoidInfoDTO) {
		repo.save(cvoidInfoDTO);
	}

	public CvoidInfoDTO get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}
	
//	public List<CvoidInfoDTO> listAll()
//	{
//		
//	}

}
