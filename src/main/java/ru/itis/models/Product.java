package ru.itis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private Long id;

    private String img;
    private String title;
    private Integer countOfRooms;
    private String price;
    private String category;

    List<Basket> baskets;
}
