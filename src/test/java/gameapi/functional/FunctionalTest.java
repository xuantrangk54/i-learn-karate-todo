
package gameapi.functional;
import com.intuit.karate.junit5.Karate;

class FunctionalTest {
    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:gameapi/functional").relativeTo(getClass());
    }
}
