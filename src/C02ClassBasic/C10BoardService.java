package C02ClassBasic;

//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//        4.게시글 작성 : 제목, 내용, 작성자Email(Author 객체 가능)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email(작성자 이름)
//        7.서비스 종료

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class C10BoardService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();
        while (true) {
            StringBuffer sb = new StringBuffer();

            System.out.print("서비스 번호를 입력하세요. 1.회원가입 2.회원목록조회 3.회원상세목록조회 4.게시글 작성 5.게시글목록조회 6.게시글상세조회 7.서비스종료");
            String input = br.readLine();

            if (input.equals("1")) {

                System.out.print("이름: ");
                String name = br.readLine();
                System.out.print("이메일: ");
                String email = br.readLine();
                System.out.print("비밀번호: ");

                String password = br.readLine();
                authorList.add(new Author(name, email, password));

            } else if (input.equals("2")) {
                for (Author a : authorList) {
                    sb.append(a.toString()).append("\n");
                }
                bw.write(sb.toString());
                bw.flush();

            } else if (input.equals("3")) {
                for (Author a : authorList) {
                    sb.append(a.toStringDetail()).append("\n");
                }
                bw.write(sb.toString());
                bw.flush();

            } else if (input.equals("4")) {
                System.out.print("사용자ID: ");
                int id = Integer.parseInt(br.readLine());
//                Author author = null;

                // id 값으로 author 찾기
                for (Author a : authorList) {
                    if (a.getId() == id) {
                        Author author = a;
                        System.out.print("제목: ");
                        String title = br.readLine();
                        System.out.print("내용: ");
                        String contents = br.readLine();

                        Post post = new Post(title, contents, author);
                        postList.add(post);
                        author.setPostList(post);
                        break;
                    }
                }


            } else if (input.equals("5")) {
                // 사용자 id로 조회
                System.out.print("사용자ID: ");
                int id = Integer.parseInt(br.readLine());
                Author author = null;

                for (Author a : authorList) {
                    if (a.getId() == id) {
                        author = a;
                    }
                }

                if (author != null) {
                    for (Post p : postList) {
                        if (p.getAuthor().getId() == id) {
                            sb.append("postId: ").append(p.getId()).append("\t제목: ").append(p.getTitle()).append("\n");
                        }
                    }
                }
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();

            } else if (input.equals("6")) {
                System.out.print("사용자ID: ");
                int id = Integer.parseInt(br.readLine());
                Author author = null;

                for (Author a : authorList) {
                    if (a.getId() == id) {
                        author = a;
                    }
                }

                if (author != null) {
                    for (Post p : postList) {
                        if (p.getAuthor() == author) {
                            sb.append("postId: ").append(p.getId()).append("\t제목: ").append(p.getTitle())
                                    .append("\tcontents: ").append(p.getContents()).append("\t작성자: ").append(author.getName()).append("\n");
                        }
                    }
                }
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();

            } else if (input.equals("7")) {
                System.out.println("\n서비스를 종료합니다.");
                break;
            } else {
                System.out.println("다시 입력해 주세요.");
            }

        }

    }
}

// 일반적으로 클래스를 정의할 때 원시자료형은 wrapper 클래스로 정의

class Author {
    private String name;
    private String email;
    private String password;
    private int id;
    private static int auto_increment;
    private List<Post> postList;
    // author 객체에 postList를 선언함으로서 편의성 향상

    public Author(String name, String email, String password) {
        id = auto_increment++;
        this.name = name;
        this.email = email;
        this.password = password;
        // 객체 안에 객체를 선언함으로서 author 객체에서 쉽게 post 객체에 접근 가능
        List<Post> postList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(Post post) {
        if(this.postList == null){
            this.postList = new ArrayList<>();
            this.postList.add(post);
        } else {
            this.postList.add(post);
        }
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\tEmail: " + this.email;
    }

    public String toStringDetail() {
        if (this.postList == null) {
            return "ID: " + this.id + "\tEmail: " + this.email + "\tname: " + this.name + "\tpassword: " + this.password + "\t작성글수: 0";
        } else {
            return "ID: " + this.id + "\tEmail: " + this.email + "\tname: " + this.name + "\tpassword: " + this.password + "\t작성글수: " + this.postList.size();
        }
    }
}

class Post {
    private int id;
    private static int auto_increment;
    private String title;
    private String contents;
    private Author author;

    public Post(String title, String contents, Author author) {
        id = auto_increment++;
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }
}
