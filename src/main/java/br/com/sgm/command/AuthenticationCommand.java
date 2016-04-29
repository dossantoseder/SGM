package br.com.sgm.command;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.Map;
import br.com.sgm.authentication.User;

public class AuthenticationCommand implements Command {
	private User user;
	private static final Map<String, User> users = getUsers();

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		// RequestDispatcher rd;
		String rd = "view/home.html";
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		/*User user = validateLogin(name, password);

		if (user == null) {
			// rd = req.getRequestDispatcher("/index.html");
			rd = "view/home.html";
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			// rd = req.getRequestDispatcher("/index.html");
			rd = "view/home.html";
		}*/

		// rd.forward(req, res);
		return rd;
	}

	private User validateLogin(String name, String password) {
		// All parameters must be valid
		if (name == null || password == null) {
			return null;
		}

		// Get a user by key
		User user = users.get(name);

		if (user == null) {
			return null;
		}

		// Check if the password is valid
		if (!user.getPassword().equals(password.trim())) {
			return null;
		}

		return user;
	}

	private static Map<String, User> getUsers() {

		Map<String, User> users = new HashMap<String, User>();

		User userOne = new User("one", "one");
		User userTwo = new User("two", "TWO");

		users.put(userOne.getName(), userOne);
		users.put(userTwo.getName(), userTwo);

		return users;
	}

}
