package Flyweight;

/**
 * 增加构造方法
 */
public class BigString {
    boolean shared = true;
    private BigChar[] bigChars;
    public BigString(String str){
        shared(str);
    }
    public BigString(String str,Boolean shared){
        this.shared = shared;
        shared(str);
    }
    public void print(){
        for (int i = 0;i<bigChars.length;i++){
            bigChars[i].print();
        }
    }

    public void shared(String str){
        if (shared){
            bigChars = new BigChar[str.length()];
            BigCharFactory factory = BigCharFactory.getInstance();
            for (int i = 0;i<bigChars.length;i++){
                bigChars[i] = factory.getBigChar(str.charAt(i));
            }
        }else {
            bigChars =  new BigChar[str.length()];
            for (int i = 0;i<bigChars.length;i++){
                bigChars[i] = new BigChar(str.charAt(i));
            }
        }
    }
}
