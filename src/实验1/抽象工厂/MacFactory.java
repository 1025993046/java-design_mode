package 实验1.抽象工厂;

public class MacFactory implements ComputerPartsFactory {
    @Override
    public CPU produceCPU() {
        return new MacCPU();
    }

    @Override
    public RAM produceRAM() {
        return new MacRAM();
    }
}