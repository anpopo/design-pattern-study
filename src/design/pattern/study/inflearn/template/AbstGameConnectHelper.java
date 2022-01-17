package design.pattern.study.inflearn.template;

public abstract class AbstGameConnectHelper {

    public String requestConnection(String encodedInfo) {

        // 보안 작업 -> 암호화 된 문자열 복호화
        String decodedInfo = doSecurity(encodedInfo);

        String[] arr = decodedInfo.split(", ");
        if (!authentication(arr[0], arr[1])) {
            throw new RuntimeException("authentication error");
        }

        int authorization = authorization(arr[0]);

        switch (authorization) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }

        return connection(decodedInfo);
    }

    protected abstract String doSecurity(String s) ;

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);
}
