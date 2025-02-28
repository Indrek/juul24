package ee.indrek.student;

import org.junit.jupiter.api.*;

public class ExampleTest {

    private int x = 0;

    @BeforeEach
    void setUp() {
        System.out.println("Jookseb enne igat testi");
        x = 5;
    }

    @AfterEach
    void tearDown() {
        System.out.println("Pärast igat testi");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Jooksutatakse kõige alguses");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Tuleb kõige lõpus");
    }

    @Test
    public void testMethod1() {
        System.out.println("Esimene test");
        x += 1;
        System.out.println(x);
    }
    @Test
    public void testMethod2() {
        System.out.println("Teine test");
        x += 10;
        System.out.println(x);
    }
}
