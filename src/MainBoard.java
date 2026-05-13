
//import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainBoard {
    public static void main(String[] args) throws SQLException {

        DBHandler db = new DBHandler("KanbanSQL.db");
        String sql = "SELECT \n" +
                "    Buckets.ID AS BucketID,\n" +
                "    Buckets.Name AS BucketName,\n" +
                "    Items.ID AS ItemID,\n" +

                "    Items.Title AS ItemTitle,\n" +
                "    Employees.ID AS MitarbeiterID,\n" +
                "    Employees.Name AS MitarbeiterName\n" +
                "FROM Buckets\n" +
                "INNER JOIN Items ON Items.BucketID = Buckets.ID\n" +
                "LEFT OUTER JOIN Employees ON Items.EmployeeID = Employees.ID\n";

        db.executeSelect(sql);

        if (db.next() == false) {
            System.out.println("Kein Ergebnis");
        } else {
            //System.out.println("");
            //System.out.println("");

            do {
                System.out.print(db.getInt("BucketID") + "\t\t\t");
                System.out.print(db.getString("BucketName") + "\t\t\t");
                System.out.print(db.getString("ItemTitle") + "\t\t\t");
                System.out.print(db.getInt("ItemID") + "\t\t\t");

                System.out.print("\n");
            } while (db.next());
        }

    }


}
