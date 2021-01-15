package at.htl.demo.entity;

import com.intuit.karate.junit5.Karate;
import io.quarkus.test.junit.QuarkusTest;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class PersonTest {
    
    @Karate.Test
    Karate testPersonCreation() {
        return Karate.run("person-creation").relativeTo(getClass());
    }

}
