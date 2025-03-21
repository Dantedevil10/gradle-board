package teste.com.gradleproj.dto;

import java.util.List;

public record BoardDetailsDTO(Long id,String name,List<BoardColumnDTO> columns) {
}
