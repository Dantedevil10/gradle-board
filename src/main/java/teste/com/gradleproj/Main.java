package teste.com.gradleproj;

import static teste.com.gradleproj.persistence.config.ConnectionConfig.getConnection;

import java.sql.SQLException;

import teste.com.gradleproj.persistence.migration.MigrationStrategy;
import teste.com.gradleproj.ui.MainMenu;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
