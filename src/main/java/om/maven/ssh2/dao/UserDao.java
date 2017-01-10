/**
 * 
 */
/**
 * @author 李裕豪
 *
 */
package om.maven.ssh2.dao;

import java.util.List;

import om.maven.ssh2.entity.User;


public interface UserDao {

	public List<User> getUserList();

	public void saveUser(User user);

	public void deleteUser(int userId);

	public void updateUser(User user);

	public User getUserByUserId(int userId);
}
