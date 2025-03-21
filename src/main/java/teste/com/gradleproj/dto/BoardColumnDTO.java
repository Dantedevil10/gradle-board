package teste.com.gradleproj.dto;

import teste.com.gradleproj.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,String name,BoardColumnKindEnum kind,int cardsAmount) {
}
