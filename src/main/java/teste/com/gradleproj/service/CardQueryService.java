package teste.com.gradleproj.service;

import lombok.AllArgsConstructor;
import teste.com.gradleproj.dto.CardDetailsDTO;
import teste.com.gradleproj.persistence.dao.CardDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}
