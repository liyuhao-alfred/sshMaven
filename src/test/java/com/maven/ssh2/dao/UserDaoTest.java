/**
 * 
 */
/**
 * @author 李裕豪
 *
 */
package com.maven.ssh2.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import om.maven.ssh2.dao.UserDao;
import om.maven.ssh2.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/*.xml" })
public class UserDaoTest {
	@Autowired
	private UserDao userDao;

	@Test
	public void testGetUserList() {
		System.out.println("00000");
	}

	@Test
	public void testSaveUserList() {
		System.out.println(userDao.getUserList());
	}

	@Test
	public void testUpdateUserList() {
		User user = new User();
		user.setName("ssh3");
		user.setDescription("ssh3");
		userDao.saveUser(user);
		System.out.println("ok");
	}
}
