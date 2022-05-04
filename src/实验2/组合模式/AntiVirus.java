package 实验2.组合模式;

public class AntiVirus {
    public static void main(String[] args) {
        Folder folder1 = new Folder();
        Folder folder2 = new Folder();
        folder1.add(new ImageFile());
        folder1.add(new TextFile());
        folder2.add(new MediaFile());
        folder1.add(folder2);

        folder1.killVirus();
    }
}
