package app;

import com.intuit.karate.http.HttpServer;
import com.intuit.karate.http.ServerConfig;
import com.intuit.karate.junit5.Karate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class StartTestServer {

    private static final Logger logger = LoggerFactory.getLogger(StartTestServer.class);
    private static HttpServer server;

    @BeforeAll
    static void beforeAll() throws InterruptedException {
        if (server == null) {
            ServerConfig config = App.serverConfig("src/main/java/app").devMode(true);
            server = HttpServer.config(config).http(8080).build();
            
        }
    }

    // Chạy feature sau khi server đã dựng
    @Karate.Test
    Karate runFeature() {
        logger.warn("Server started at http://localhost:8080 ...");
        server.waitSync();
        return Karate.run("classpath:app/api/simple/simple.feature");
    }

    @AfterAll
    static void stopServer() {
        if (server != null) {
            server.stop();
            logger.warn("Server stopped.");
        }
    }
}
