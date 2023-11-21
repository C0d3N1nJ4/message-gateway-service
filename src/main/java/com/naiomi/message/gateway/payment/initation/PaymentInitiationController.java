package com.naiomi.message.gateway.payment.initation;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pain/001")
public class PaymentInitiationController {

    private final Pain001Repository pain001Repository;

    public PaymentInitiationController(Pain001Repository pain001Repository) {
        this.pain001Repository = pain001Repository;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Pain001Request getPain001RequestById(@PathVariable UUID id) {
        return pain001Repository.findById(id).orElseThrow();
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<Pain001Request> getAllPain001Requests() {
        return pain001Repository.findAll();
    }

    @PostMapping("/create")
    @ResponseBody
    public Pain001Request createPain001Request(@RequestBody Pain001Request pain001Request) {
        return pain001Repository.save(pain001Request);
    }

}
