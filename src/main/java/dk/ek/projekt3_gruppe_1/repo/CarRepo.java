package dk.ek.projekt3_gruppe_1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CarRepo {
    @Autowired
    private DataSource dataSource;


}
