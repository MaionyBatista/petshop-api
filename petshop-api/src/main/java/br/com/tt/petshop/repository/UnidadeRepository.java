package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.Unidade;
import br.com.tt.petshop.repository.mapper.UnidadeRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class UnidadeRepository {
    private final JdbcTemplate jdbcTemplate;

    public UnidadeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Unidade> listar() {
        String sql = "select id,nome,endereco from tb_unidade";
        return jdbcTemplate.query(sql, new UnidadeRowMapper());
    }
}
