package ru.itis.models;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"products"})
public class Basket {
    private Long id;
    private String title;

    private User user;
    private List<Product> products;
}
