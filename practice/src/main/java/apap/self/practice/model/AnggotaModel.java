package apap.self.practice.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Entity
@Table(name ="anggota")

public class AnggotaModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnggota;

    @NotNull
    @Size(max=16)
    @Column(name="nia", nullable=false, unique = true)
    private String nia;

    @NotNull
    @Size(max=16)
    @Column(name="nama", nullable=false)
    private String nama;

    @NotNull
    @Column(name = "jenis_kelamin", nullable = false)
    private int jenisKelamin;

    @NotNull
    @Column(nullable=false, name="tanggal_lahir")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDate tanggalLahir;

    @Size(max=100)
    @Column(name="alamat")
    private String alamat;

    @Size(max=20)
    @Column(name="no_hp")
    private String nomorHp;

    @Size(max=50)
    @Column(name="pekerjaan")
    private String pekerjaan;

    @NotNull
    @Column(name="status")
    private int status;

}
