package cn.edu.nankai.medicalproject.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import cn.edu.nankai.medicalproject.dao.IUserDao;
import cn.edu.nankai.medicalproject.db.ConnectionManager;
import cn.edu.nankai.medicalproject.db.DBUtils;
import cn.edu.nankai.medicalproject.po.User;

public class UserDaoImpl implements IUserDao {


	private ConnectionManager connectionManager;
	private Connection conn;
	private DBUtils dbUtils;



	public UserDaoImpl() {
		super();
		this.connectionManager = new ConnectionManager();
		this.dbUtils = new DBUtils();
	}



	@Override
	public User selectById(String name) {
		// TODO Auto-generated method stub
		// 步骤1：获取一个数据库连接对象
				conn = this.connectionManager.openConnection();
				// 步骤2：创建SQL语句模板
				String strSQL = "select * from user where user_name=?";
				Object[] params = new Object[] { name };
				// 步骤4：调用dbutils中的方法完成对数据库的查询操作
				ResultSet resultSet = this.dbUtils.execQuery(conn, strSQL, params);
				// 步骤5：获取结果集合并封装成一个对象
				try {
					if (resultSet.next()) {
						// 步骤6：创建一个Student对象
						User user = new User();
						user.setUid(resultSet.getString(1));
						user.setName(resultSet.getString(2));
						user.setPassword(resultSet.getString(3));
						user.setGender(resultSet.getInt(4));
						
						return user;
					} else {
						return null;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				} finally {
					this.connectionManager.closeConnection(conn);
				}
		
	}

}
