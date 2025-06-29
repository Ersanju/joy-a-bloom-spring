package com.joy_a_bloom.controller;

import com.joy_a_bloom.model.AppReview;
import com.joy_a_bloom.service.AppReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/admin/app-reviews")
@CrossOrigin(origins = "*")
public class AppReviewController {

    @Autowired
    private AppReviewService appReviewService;

    @PostMapping("/add")
    public String addAppReviews(@RequestBody List<AppReview> reviews) throws ExecutionException, InterruptedException {
        return appReviewService.insertAppReviews(reviews);
    }
}
