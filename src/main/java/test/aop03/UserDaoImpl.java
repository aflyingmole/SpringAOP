package test.aop03;

public class UserDaoImpl implements UserDao {

    public int insert(Object data) {
        for (int i = 0; i < 1000000000; i++);
        System.out.println(data + " 추가");
        return 1;
    }

    public int update(Object data) {
        for (int i = 0; i < 1000000000; i++);
        System.out.println(data + " 수정");
        return 1;
    }

    public int delete(Object data) {
        for (int i = 0; i < 1000000000; i++);
        System.out.println(data + " 삭제");
        return 1;
    }

    public Object select(Object data) {
        for (int i = 0; i < 1000000000; i++);
        System.out.println(data + " 조회");
        return data;
    }
}
