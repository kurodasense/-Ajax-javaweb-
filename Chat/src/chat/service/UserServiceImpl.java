package chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chat.dao.UserDao;
import chat.po.Content;
import chat.po.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	public User login(User user) {
		// TODO �Զ����ɵķ������
		return userDao.login(user);
	}

	@Override
	public int regist(User user) {
		// TODO �Զ����ɵķ������
		return userDao.regist(user);
	}

	@Override
	public List<User> selectAllUsers() {
		return userDao.selectAllUsers();
	}

	@Override
	public List<Content> showContent(String chatid) {
		// TODO �Զ����ɵķ������
		return userDao.showContent(chatid);
	}

	@Override
	public int send(String chatid, String username, String content) {
		// TODO �Զ����ɵķ������
		return userDao.send(chatid, username, content);
	}

	@Override
	public User findUser(Integer id) {
		// TODO �Զ����ɵķ������
		return userDao.findUser(id);
	}

}
