package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

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
}
