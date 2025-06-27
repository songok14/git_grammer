package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;

public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        this.memberRepository = new MemberRepository();
    }

    // 회원가입
    public void resister(String name, String email, String pass) throws IllegalArgumentException, NoSuchElementException {
        // 객체를 조립 후 repository를 통해 register
        // 비밀번호가 너무 짧은 경우 예외 발생
        if (pass.length() < 5) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
        // DB에 email이 중복일 경우 예외 발생,
//        Member check = memberRepository.findByEmail(email1).get();
        if (memberRepository.findByEmail(email).isPresent()) {
            throw new NoSuchElementException("이미 사용중인 이메일입니다.");
        }
        Member member = new Member(name, email, pass);
        memberRepository.register(member);

    }

    // 회원상세조회
    public Member findById(Long id) throws NullPointerException, NoSuchElementException {
        // Optional 객체에 값이 없을경우 예외 발생, 있으면 Member를 꺼내서 return
        return memberRepository.findById(id).orElseThrow(() -> new NoSuchElementException("존재하지 않는 id입니다."));
    }

    // 회원목록조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    // 로그인
    public boolean login(String email, String pass) throws NullPointerException {
        Member member = memberRepository.findByEmail(email).get();
        if (member == null) {
            throw new NullPointerException();
        } else if (member.getEmail().equals(email)) {
            for (Member m : memberRepository.findAll()) {
                if (m.getEmail().equals(email)) {
                    if (!m.getPass().equals(pass)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkMember(String email) {
        for (Member m : memberRepository.findAll()) {
            if (m.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

}
