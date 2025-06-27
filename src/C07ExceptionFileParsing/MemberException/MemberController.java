package C07ExceptionFileParsing.MemberException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.NoSuchElementException;

// 사용자의 입출력을 받아 처리하는 계층
public class MemberController {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MemberService memberService = new MemberService();

        while (true) {
            System.out.print("1. 회원가입\t2.회원상세조회\t3.회원목록조회\t4.로그인: ");
            String input = br.readLine();
            if (input.equals("1")) {
                // 이름, 이메일, 패스워드 입력받아 service로 전달
                System.out.print("이름: ");
                String name = br.readLine();
                System.out.print("이메일: ");
                String email = br.readLine();
                System.out.print("비밀번호: ");
                String pass = br.readLine();

                try {
                    memberService.resister(name, email, pass);
                    // 예외발생 시 적절한 문구 사용자에게 출력
                } catch (IllegalArgumentException | NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }

            } else if (input.equals("2")) {
                // 회원정보 출력
                System.out.print("상세조회 할 회원의 ID: ");
                // 적절한 예외처리 필요. Optional
                try {
                    String stId = br.readLine();
                    Member member = memberService.findById(Long.parseLong(stId));
                    System.out.println(member.toString());
                } catch (NullPointerException | NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }

            } else if (input.equals("3")) {
                // 회원목록 출력
                List<Member> memberList = memberService.findAll();
                for (Member m : memberList) {
                    System.out.println(m.toString());
                    ;
                }
            } else if (input.equals("4")) {
                System.out.print("email: ");
                String email = br.readLine();
                System.out.print("passWord: ");
                String pass = br.readLine();

                try {
                    if (memberService.login(email, pass)){
                        System.out.println("로그인에 성공하였습니다.");
                    } else {
                        System.out.println("로그인에 실패하였습니다.");
                    }

                } catch (NullPointerException e){
                    e.getMessage();
                }

            } else {
                System.out.println("없는 서비스 번호입니다. 다시 입력해주세요.");
            }

        }


    }
}
