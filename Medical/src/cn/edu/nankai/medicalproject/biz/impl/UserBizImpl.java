package cn.edu.nankai.medicalproject.biz.impl;

import cn.edu.nankai.medicalproject.biz.IUserBiz;
import cn.edu.nankai.medicalproject.dao.IUserDao;
import cn.edu.nankai.medicalproject.dao.impl.UserDaoImpl;
import cn.edu.nankai.medicalproject.po.User;

public class UserBizImpl implements IUserBiz {
	private IUserDao userDao;
	

	public UserBizImpl() {
		super();
		this.userDao = new UserDaoImpl();
	}


	@Override
	public boolean isLogin(String name, String password) {
		// TODO Auto-generated method stub
		User user = this.userDao.selectById(name);
		if( user!=null )
		{
		if(user.getPassword().equals(password))
			return true;
		}
		else return false;
		return false;

	}

}
