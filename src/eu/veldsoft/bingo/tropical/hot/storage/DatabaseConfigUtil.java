package eu.veldsoft.bingo.tropical.hot.storage;

import java.io.IOException;
import java.sql.SQLException;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

/**
 * Databese configuration class.
 * 
 * @author Todor Balabanov
 */
public class DatabaseConfigUtil extends OrmLiteConfigUtil {
	public static void main(String[] args) throws SQLException, IOException {
		writeConfigFile("ormlite_config.txt");
	}
}
