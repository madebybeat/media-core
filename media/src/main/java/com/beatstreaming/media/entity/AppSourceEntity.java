package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AppSourceEntity extends ItemEntity {
    public String url;
    protected String description;
    protected String name;
    protected String website;
    protected AppSourceAuthorEntity author;
}
