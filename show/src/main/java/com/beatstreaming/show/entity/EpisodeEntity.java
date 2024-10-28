package com.beatstreaming.show.entity;

import lombok.Data;

@Data
public class EpisodeEntity extends IdItem {
    private final String name;
    private final String overview;
    private final String date;
    private final int number;
}
