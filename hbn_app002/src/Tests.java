import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Tests {
    public static void main(String[] args) {
//        String msg1 = "Hello";
//        String msg2 = "Hello";
//        String msg3 = new String("Hello");
//        System.out.println((msg1==msg2)+" sai");
//        System.out.println((msg1.equals(msg2))+" sai");
//        System.out.println((msg2==msg3)+" sai");
//        System.out.println((msg2.equals(msg3))+" sai");

//        String str = "stawberries";
//        System.out.println(str.substring(2,str.length()));

//        int array[] = {1, 2, 3, 4};
//        for (int i = 0; i < array.length; i++) {
//           System.out.print(array[i]);}


//        String str = " abcde ";
//        String s = str.trim();
//        System.out.println(s);
//        String s1 = s.toUpperCase();
//        System.out.println(s1);
//        String s2 =str.substring(3, 4);
//        System.out.println(s2);

//          System.out.println(print(-10));

//        List list = new ArrayList();
//        list.add("hello");
//        list.add(2);
//        System.out.print(list.get(0) instanceof Object);
//        System.out.print(list.get(1) instanceof Integer);


//        String val = "92650000000465456465444444444444444444444444444444444444444444444444466666666666666666666666666666666666666666666666666666666666666666666666666666666666660000000000000000000000000000000000000000000000000000000465463";
//        BigInteger f = new BigInteger(val);
//        System.out.println(f);

//        String message = "Hello world!";
//        String newMessage = message.substring(6, 12)+ message.substring(1, 5);
//        System.out.println(newMessage);

//        System.out.println("apple".compareTo("123")); //48
//        System.out.println("123".compareTo("apple")); //-48
//        System.out.println("apple".compareTo("apple")); //0


//        for (int i=0; i<10; i=i++){
//            i+=1;
//            System.out.print("Hello World! - ");
//            System.out.println(i);
//        }



//        List<Integer> lst = Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,8,8,8,8,9,9,9,9,10);
//        System.out.println(lst+" "+lst.size());
//        List<Integer> dList = lst.stream()
//                                .map(a->a+a)
//                                .distinct()
//                                .collect(Collectors.toList());
//
//        System.out.println(dList+" "+dList.size());


//        Stream.of(1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,8,8,8,8,9,9,9,9,10)
////                .mapToInt(Double::intValue)
//                .distinct()
////                .map(i ->  i)
//                .forEach(System.out::println);

//        List<Integer> lst = Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,8,8,8,8,9,9,9,9,10);

//        System.out.println(lst.stream().distinct().filter(a->a%2!=0).collect(Collectors.toList()));

//            Collection<String> collection = Arrays.asList("a", "b", "c");
//            Stream<String> streamOfCollection = collection.stream();
//            System.out.println(collection);
//            System.out.println(streamOfCollection.findFirst().orElse("0"));


//        String[] arr = new String[]{"a", "b", "c","d","e","f","g"};
//        Stream<String> streamOfArrayFull = Arrays.stream(arr);
//        Stream<String> streamOfArrayPart = Arrays.stream(arr, 2, 5);
//        System.out.println(streamOfArrayFull.count());
//        System.out.println(streamOfArrayPart.count());

//        Stream<String> streamBuilder =
//                Stream.<String>builder().add("a").add("b").add("c").build();
//        System.out.println(streamBuilder.count());

//        Stream<String> streamGenerated =
//                Stream.generate(() -> "element").limit(10);
//        System.out.println(streamGenerated.collect(Collectors.toList()));


//        Stream<Integer> streamIterate =
//                Stream.iterate(50, i -> i + 1).limit(50);
//        System.out.println(streamIterate.filter(i->i%2==0)
//                                        .collect(Collectors.toList()));
//
//        IntStream intStream = IntStream.range(1, 3);
//        LongStream longStream = LongStream.rangeClosed(1, 3);
//        System.out.println(intStream.filter(i->i==0).count());
//        System.out.println(longStream);

//        List<Integer> lst = Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,8,8,8,8,9,9,9,9,10);

//        System.out.println(Stream.generate(Math::random).limit(10).map(i->i*20).map(Math::round).collect(Collectors.toList()));
//        System.out.println(Stream.generate(()->(new Random()).nextInt(60)).limit(5).collect(Collectors.toList()));
//        Stream.generate(()->new Random().ints(50,100)).limit(5).peek(System.out::println).collect(Collectors.toList());

//        System.out.println(Stream.iterate(0,i->i+1).limit(10).collect(Collectors.toList()));

//        List<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(10))
//                .limit(10)
//                .collect(Collectors.toList());
//
//        System.out.println(randomNumbers);
//        Random random = new Random();

//        random.ints(10,40).limit(10).forEach(System.out::println);
//        List<Long> longs = random.longs( 5 ).boxed().collect( Collectors.toList() );
//        System.out.println(longs);


//        List<Long> intList =  Stream.generate(Math::random)
//                .map(i->i*(20-10))
//                .map(Math::round)
//                .limit(20)
//                .distinct()
////                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(intList);


//        List<String> sList = Stream.generate(()->"Data").limit(10).map(a->a+=" View").collect(Collectors.toList());
//        System.out.println(sList);

//        int numList = Stream.iterate(1,e->e+1)
//                            .limit(50)
////                            .peek(System.out::println)
//                            .map(i->i+1)
////                            .peek(System.out::println)
//                            .filter(i->i%2!=0)
////                            .peek(System.out::println)
//                            .reduce(0,(a,b)->a+b);
//        System.out.println(numList);

//        long startTime = System.currentTimeMillis();
//        StringBuffer strBuff = new StringBuffer("Sairam");
//        strBuff.append(" Bandaru");
//        System.out.println(strBuff);
//        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
//
//        long startTime1 = System.currentTimeMillis();
//        StringBuilder strBuild = new StringBuilder("Sairam");
//        System.out.println(strBuild);
//        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime1)+"ms");
//
//        long startTime2 = System.currentTimeMillis();
//        String str = new String("Sairam");
//        str.concat(" Bandaru");
//        System.out.println(str);
//        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime2)+"ms");

        List<Integer> lst = Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,8,8,8,8,9,9,9,9,10);

        List<Integer> dList = lst.stream().distinct().limit(5).map(i->i*i).collect(Collectors.toList());

        System.out.println(lst);
        System.out.println(dList);



    }

    static Exception print(int i){
        if (i>0) {
            return new Exception();
        } else {
             return  new RuntimeException();
             }
        }



}

class MainClass {
final String message(){
           return "Hello!";
        }
}
