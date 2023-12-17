import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class APITester {
   public static void main(String[] args) {		
      boolean isNestMate = APITester.class.isNestmateOf(APITester.Inner.class);
      boolean nestHost = APITester.Inner.class.getNestHost() == APITester.class;

      System.out.println(isNestMate);
      System.out.println(nestHost);

      Set<String> nestedMembers = Arrays.stream(APITester.Inner.class.getNestMembers())
         .map(Class::getName)
         .collect(Collectors.toSet());
      System.out.println(nestedMembers);
   }
   public class Inner{}
}
Output
true
true
[APITester$Inner, APITester]