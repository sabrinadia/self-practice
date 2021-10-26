package apap.self.practice.repository;

import apap.self.practice.model.AnggotaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface AnggotaDb extends JpaRepository<AnggotaModel, Long> {
    Optional<AnggotaModel> findByIdAnggota(int idAnggota);
    //List<CabangModel> findByNamaCabangOrderByNamaCabang(String Nama);

}
