package 实验1.抽象工厂;

public interface ComputerPartsFactory {
    CPU produceCPU();
    RAM produceRAM();
}
