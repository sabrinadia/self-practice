package apap.self.practice.controller;
import apap.self.practice.model.AnggotaModel;

import apap.self.practice.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class BaseController {
    @Qualifier("anggotaServiceImpl")
    @Autowired
    private AnggotaService anggotaService;

    @GetMapping("/")
    public String listAnggota(Model model){
        List<AnggotaModel> listAnggota = anggotaService.getAnggotaList();
        model.addAttribute("listAnggota", listAnggota);
        return "home";
    }






}

