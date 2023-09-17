package com.torin.torian.data.repositories;

import com.torin.torian.data.models.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items,Long> {
}
