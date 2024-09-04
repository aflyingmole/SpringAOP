package test.aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop1.xml");
        MembersDao dao = (MembersDao) ac.getBean("membersDao");
        dao.insert("일유현");
        dao.delete("이유현");
        dao.update("삼유현");
        dao.select("사유현");
    }
}
