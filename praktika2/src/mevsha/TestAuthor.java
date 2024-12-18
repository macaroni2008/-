package mevsha;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Spartak", "spartsmirnik@mail.ru", 'M');
        System.out.println(a1);
        a1.setEmail("spartsmirnik1@yandex.ru");
        System.out.println(a1);
    }
}
