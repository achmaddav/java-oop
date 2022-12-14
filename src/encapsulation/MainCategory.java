package encapsulation;

public class MainCategory {

    public static void main(String[] args) {
        Category category = new Category();
        category.setId(1);
        category.setName("Makanan");
        category.setDesc("Makanan Kesehatan");
        System.out.println(category);

        System.out.println(new Category(2,"Borax","Racun"));
        System.out.println(new Category(3,"Burger","Junk Food"));
    }
}
