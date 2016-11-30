package eu.veldsoft.bingo.tropical.hot.storage;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Database helper class used to manage the creation and upgrading of a
 * database. This class also usually provides the DAOs used by the other
 * classes.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

	/**
	 * 
	 */
	private static final String DATABASE_NAME = "slot.db";

	/**
	 * 
	 */
	private static final int DATABASE_VERSION = 1;
	
	/**
	 * 
	 * @param context
	 * @param file
	 */
	public DatabaseHelper(Context context, int file) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION, file);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void close() {
	}
}
