package br.com.tt.petshop.repository;
import br.com.tt.petshop.model.Vacina;
import br.com.tt.petshop.repository.mapper.VacinaRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class VacinaRepository {

    private final JdbcTemplate jdbcTemplate;
    public VacinaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Vacina> listarVacinas(){
        String sql = "select id,nome,valor from tb_vacina";
        List<Vacina> vacinas = jdbcTemplate.query(sql, new VacinaRowMapper());
        return vacinas;
        /*
        List<Vacina> vacinas = jdbcTemplate.query(sql, (rs, numeroLinha) ->
        new Vacina(rs.getLong("id"), rs.getString("nome"), rs.getFloat("valor")));
         */
    }
}
