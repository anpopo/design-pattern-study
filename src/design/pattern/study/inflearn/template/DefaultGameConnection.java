package design.pattern.study.inflearn.template;

public class DefaultGameConnection extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String s) {
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return "id, password";
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("인증 확인");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속단계");
        return "접속";
    }
}
