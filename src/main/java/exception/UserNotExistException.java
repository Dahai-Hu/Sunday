package exception;

/**
 * @hurusea
 * @create2020-03-24 21:56
 */
public class UserNotExistException extends RuntimeException{

    public UserNotExistException() {
        super("用户不存在");
    }

}
