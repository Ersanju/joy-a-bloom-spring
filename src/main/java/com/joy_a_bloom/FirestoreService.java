package com.joy_a_bloom;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FirestoreService {

    public String insertData(String collection, String documentId, Map<String, Object> data) {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> future = db.collection(collection).document(documentId).set(data);
        try {
            WriteResult result = future.get();
            return "✅ Inserted at: " + result.getUpdateTime();
        } catch (Exception e) {
            e.printStackTrace();
            return "❌ Error: " + e.getMessage();
        }
    }
}
