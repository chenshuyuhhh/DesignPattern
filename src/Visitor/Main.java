package Visitor;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi",1000));
            bindir.add(new File("latex",2000));

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
            tomura.add(new File("junk.mail",500));
            rootdir.accept(new ListVisitor());

            System.out.println("\n习题13-1测试：");
            FileFindVisitor ffv = new FileFindVisitor(".html");
            rootdir.accept(ffv);

            System.out.println("HTML files are:");
            Iterator it = ffv.getFoundFiles();
            while (it.hasNext()){
                File file = (File) it.next();
                System.out.println(file.toString());
            }

            System.out.println("\n习题13-2测试");
            SizeVisitor sv = new SizeVisitor();
            rootdir.accept(sv);
            System.out.println(rootdir.getName()+" size: "+sv.getSize());

            System.out.println("\n习题13-3测试");
            ElementArrayList list = new ElementArrayList();
            list.add(rootdir);
            list.add(yuki);
            list.accept(new ListVisitor());

        }catch (FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
