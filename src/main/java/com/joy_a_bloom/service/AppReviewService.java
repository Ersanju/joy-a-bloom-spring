package com.joy_a_bloom.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import com.joy_a_bloom.model.AppReview;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ExecutionException;

@Service
public class AppReviewService {

    private static final String COLLECTION_NAME = "app_reviews";

    public String insertAppReviews(List<AppReview> reviews) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        WriteBatch batch = db.batch();

        for (AppReview review : reviews) {
            if (review.getId() == null || review.getId().isEmpty()) {
                review.setId(UUID.randomUUID().toString());
            }
            review.setCreatedAt(new Date());

            DocumentReference docRef = db.collection(COLLECTION_NAME).document(review.getId());
            batch.set(docRef, review);
        }

        ApiFuture<List<WriteResult>> future = batch.commit();
        future.get(); // Wait for batch to complete

        return "Inserted " + reviews.size() + " app reviews successfully.";
    }
}
