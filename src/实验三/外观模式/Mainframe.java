package 实验三.外观模式;

public class Mainframe {

	private Memory memory;
	private CPU cpu;
	private HardDisk hardDisk;
	private OS os;
	
	public Mainframe() {
		this.memory = new Memory();
		this.cpu = new CPU();
		this.hardDisk = new HardDisk();
		this.os = new OS();
	}

	public void on() {
		System.out.println("点击了开机按钮!");
		memory.check();
		cpu.run();
		hardDisk.read();
		os.load();
		System.out.println("完成开机!");
	}
	
	public void off() {
		System.out.println("点击了关机按钮!");
		memory.off();
		cpu.off();
		hardDisk.off();
		os.off();
		System.out.println("完成关机!");
	}
}
