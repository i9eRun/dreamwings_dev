package com.nalgae.dreamnalgae.controller.wbas;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.nalgae.dreamnalgae.entity.wbas.Cust;
import com.nalgae.dreamnalgae.service.wbas.CustService;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/wbas/cust")
@RequiredArgsConstructor
public class CustController {
    private final CustService custService;

    @GetMapping
    public List<Cust> getAll() {
        return custService.findAll();
    }

    @GetMapping("/{custCd}")
    public Cust getById(@PathVariable String custCd) {
        return custService.findById(custCd).orElse(null);
    }

    @PostMapping
    public Cust create(@RequestBody Cust cust) {
        return custService.save(cust);
    }

    @PutMapping("/{custCd}")
    public Cust update(@PathVariable String custCd, @RequestBody Cust cust) {
        cust.setCustCd(custCd);
        return custService.save(cust);
    }

    @DeleteMapping("/{custCd}")
    public void delete(@PathVariable String custCd) {
        custService.deleteById(custCd);
    }




}
