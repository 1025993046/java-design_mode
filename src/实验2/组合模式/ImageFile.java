package 实验2.组合模式;

public class ImageFile extends AbstractFile {
    @Override
    protected void killVirus() {
        System.out.println("图片文件-开始杀毒...");
    }
}
