package design.pattern.study.youtube.composite;

public class CompositeMain {
    public static void main(String[] args) {
        Folder root = new Folder("root"), home = new Folder("home"), user = new Folder("user"), music = new Folder("music"), picture = new Folder("picture"), doc = new Folder("doc"), usr = new Folder("usr");
        File track1 = new File("track1"), track2 = new File("track2"), pic1 = new File("pic1"), doc1 = new File("doc1"), java = new File("java");

        root.addComponent(home);
            home.addComponent(user);
            user.addComponent(music);
            user.addComponent(picture);
            user.addComponent(doc);
                music.addComponent(track1);
                music.addComponent(track2);
                picture.addComponent(pic1);
                doc.addComponent(doc1);
        root.addComponent(usr);
            usr.addComponent(java);

        root.show();

    }
}
