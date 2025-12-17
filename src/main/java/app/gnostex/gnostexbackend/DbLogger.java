/*
package app.gnostex.gnostexbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DbLogger implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        try (var conn = dataSource.getConnection()) {
            // Force a simple query to test authentication
            // var stmt = conn.createStatement();
            //stmt.execute("SELECT 1");
            System.out.println("DB connection is valid: " + conn.getMetaData().getURL());
        }
    }
}

 */
