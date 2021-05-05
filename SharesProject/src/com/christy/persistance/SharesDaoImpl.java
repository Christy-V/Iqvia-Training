package com.christy.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.christy.bean.Shares;



public class SharesDaoImpl implements SharesDao {

	@Override
	public ArrayList<Shares> getShare() {
		Connection connection=null;
		ArrayList<Shares> shList=new ArrayList<Shares>();
		try {
			//1. Connect
			//1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			//2. statement : DQL (Data Query Language)
			PreparedStatement preparedStatement=connection.prepareStatement("select * from shares");
			ResultSet rs=preparedStatement.executeQuery();
			
			//SHARE_ID	SHARE_NAME	TYPE	MARKET_VALUE
			//3. Process the result
			while(rs.next()){
				
				String id=rs.getString("share_id");
				String sname=rs.getString("share_name");
				String type=rs.getString("type");
				int mvalue=rs.getInt("market_value");
				
				
				Shares sh= new Shares(id, sname, type, mvalue);
				
				shList.add(sh);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return shList;
	}

	@Override
	public boolean insertRecord(Shares share) {
		Connection connection=null;
		ArrayList<Shares> shList=new ArrayList<Shares>();
		try {
			//1. Connect
			//1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			//2. statement : DML
			PreparedStatement preparedStatement=connection.prepareStatement("insert into shares values(?,?,?,?)");
			
			preparedStatement.setString(1, share.getShare_id());
			preparedStatement.setString(2, share.getShare_name());
			preparedStatement.setString(3, share.getType());
			preparedStatement.setInt(4, share.getMarket_value());
			
		
			int rows=preparedStatement.executeUpdate();
			
			
			//3. Process the result
			if(rows>0)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return false;
	}

	@Override
	public boolean deleteRecord(String share_id) {
		Connection connection=null;
		ArrayList<Shares> shList=new ArrayList<Shares>();
		try {
			//1. Connect
			//1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			PreparedStatement preparedStatement=connection.prepareStatement("delete from shares where share_id=?");
			
			preparedStatement.setString(1, share_id);
			
			int rows=preparedStatement.executeUpdate();
			
			//3. Process the result
			if(rows>0)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return false;
	}

	@Override
	public boolean updateMarketValues(int market_values,String share_id) {
		Connection connection=null;
		ArrayList<Shares> shList=new ArrayList<Shares>();
		try {
			//1. Connect
			//1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			//2. statement : DML
			PreparedStatement preparedStatement=connection.prepareStatement("update shares set market_value= ? where share_id=?");
			
			preparedStatement.setInt(1, market_values);
			preparedStatement.setString(2, share_id);
			int rows=preparedStatement.executeUpdate();
			
			
			//3. Process the result
			if(rows>0)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return false;
	}
	@Override
	public Shares searchById(String share_id) {
		Connection connection=null;
		Shares sh=null;
		try {
			//1. Connect
			//1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//2. statement : DQL (Data Query Language)
			PreparedStatement preparedStatement=connection.prepareStatement("select * from shares where share_id=?");
			preparedStatement.setString(1, share_id);
			
			ResultSet rs=preparedStatement.executeQuery();
			
			//3. Process the result
			if(rs.next()){
				
				String id=rs.getString("share_id");
				String sname=rs.getString("share_name");
				String type=rs.getString("type");
				int mvalue=rs.getInt("market_value");
				
                sh= new Shares(id, sname, type, mvalue);
					
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sh;
	}
}
