package cn.edu.nankai.medicalproject.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class TransactionManager {

	public static Connection conn = null;
	private static ConnectionManager connectionManager = new ConnectionManager();
	
	public static void beginTransaction(){
		System.out.println("[TracsactionManager]��������������Ϊ�˹��ֶ�ģʽ����"+new Date());
		try {
			conn.setAutoCommit(false);
			System.out.println("[TracsactionManager]����������Ϊ�˹��ֶ�ģʽ�ɹ�����"+new Date());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("[TracsactionManager]����������Ϊ�˹��ֶ�ģʽʧ�ܡ���"+new Date());
		}
	}
	
	public static void commit(){
		try {
			System.out.println("[TracsactionManager]�����������ύ��������"+new Date());
			conn.commit();
			System.out.println("[TracsactionManager]�������ύ�����ɹ�����"+new Date());
			connectionManager.closeConnection(conn);  // �ر����ݿ�����
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("[TracsactionManager]�������ύ����ʧ�ܡ���"+new Date());
		}
	}
	
	public static void rollback(){
		try {
			System.out.println("[TracsactionManager]����������ع���������"+new Date());
			conn.rollback();
			System.out.println("[TracsactionManager]������ع������ɹ�����"+new Date());
			connectionManager.closeConnection(conn);  // �ر����ݿ�����
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("[TracsactionManager]������ع�����ʧ�ܡ���"+new Date());
		}
	}
}
