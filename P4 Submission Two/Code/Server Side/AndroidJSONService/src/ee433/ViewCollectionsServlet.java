package ee433;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

public class ViewCollectionsServlet extends HttpServlet {

	private final static String DATABASE_URL = "jdbc:mysql://71.45.66.15:3306/ee433";
    private Dao<User, Integer> userDao;
    private Dao<Item, Integer> itemDao;
    private Dao<Collection, Integer> collectionDao;
	private String username;
	private List<User> users;
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	JdbcConnectionSource connectionSource = null;
    //drivers.getConnection(DATABASE_URL, "root", "Coll3ctor1");

    try {
        
        // create data source for the database
        try {
			connectionSource = new JdbcConnectionSource(DATABASE_URL,"collector", "Collectors");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        //setup database and DAOs. To create a new table, must uncomment.
        //setupDatabase(connectionSource);

        //read and write
        //readWriteData();

        //System.out.println("\nWorks");
    } finally {
        if (connectionSource != null) {
            try {
				connectionSource.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	
    }
    try {
		username = userDao.queryForAll().toString();
		resp.getWriter().println(username);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
}
}

