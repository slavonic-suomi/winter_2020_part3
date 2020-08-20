package by.gsu.winter20.spring_boot_demo.context;

import org.testcontainers.containers.MySQLContainer;

public class TestMysqlContainer extends MySQLContainer<TestMysqlContainer> {

    private static final String IMAGE_VERSION = "mysql:5.7";
    private static volatile TestMysqlContainer container;

    public TestMysqlContainer() {
        super(IMAGE_VERSION);
    }

    public static TestMysqlContainer getInstance() {
        if (container == null) {
            container = new TestMysqlContainer();
        }
        return container;
    }
}
