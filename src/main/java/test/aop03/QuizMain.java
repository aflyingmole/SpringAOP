package test.aop03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.aop01.MembersDao;

public class QuizMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop3.xml");
        UserDao dao = (UserDao) ac.getBean("userDao");
        dao.insert("일유현");
        dao.delete("이유현");
        dao.update("삼유현");
        dao.select("사유현");
    }
}
