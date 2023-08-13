package hw_s.model;

import java.io.Serializable;

public interface SaveAs {
    void save(String path, Serializable obj);
}
