import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Flipkart {
    public static void main(String[] args) {
        String url = "https://www.flipkart.com/";
        
        try {
            Document document = Jsoup.connect(url).get();
            Elements links = document.select("a[href]");

            // Using forEach loop
            System.out.println("1 Links using forEach loop:");
            links.forEach(link -> System.out.println(link.attr("href")));

            // Using Stream
            System.out.println("\n2 Links using Stream:");
            links.stream().map(link -> link.attr("href")).forEach(System.out::println);

            // Using Parallel Stream
            System.out.println("\n3 Links using Parallel Stream:");
            links.parallelStream().map(link -> link.attr("href")).forEach(System.out::println);

            // Using Lambda expression
            System.out.println("\n4 Links using Lambda expression:");
            links.forEach(link -> {
                String href = link.attr("href");
                System.out.println(href);
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
