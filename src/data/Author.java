package data;

import java.util.Date;
import java.util.UUID;

public class Author {
    private final UUID id = UUID.randomUUID();
    private final String name;
    private final Date birthDate;

    public Author(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }
}
