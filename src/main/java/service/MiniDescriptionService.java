package service;

import entity.MiniDescription;

public interface MiniDescriptionService {
    void saveMiniDescription(MiniDescription theMiniDescription, int miniId);

    MiniDescription getMiniDescription(int theId);

    void deleteMiniDescription(int theId);
}
