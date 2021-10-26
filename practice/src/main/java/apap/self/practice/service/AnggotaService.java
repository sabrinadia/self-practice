package apap.self.practice.service;

import apap.self.practice.model.AnggotaModel;


import java.util.List;

public interface AnggotaService {
    AnggotaModel getAnggotaByIdAnggota(int idAnggota);
    void addAnggota(AnggotaModel anggota);
    void updateAnggota(AnggotaModel ag);
    List<AnggotaModel> getAnggotaList();

}
