package design.pattern.study.youtube.template;

public class TemplateMain {

    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnection();
        String connectionInfo = helper.requestConnection("asdfasdfa");

        System.out.println(connectionInfo);

    }
}
