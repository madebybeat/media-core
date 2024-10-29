package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AppSourceEntity extends ItemEntity {
    private String url;
    private String description;
    private String name;
    private String website;
    private AppSourceAuthorEntity author;
}
