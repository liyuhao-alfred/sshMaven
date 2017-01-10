/**
 * 
 */
/**
 * @author 李裕豪
 *
 */
package om.maven.ssh2.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import om.maven.ssh2.dao.UserDao;
import om.maven.ssh2.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List<User> getUserList() {
		List<User> list = (List<User>) getHibernateTemplate().find("From User");
		return list;
	}

	public void saveUser(User user) {
		getHibernateTemplate().save(user);

	}

	public void deleteUser(int userId) {
		getHibernateTemplate().delete(getUserByUserId(userId));

	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
	}

	public User getUserByUserId(int userId) {
		User user = (User) getHibernateTemplate().get(User.class, userId);
		return user;
	}

}
