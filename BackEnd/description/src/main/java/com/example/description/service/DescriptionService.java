// package com.example.description.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.description.model.Description;
// import com.example.description.repository.DescriptionRepository;

// @Service
// public class DescriptionService {
//     @Autowired
//     private final DescriptionRepository descriptionRepository;

//     public DescriptionService(DescriptionRepository descriptionRepository) {
//         this.descriptionRepository = descriptionRepository;
//     }

//     public Description createDescription(Description description) {
//         return descriptionRepository.save(description);
//     }

//     public List<Description> getAllDescriptions() {
//         return descriptionRepository.findAll();
//     }

//     public Description getDescriptionId(int descriptionId) {
//         return descriptionRepository.findById(descriptionId).orElse(null);
//     }

// }
package com.example.description.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.description.model.Description;
import com.example.description.repository.DescriptionRepository;

@Service
public class DescriptionService {
    private final DescriptionRepository descriptionRepository;

    public DescriptionService(DescriptionRepository descriptionRepository) {
        this.descriptionRepository = descriptionRepository;
    }

    public Description createDescription(Description description) {
        return descriptionRepository.save(description);
    }

    public List<Description> getAllDescriptions() {
        return descriptionRepository.findAll();
    }

    public Description getDescriptionById(int descriptionId) {
        return descriptionRepository.findById(descriptionId).orElse(null);
    }
}
