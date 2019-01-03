package ChainofResponsibilty;

/**
 * 将主要方法support从递归调用修改为循环调用
 */

public abstract class Support {
    private String name;
    private Support next;
    public Support(String name){
        this.name = name;
    }
    public Support setNext(Support next){
        this.next = next;
        return next;
    }
    public final void support(Trouble trouble){
            Support temp = this;
            boolean success ;
            while (!(success = temp.resolve(trouble))&&temp.next!= null){
                temp = temp.next;
            }
            if (success) temp.done(trouble);else temp.fail(trouble);

    }
    public String toString(){
        return "[" + name + "]";
    }
    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble){
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved.");
    }
}
