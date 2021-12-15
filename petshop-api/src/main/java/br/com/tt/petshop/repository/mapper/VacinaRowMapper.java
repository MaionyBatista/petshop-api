package br.com.tt.petshop.repository.mapper;

import br.com.tt.petshop.model.Vacina;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
public class VacinaRowMapper implements RowMapper<Vacina> {
    @Override
    public Vacina mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Vacina(
                rs.getLong("id"),
                rs.getString("nome"),
                rs.getFloat("valor"));
    }
}
