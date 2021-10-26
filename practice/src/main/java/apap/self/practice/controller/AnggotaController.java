package apap.self.practice.controller;

import apap.self.practice.model.AnggotaModel;
import apap.self.practice.service.AnggotaService;

import org.hibernate.boot.jaxb.spi.Binding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AnggotaController {
    @Qualifier("anggotaServiceImpl")
    @Autowired
    private  AnggotaService anggotaService;

    @GetMapping("/view/{idAnggota}")
    public String viewDetail(
            @PathVariable int idAnggota,
            Model model
    ){
        AnggotaModel anggota = anggotaService.getAnggotaByIdAnggota(idAnggota);
        model.addAttribute("anggota", anggota);

        return "view-anggota";
    }

    @GetMapping("/update/{idAnggota}")
    public String updateCabangForm(
            @PathVariable int idAnggota,
            Model model
    ){
        AnggotaModel anggota = anggotaService.getAnggotaByIdAnggota(idAnggota);
        model.addAttribute("anggota", anggota);

        return "form-update-anggota";
    }

    @PostMapping("/update")
    public String updateAnggotaSubmit(
            @ModelAttribute AnggotaModel anggota,
            Model model
    ){
        anggotaService.updateAnggota(anggota);
        return "update-anggota";

    }

    @GetMapping("/tambah")
    public String addAnggota(Model model){
        model.addAttribute("anggota", new AnggotaModel());
        return "form-add-anggota";
    }

    @PostMapping("/tambah")
    public String addFaskesSubmit(
            @ModelAttribute AnggotaModel anggota,
            Model model
    ){
        anggotaService.addAnggota(anggota);
        return "add-anggota";
    }


}
