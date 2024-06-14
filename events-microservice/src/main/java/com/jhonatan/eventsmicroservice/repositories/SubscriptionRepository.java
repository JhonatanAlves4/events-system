package com.jhonatan.eventsmicroservice.repositories;

import com.jhonatan.eventsmicroservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}
