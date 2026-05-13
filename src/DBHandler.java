import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHandler {
	private Connection connection;
	private String datenbank;
	private Statement stmt;
	private ResultSet rs;
	private int anzahl;
	
	public DBHandler(String datenbank)   {
		anzahl = 0;
		this.datenbank = "jdbc:sqlite:" + datenbank;
		System.out.println(this.datenbank);
		try {
			connection = DriverManager.getConnection(this.datenbank);
			System.out.println("Verbindung zur SQLite-Datenbank konnte hergestellt werden."); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}            
         try {
			stmt  = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void executeSelect(String sql)  {
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean next()  {	
		try {
			if (rs.next())
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public int executeUpdate(String sql) {
		try {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public String getString(String attribute)   {
		try {
			return rs.getString(attribute);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int getInt(String attribute)   {
		try {
			return rs.getInt(attribute);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public double getDouble(String attribute)   {
		try {
			return rs.getDouble(attribute);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int getAnzahl()   {
		return anzahl;
	}
	
	public void erhoeheAnzahl()    {
		anzahl++;
	}
	
}
