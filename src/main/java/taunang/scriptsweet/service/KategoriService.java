package taunang.scriptsweet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taunang.scriptsweet.entity.Kategori;
import taunang.scriptsweet.repo.KategoriRepo;

@Service
public class KategoriService {

    @Autowired
    KategoriRepo kategoriRepository;

    public Kategori create(Kategori kategori) {
        return kategoriRepository.save(kategori);
    }

    public Iterable<Kategori> getAll() {
        return kategoriRepository.findAll();
    }

}
