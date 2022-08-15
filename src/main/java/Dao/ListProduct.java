package Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBContext.DBContext;

import model.product;

public class ListProduct {
	
	Connection conn = null;     // Ket noi voi sever
	PreparedStatement ps = null; // Nem cau lenh qua SQL
	ResultSet rs = null;   // Nhan ket qua tra ve
	
	public List<product> getAllProduct() {                      // ham lay tat ca Data
		List<product> list = new ArrayList<product>();
		String query = "SELECT * from \"Data2\"";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
	
		}
		return list;
	}
	
	public product getProductByID(int id) {

		List<product> list = new ArrayList<>();

		String query = "SELECT * from \"Data2\"\r\n"
				+ "WHERE id = ?";
		try {
			conn = new DBContext().getConnection(); // mo ket noi voi SQL
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)
						);

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi trong List Product");
			System.out.println(e);
		}

		return null;

	}
	
	// ham search theo name
	public List<product> seacrhByName(String txtSearch) {

		List<product> list = new ArrayList<product>();

		String query = "SELECT * from \"Data2\"\r\n"
				+ "WHERE title LIKE ?";

		try {
			conn = new DBContext().getConnection(); // mo ket noi voi SQL
			ps = conn.prepareStatement(query);
			ps.setString(1, "%" + txtSearch + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new product(rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getString(4)
						));

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi trong List Product DAO");
			System.out.println(e);
		}

		return list;

	}

	
 
}
