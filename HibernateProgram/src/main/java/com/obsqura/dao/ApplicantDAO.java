package com.obsqura.dao;

import java.util.List;

import com.obsqura.entity.Applicant;
import com.obsqura.model.ApplicantInfo;

public interface ApplicantDAO {
	public Applicant findApplicant(int id);

    public List<ApplicantInfo> listApplicantInfos();

    public void saveApplicant(ApplicantInfo applicantInfo);

    public ApplicantInfo findApplicantInfo(int id);

    public void deleteApplicant(int id);
   
}
