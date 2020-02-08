package controller;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import model.Livro;

public class CriarDB {
	
	private final static String DATABASE_URL = 
			"jdbc:mysql://localhost:3306/aula24?useTimezone=true&serverTimezone=UTC";
	
	private Dao<Livro, Integer> livrosDao;

	public static void main(String[] args) throws Exception {

		new CriarDB().doMain(args);
		
	}
	
	private void doMain(String[] args) throws Exception {
		ConnectionSource connectionSource = null;
		try {
			connectionSource = new JdbcConnectionSource(DATABASE_URL, "root", "alunolab");
			setupDatabase(connectionSource);
			System.out.println("\n\nIt seems to have worked\n\n");
			
		}finally {
			if (connectionSource != null) {
				connectionSource.close();
			}
		}
	}

	private void setupDatabase(ConnectionSource connectionSource) throws Exception {
		livrosDao = DaoManager.createDao(connectionSource, Livro.class);
		//If you need to create the table
		TableUtils.createTable(connectionSource, Livro.class);
		
		
	}

}
