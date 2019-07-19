package cn.onlov.utils;



import cn.onlov.evaluate.core.dao.entities.OnlovUser;
import org.apache.shiro.crypto.hash.SimpleHash;

public class PasswordHelper {
	//private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	private String algorithmName = "md5";
	private int hashIterations = 2;

	public void encryptPassword(OnlovUser onlovUser) {
//		String newPassword = new SimpleHash(algorithmName, onlovUser.getUserPwd(),  ByteSource.Util.bytes(Constants.SALT), hashIterations).toHex();
		String newPassword = new SimpleHash(algorithmName, onlovUser.getUserPwd()).toHex();
		onlovUser.setUserPwd(newPassword);

	}
	public static void main(String[] args) {
		PasswordHelper passwordHelper = new PasswordHelper();
		OnlovUser onlovUser = new OnlovUser();
		onlovUser.setLoginName("evaluate");
			onlovUser.setUserPwd("123456");
		passwordHelper.encryptPassword(onlovUser);
		System.out.println(onlovUser.getUserPwd());
	}
}
