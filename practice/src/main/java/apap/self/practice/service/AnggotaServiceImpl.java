package apap.self.practice.service;
import apap.self.practice.model.AnggotaModel;
import apap.self.practice.repository.AnggotaDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AnggotaServiceImpl implements AnggotaService {
    @Autowired
    AnggotaDb AnggotaDb;

    @Override
    public AnggotaModel getAnggotaByIdAnggota(int idAnggota){
        Optional<AnggotaModel> ag = AnggotaDb.findByIdAnggota(idAnggota);
        if(ag.isPresent()){
            return ag.get();
        }
        return null;
    }

    @Override
    public void addAnggota(AnggotaModel ag){
        AnggotaDb.save(ag);

    }

    @Override
    public void updateAnggota(AnggotaModel ag){
        AnggotaDb.save(ag);
    }

    @Override
    public List<AnggotaModel> getAnggotaList(){
        return AnggotaDb.findAll();
    }


}
