package Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 将所有后缀名为.html的文件都汇集起来
 */
public class FileFindVisitor extends Visitor{
    private String behind;
    private ArrayList findfile = new ArrayList();
    public FileFindVisitor(String behind){
        this.behind = behind;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(behind))
            findfile.add(file);
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }

    public Iterator getFoundFiles(){
        return findfile.iterator();
    }
}
