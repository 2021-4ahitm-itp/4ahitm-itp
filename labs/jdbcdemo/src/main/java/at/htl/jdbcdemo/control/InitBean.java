package at.htl.jdbcdemo.control;

import io.agroal.api.AgroalDataSource;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@ApplicationScoped
public class InitBean {

    @Inject
    AgroalDataSource dataSource;

    /**
     *
     * https://blogs.oracle.com/developers/configuring-the-oracle-jdbc-drivers-with-quarkus
     *
     * @param event
     */
    void init(@Observes StartupEvent event) {

        StringBuilder sb = new StringBuilder();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps =
                     connection.prepareStatement(" SELECT * FROM todos");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                sb.append(rs.getString("description")).append("\n");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(sb.toString());

    }

}
