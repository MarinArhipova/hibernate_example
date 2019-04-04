package ru.itis.models;

import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"products"})
public class Basket {
    private Long id;

    private User user;

    private List<Product> products;
}
