package C07ExceptionFileParsing.MemberException;

public class Member {
    static private Long staticId = 0L;
    private Long id;
    private String name;
    private String email;
    private String pass;

    public Member(String name, String email, String pass) {
        id = staticId;
        this.name = name;
        this.email = email;
        this.pass = pass;
        staticId++;
    }

    public static Long getStaticId() {
        return staticId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Member{" + "id: " + id + ", name: " + name + ", email: " + email + '}';
    }
}
