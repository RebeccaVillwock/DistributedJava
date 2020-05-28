package dao;

import entity.MiniDescription;

import java.util.List;

public interface MiniDescriptionDAO {
   void saveMiniDescription(MiniDescription theMiniDescription);

    MiniDescription getMiniDescription(int theId);

    void deleteMiniDescription(int theId);
}
