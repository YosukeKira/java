package teamDocoTsubu;

public class LoginLogic {

	public boolean loginJudge( User user ) {
		boolean judge = false;
		if( user.getPass().equals("1234") ) {
			judge = true;
		}
		return judge;
	}

}
