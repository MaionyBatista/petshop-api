package br.com.tt.petshop.repository.mapper;
import br.com.tt.petshop.model.Unidade;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
public class UnidadeRowMapper implements RowMapper<Unidade> {
    @Override
    public Unidade mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Unidade(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("endereco")
        );
    }
}
