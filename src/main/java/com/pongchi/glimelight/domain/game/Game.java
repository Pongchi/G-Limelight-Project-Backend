package com.pongchi.glimelight.domain.game;

import java.util.ArrayList;

import com.pongchi.glimelight.domain.post.Post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

@Getter
@Entity
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 255)
    private String bannerUrl;

    @OneToMany(mappedBy = "game")
    private ArrayList<Post> posts;
}