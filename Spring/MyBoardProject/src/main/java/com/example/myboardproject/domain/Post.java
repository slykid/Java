/**
 * packageName  : com.example.myboardproject.domain
 * fileName     : Post
 * author       : slykid
 * date         : 25. 2. 25.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 25.          slykid         최초작성
 */
package com.example.myboardproject.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class Post {

    private Long contentId;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String writerId;

    @Getter
    @Setter
    private String content;


    @Getter
    @Setter
    private LocalDateTime createAt;

}
