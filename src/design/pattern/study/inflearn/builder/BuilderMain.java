package design.pattern.study.inflearn.builder;

import java.time.LocalDateTime;

public class BuilderMain {
    public static void main(String[] args) {

        ComputerBuilder builder = new ComputerBuilder();
        builder.setBluePrint(new LGGramBlueprint());

        builder.make();
        Computer computer = builder.getComputer();

//        Computer computer = new Computer("i7", "16G", "236G SSD");
        System.out.println(computer);




        Book book = BookBuilder
                .start()
                .setAuthor("안세형")
                .setName("나의 코딩 이야기")
                .setPublishDate(LocalDateTime.now())
                .setPage(1000)
                .build();

        System.out.println(book);
    }
}
