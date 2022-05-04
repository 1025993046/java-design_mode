package 实验2.组合模式;

public class MediaFile extends AbstractFile {
    @Override
    protected void killVirus() {
        System.out.println("音频视频文件-开始杀毒...");
    }
}
