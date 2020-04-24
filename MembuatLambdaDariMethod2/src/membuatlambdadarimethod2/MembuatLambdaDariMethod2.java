package membuatlambdadarimethod2;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MembuatLambdaDariMethod2 {
    
    public static void main(String[] args) {
        
        
//        Predicate <String> predicate2 = (value) -> MembuatLambdaDariMethod2.isNotNull(value);
        // kita masih bisa menyingkatnya lagi, tapi dengan syarat parameter nya harus sama dan harus manggil method yg lain
        Predicate<String> predicate2 = MembuatLambdaDariMethod2::isNotNull;
        
        
        // case 1
//        Predicate<String> predicate = new Predicate<String>(){
//            
//            @Override
//            public boolean test(String s){
//                return s.isEmpty();
//            }
//        };

        
        // solve 1
            Predicate<String> predicate = (value) -> value.isEmpty();
            // persingkat
            Predicate<String> predicate5 = String::isEmpty; // String, itu parameter nya
            
            
        // casa 2
//        BiPredicate<String, String> predicate2 = new BiPredicate<String,String>(){
//            @Override
//            public boolean test(String s, String s2){
//                return MembuatLambdaDariMethod2.isEquals();
//            }
//        };


        // solve 2
                BiPredicate<String, String> predicate3 = (value1, value2) -> MembuatLambdaDariMethod2.isEquals(value1, value2);

        // persingkat
                 BiPredicate<String, String> predicate6 = MembuatLambdaDariMethod2::isEquals;
        
                
        // case 3
//        String hello = "Hello";
//        Function<String, String> function = new Function<String,String>() {
//            @Override
//            public String apply(String s){
//                return hello.concat((S)) ;
//            }
//        };


        // solve 3
        String hello = "Hello";
        Function<String, String> function = (value) -> hello.concat(value);
        // persingkat 
        Function<String, String> function2 = hello::concat;
        
        
        // case 4
//        Consumer<String> consumer = new Consumer<String>(){
//            @Override
//            public void accept(String s){
//                System.out.println(s);
//            }
//        };

        // solve 4
          Consumer<String> consumer = (value) -> System.out.println(value);
          // persingkat
          Consumer<String> consumer2 = System.out::println;
    }
    
    
    public static boolean isNotNull(String value){
        return value != null;
    }
    
    public static boolean isEquals(String value1, String value2){
        return value1.equals(value2);
    }
}
