package cn.edu.nankai.medicalproject.biz;

import cn.edu.nankai.medicalproject.po.User;


public interface IUserBiz {
	public abstract boolean isLogin(final String name,final String password);

}
