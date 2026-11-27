package dk.ek.projekt3_gruppe_1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepo {
    @Autowired
    private DataSource dataSource;

    public Integer findUserIdByCredentials(String username, String password) {
        String sql = "SELECT userId FROM user WHERE username = ? AND password = ?";
        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? rs.getInt("userId") : null;
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Could not verify login credentials", e);
        }
    }

    public String findRoleByCredentials(String username, String password) {
        String sql = "SELECT role FROM user WHERE username = ? AND password = ?";
        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? rs.getString("role") : null;
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Could not verify login credentials", e);
        }
    }
}
