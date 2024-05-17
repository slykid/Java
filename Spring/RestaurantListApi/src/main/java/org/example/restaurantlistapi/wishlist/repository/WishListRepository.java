package org.example.restaurantlistapi.wishlist.repository;

import org.example.restaurantlistapi.db.MemoryDbRepositoryAbstract;
import org.example.restaurantlistapi.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
