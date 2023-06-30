package NotebookLib;

import java.util.Objects;

public class Notebook {

    public String manufacture;
    public String model;
    public String processor;
    public int ramMemory;
    public int hddSpace;
    public double screenSize;

    public Notebook(String manufacture, String model, String processor, int ramMemory, int hddSpace, 
        double screenSize) {
        this.manufacture = manufacture;
        this.model = model;
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hddSpace = hddSpace;
        this.screenSize = screenSize;
    }
    
    public boolean hasCamera(){
        if (this.manufacture == "Apple"){ 
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + manufacture + " " + model + ", размер экрана - " + screenSize + ", процессор -  " + processor 
        + ", опер. память - " + ramMemory + "Гб., жесткий диск - " + hddSpace + " Гб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return manufacture == notebook.manufacture && model == notebook.model && processor == notebook.processor;
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacture, model, processor, ramMemory, hddSpace, screenSize);
    }



}
