package teste.com.gradleproj.dto;

import teste.com.gradleproj.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
