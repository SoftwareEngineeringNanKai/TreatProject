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
		// ����1����ȡһ�����ݿ����Ӷ���
				conn = this.connectionManager.openConnection();
				// ����2������SQL���ģ��
				String strSQL = "select * from user where user_name=?";
				Object[] params = new Object[] { name };
				// ����4������dbutils�еķ�����ɶ����ݿ�Ĳ�ѯ����
				ResultSet resultSet = this.dbUtils.execQuery(conn, strSQL, params);
				// ����5����ȡ������ϲ���װ��һ������
				try {
					if (resultSet.next()) {
						// ����6������һ��Student����
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
