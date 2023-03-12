package taunang.scriptsweet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import taunang.scriptsweet.entity.Kategori;
import taunang.scriptsweet.service.KategoriService;

@RestController
@RequestMapping("/mykategori")
public class KategoriController {

    @Autowired
    KategoriService kategoriService;

    @PostMapping
    public Kategori create(@RequestBody Kategori kategori) {
        return kategoriService.create(kategori);
    }

    @GetMapping
    public Iterable<Kategori> getKategori() {
        return kategoriService.getAll();
    }
}
