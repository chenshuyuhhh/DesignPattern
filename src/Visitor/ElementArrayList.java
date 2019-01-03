package Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 使得Directory和File类可以被add直ElementArrayList中，还可以接受ListVisitor的实例访问它
 */

public class ElementArrayList implements Element {
    private ArrayList arrayList = new ArrayList();
    @Override
    public void accept(Visitor v) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            if (entry instanceof File){
                v.visit((File) entry);
            }else v.visit((Directory) entry);
        }
    }

    public void add(Entry entry){
        arrayList.add(entry);
    }
}
