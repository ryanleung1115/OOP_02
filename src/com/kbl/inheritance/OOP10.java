package com.kbl.inheritance;

public class OOP10 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.showInfo();
    }
}

class Computer {
    private String cpu;
    private int ram;
    private int hdd;

    public Computer(String cpu, int ram, int hdd) {
        setCpu(cpu);
        setRam(ram);
        setHdd(hdd);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getDetails() {
        return "cpu = " + cpu + ", ram = " + ram + ", hdd = " + hdd;
    }
}

class PC extends Computer {
    private String brand;

    public PC(String cpu, int ram, int hdd, String brand) {
        super(cpu, ram, hdd);
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void showInfo() {
        System.out.println(getDetails() + ", brand = " + brand);
    }
}