package ru.itis.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.itis.models.Basket;
import ru.itis.models.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: можно и java-классом
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        User user = User.builder()
//                .firstName("Marina")
//                .lastName("Arh")
//                .patronymic("Mih")
//                .phoneNumber("356890")
//                .email("3556@mail.ru")
//                .password("1234")
//                .build();


        Basket basket = Basket.builder()
                .title("Работай!")
                .build();

        Product variant1 = Product.builder()
                .img("rtt")
                .title("Nice house")
                .countOfRooms(3)
                .price("12346")
                .category("apartment")
                .build();

        Product variant2 = Product.builder()
                .img("rttt")
                .title("Nice house[2]")
                .countOfRooms(2)
                .price("1254346")
                .category("apartment")
                .build();

        List<Product> products = new ArrayList<>();
        products.add(variant1);
        products.add(variant2);
        basket.setProducts(products);
        session.save(basket);

        basket.setTitle("Please");
        session.save(basket);

        transaction.commit();
        session.close();
    }
}
