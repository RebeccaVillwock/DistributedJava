package service;

import dao.MiniDescriptionDAO;
import entity.MiniDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MiniDescriptionServiceImpl implements MiniDescriptionService {

    @Autowired
    private MiniDescriptionDAO miniDescriptionDAO;

    @Override
    @Transactional
    public void saveMiniDescription(MiniDescription theMiniDescription, int miniId) {
        miniDescriptionDAO.saveMiniDescription(theMiniDescription);
    }

    @Override
    @Transactional
    public MiniDescription getMiniDescription(int theId) {
        return miniDescriptionDAO.getMiniDescription(theId);
    }

    @Override
    @Transactional
    public void deleteMiniDescription(int theId) {
        miniDescriptionDAO.deleteMiniDescription(theId);
    }
}
