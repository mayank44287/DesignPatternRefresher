package CarRentalSystem;

import java.util.List;

public interface Search {
    public List<Vehicle> searchType(String type);
    public List<Vehicle> searchByModel(String model)
}
