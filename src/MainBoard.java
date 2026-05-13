
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainBoard {
    public static void main(String[] args) throws SQLException {

        DBHandler db = new DBHandler("C:/Users/Admin/Desktop/Euro-FH/Winfo/KanbanGedöns/KanbanSQL/src/KanbanSQL.db");
        String sql = "Select * from Items left outer join Employees on Items.EmployeeID = Employees.ID ";

        db.executeSelect(sql);

        if (db.next() == false) {
            System.out.println("Kein Ergebnis");
        } else {
            //System.out.println("");
            //System.out.println("");

            do {
                System.out.print(db.getInt("ID") + "\t");
                System.out.print(db.getString("Title") + "\t");
                System.out.print(db.getInt("BucketID") + "\t");

                System.out.print(db.getString("Name") + "\t");
                //System.out.print(db.getString("Title") + "\t");
                System.out.print("\n");
            } while (db.next());
        }

    }


}
