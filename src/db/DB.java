package db;

import model.User;
import model.LyTable;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DB {
	Connection ct;
	PreparedStatement pstmt;
	public DB() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/lygl?useSSL=True","root","123456");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public User checkUser(String username, String password) {
		try {
			pstmt = ct.prepareStatement("select * from userTable where username=? and password =?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			User user = new User();
			while(rs.next()) {
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				return user;
			}
			return null;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public ArrayList<LyTable> findLyInfo() {
		try {
			ArrayList<LyTable> al = new ArrayList<LyTable>();
			pstmt = ct.prepareStatement("select * from lyTable");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				LyTable ly = new LyTable();
				ly.setId(rs.getInt(1));
				ly.setUserId(rs.getInt(2));
				ly.setDate(rs.getDate(3));
				ly.setTitle(rs.getNString(4));
				ly.setContent1(rs.getString(5));
				al.add(ly);
			}
			return al;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public String getUserName(int id) {
		String username=null;
		try {
			pstmt = ct.prepareStatement("select username from userTable where id =?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				username=rs.getString(1);
			}
			return username;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public boolean addInfo(LyTable ly) {
		try {
			pstmt = ct.prepareStatement("insert into lyTable(userId,date,title,content1) values (?,?,?,?)");
			pstmt.setInt(1, ly.getUserId());
			pstmt.setDate(2, new Date(ly.getDate().getTime()));
			pstmt.setString(3, ly.getTitle());
			pstmt.setNString(4, ly.getContent1());
			pstmt.executeUpdate();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
