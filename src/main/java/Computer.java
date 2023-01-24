public class Computer {
    private int memory;
    private int cpu;
    private String name;

    Computer() {};
    Computer(int memory, int cpu, String name) {
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;
    }

    void getCpu() {
        System.out.println(cpu);
    }

    void getMemory() {
        System.out.println(memory);
    }

    void setMemory(int m) {
        memory = m;
    }
}