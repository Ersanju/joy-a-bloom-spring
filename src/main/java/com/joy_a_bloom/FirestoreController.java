package com.joy_a_bloom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/firestore")
public class FirestoreController {

    @Autowired
    private FirestoreService firestoreService;

    @PostMapping("/insert")
    public String insertSample(@RequestParam String id) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Birthday Cake");
        data.put("category", "Cake");
        data.put("price", 499);
        data.put("available", true);

        return firestoreService.insertData("products", id, data);
    }
}
