package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소 역할을 하는 계츨
// DB서버가 있다면 저장소에 접근 및 상호작용하는 계층(CRUD)
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();

    // 회원가입
    public void register(Member member) {
        memberList.add(member);
    }

    // 회원상세조회
    public Optional<Member> findById(Long id) {
        return memberList.stream().filter(a -> a.getId() == id).findFirst();
    }

    // 회원목록조회
    public List<Member> findAll() {
        return memberList;
    }

    public Optional<Member> findByEmail(String email) {
        return memberList.stream().filter(a -> a.getEmail().equals(email)).findFirst();
    }
}
