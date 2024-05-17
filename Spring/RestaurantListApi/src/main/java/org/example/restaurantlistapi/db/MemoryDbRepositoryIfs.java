package org.example.restaurantlistapi.db;

import java.util.List;
import java.util.Optional;

// 제네릭을 통한 타입 지정
public interface MemoryDbRepositoryIfs<T> {

    // 옵션에 따라 값을 출력
    Optional<T> findById(int index);

    // 저장 메소드
    T save(T entity);

    // 옵션에 따라 값을 삭제
    void deleteById(int index);

    // 전체 리턴
    List<T> findAll();

}
