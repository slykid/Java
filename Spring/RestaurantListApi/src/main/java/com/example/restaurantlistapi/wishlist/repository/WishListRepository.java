package com.example.restaurantlistapi.wishlist.repository;

import com.example.restaurantlistapi.db.MemoryDbRepositoryAbstract;
import com.example.restaurantlistapi.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

}
