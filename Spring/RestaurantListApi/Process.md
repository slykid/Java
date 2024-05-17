---
* 작성자: 김 길 현
* 작성일시: 2024.05.06
---

# 1. 생성과정

## 1.1 메모리 DB 생성

* db 패키지 이하에 생성

* MemoryDbRepositoryIfs: 메모리 DB 레포지토리 생성을 위한 4개 메소드 설정 / Generic 으로 구현
    * findById: 옵션 값에 따라 메모리 DB 에 저장된 객체 1개를 출력하는 메소드
    * save: 결과 객체를 메모리 DB 에 저장하는 메소드
    * deleteById: 옵션 값에 따라 메모리 DB 에 저당된 객체 1개를 삭제하는 메소드
    * listAll: 메모리 DB에 저장된 모든 객체를 출력하는 메소드

* MemoryDbEntity: 메모리 DB에 저장된 객체의 최상위 객체 클래스 / 세부 내용은 클래스마다 다를 수 있기 때문에 인덱스만 추가함
    * index: 저장 객체 순번

* MemoryDbRepositoryAbstract: 메모리 DB에 저장 시 사용되는 메소드 구현
    * MemoryDbRepositoryIfs 인터페이스에서 선언한 4개의 메소드들에 대한 구현 클래스
    * 메모리 DB에서 ArrayList 형식으로 데이터를 받음

## 1.2 맛집 저장용 클래스 생성

* wishlist 패키지 이하에 생성

* WishListEntity: 맛집 저장용 클래스 정의
    * title         : 음식명, 장소명
    * category      : 카테고리
    * address       : 주소
    * roadAddress   : 도로명 주소
    * homePageLink  : 홈페이지 주소
    * imageLink     : 음식, 가게 이미지 주소
    * isVisit       : 방문 여부
    * visitCount;   : 방문 카운트
    * lastVisitDate : 마지막 방문일자

* WishListRepository: MemoryDbRepositoryAbstract 추상클래스를 상속받아 구현하는 클래스

## 1.3 Naver API REST 방식으로 구현하기

* naver 패키지 이하에 생성

* 



