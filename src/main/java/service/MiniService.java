package service;

import entity.Mini;

import java.util.List;

public interface MiniService {
    List<Mini> getMinis();

    void saveMini(Mini theMini);

    Mini getMini(int theId);

    void deleteMini(int theId);

    List<Mini> getMinisByName(String searchTerm);
}
