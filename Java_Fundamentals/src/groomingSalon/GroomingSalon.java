package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    List<Pet> data = new ArrayList<>();

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
    }

    public void add(Pet pet) {
        if (capacity > data.size()) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet e : data) {
            if (e.getName().equals(name)) {
                data.remove(e);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet e : data) {
            if (e.getName().equals(name) && e.getOwner().equals(owner)) {
                return e;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuffer result = new StringBuffer(" The grooming salon has the following clients:\n");
        for (Pet e : data) {
            result.append(e.getName()).append(" ").append(e.getOwner()).append("\n");
        }
        return result.toString();
    }
}
