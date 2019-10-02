package com.run;

import com.di_bean.domain.Product;
import com.di_bean.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class ApplicationRun {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ApplicationRun applicationRun = new ApplicationRun();
        applicationRun.execute();
    }

    private static void execute() {
        // Autowire를 하기 위해서는 getter와 setter가 필요한데, 실행 클래스에서는 생성할 수 없으니 다음과 같이 getBean을 통해 호출.
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = ctx.getBean(ProductService.class);

        productService.addProduct(inputProduct());

        Product product = productService.findByName(scanner.next());

        System.out.println(product);
    }

    private static Product inputProduct() {

        String name = scanner.next();
        int price = scanner.nextInt();
        return new Product(name, price);
    }
}
