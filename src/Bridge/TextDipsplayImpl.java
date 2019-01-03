package Bridge;

import java.io.*;

/**
 *  习题 9-2 实现"显示文本文件的内容"的功能
 */
public class TextDipsplayImpl extends DisplayImpl {
    String filename;
    TextDipsplayImpl(String filename){
        this.filename = filename;
    }
    @Override
    public void rawOpen() {
        System.out.println("以下为文本内容");
    }

    @Override
    public void rawPrint() {
        File file = new File(filename);
        if (!file.exists()){
            System.out.println("此文件不存在");
        }else {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader br = new BufferedReader(fileReader);
                String content;
                while ((content=br.readLine())!=null){
                    System.out.println(content);
                }
                System.out.println("文件大小为（MB）：" + new FileInputStream(file).available()/1024/1024+"M");
            }  catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void rawClose() {
        System.out.println("已到文本末尾，文档输出结束。");
    }
}
