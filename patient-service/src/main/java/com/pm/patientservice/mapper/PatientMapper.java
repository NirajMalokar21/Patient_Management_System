package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDTO (Patient p) {
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(p.getId().toString());
        dto.setName(p.getName());
        dto.setAddress(p.getAddress());
        dto.setDateOfBirth(p.getDateOfBirth().toString());
        dto.setEmail(p.getEmail());
        return dto;
    }

    public static Patient toModel(PatientRequestDTO dto) {
        Patient p = new Patient();
        //p.setId(dto.getId());
        p.setName(dto.getName());
        p.setAddress(dto.getAddress());
        p.setEmail(dto.getEmail());
        p.setDateOfBirth(LocalDate.parse(dto.getDateOfBirth()));
        p.setRegisteredDate((LocalDate.parse(dto.getRegisteredDate())));
        return p;
    }
}
