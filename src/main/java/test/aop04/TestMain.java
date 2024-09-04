package test.aop04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.aop01.MembersDao;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop4.xml");
        MembersDao dao = (MembersDao) ac.getBean("dao");
        dao.insert("일유현");
        dao.delete("이유현");
        dao.update("삼유현")
        ;
        dao.select("사유현");
    }


}

