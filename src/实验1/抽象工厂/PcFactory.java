package 实验1.抽象工厂;

public class PcFactory implements ComputerPartsFactory {
    @Override
    public CPU produceCPU() {
        return new PcCPU();
    }

    @Override
    public RAM produceRAM() {
        return new PcRAM();
    }
}
