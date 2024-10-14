import com.mysql.cj.jdbc.StatementImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws SQLException {
        selectDemo();
        //diger fonksiyonlar da yazilabilir
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select first_name from actor");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("first_name")));
            }

            System.out.println(countries.size());

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            helper.showErrorMessage(exception);
        } finally {
            connection.close();

        }

    }

        public static void insertData() throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement= null;
            ResultSet resultSet;
            try{
                connection = helper.getConnection();
                String sql = "insert into actor (first_name,last_name) values (?,?)";
                statement = connection.prepareStatement(sql);
                statement.setString(1,"Tarik");
                statement.setString(2,"Akan");
                statement.executeUpdate(); // sonucu 0 veya 1 olur eklenme durumuna gore
                System.out.println("Kayit eklendi.");


            }catch(SQLException exception){
                System.out.println(exception.getMessage());
                helper.showErrorMessage(exception);
            }finally{
                statement.close();
                connection.close();

            }
        }


        public void updateData() throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement= null;
            ResultSet resultSet;
            try{
                connection = helper.getConnection();
                String sql = "update actor set first_name= 'Tarık',last_name='Akan' where actor_id=?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1,203);
                statement.executeUpdate(); // sonucu 0 veya 1 olur eklenme durumuna gore
                System.out.println("Kayit guncellendi.");


            }catch(SQLException exception){
                System.out.println(exception.getMessage());
                helper.showErrorMessage(exception);
            }finally{
                statement.close();
                connection.close();

            }
        }

    public void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement= null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            String sql = "delete from actor where actor_id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,203);
            statement.executeUpdate(); // sonucu 0 veya 1 olur eklenme durumuna gore
            System.out.println("Kayit silindi.");


        }catch(SQLException exception){
            System.out.println(exception.getMessage());
            helper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();

        }
    }
}
