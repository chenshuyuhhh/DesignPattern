package Composite;

import Visitor.FileTreatmentException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries.......");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi",1000));
            bindir.add(new File("latex",2000));
            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html",100));
            yuki.add(new File("Composite.java",200));
            hanako.add(new File("memo.text",300));
            hanako.add(new File("index.html",350));
            tomura.add(new File("game.doc",400));
            File junk = new File("junk.mail",500);
            tomura.add(junk);
            rootdir.printList();

            System.out.println("习题11-2测试");
            System.out.println("root = " + rootdir.getRoad());
            System.out.println("yuki = " + yuki.getRoad());
            System.out.println("hannako = " + hanako.getRoad());
            System.out.println("junk = " + junk.getRoad());
        }catch (FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
