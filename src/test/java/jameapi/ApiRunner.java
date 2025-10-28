package jameapi;

import com.intuit.karate.junit5.Karate;

public class ApiRunner {

    @Karate.Test
    Karate testVideoGameApi() {
        // chạy tất cả feature trong thư mục jameapi (resources/jameapi)
        return Karate.run("classpath:jameapi/videogame.feature");
    }
}