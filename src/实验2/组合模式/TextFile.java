package 实验2.组合模式;

public class TextFile extends AbstractFile {
    @Override
    protected void killVirus() {
        System.out.println("文本文件-开始杀毒...");
    }
}
