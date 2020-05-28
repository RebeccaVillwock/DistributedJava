package service;

import dao.MiniDAO;
import entity.Mini;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MiniServiceImpl implements MiniService {

    @Autowired
    private MiniDAO miniDAO;

    @Override
    @Transactional
    public List<Mini> getMinis() {
        return miniDAO.getMinis();
    }

    @Override
    @Transactional
    public void saveMini(Mini theMini) {
        miniDAO.saveMini(theMini);
    }

    @Override
    @Transactional
    public Mini getMini(int theId) {
        return miniDAO.getMini(theId);
    }

    @Override
    @Transactional
    public void deleteMini(int theId) {
        miniDAO.deleteMini(theId);
    }

    @Override
    public List<Mini> getMinisByName(String searchTerm) {
        return miniDAO.getMinisByName(searchTerm);
    }
}
