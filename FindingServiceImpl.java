package com.armorcode.parser.service.impl;
import com.armorcode.authserver.jpa.dto.VulnerabilityJpaDto;
import java.util.Map;
public class FindingServiceImpl {
    public void addAdditionalCVEDetails(VulnerabilityJpaDto dto) {
        // Simulates the lambda causing NullPointerException
        Map<String, Object> otherProps = dto.getOtherProperties(); // this returns null
        otherProps.put("cve", "CVE-2025-1234"); // NullPointerException here
    }
    public void processNewFindings() {
        VulnerabilityJpaDto dto = new VulnerabilityJpaDto();
        addAdditionalCVEDetails(dto);
    }
}
