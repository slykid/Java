package com.example.restaurantlistapi.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SearchImageRes {
    private String lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<SearchLocalItem> items;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class SearchLocalItem {
        private String title;
        private String link;
        private String thumbnail;
        private String sizeHeight;
        private String sizeWidth;
    }

}
