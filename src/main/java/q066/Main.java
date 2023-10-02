package q066;

import java.util.ArrayList;
import java.util.List;

import static q066.Kock066.convertToString;

public class Main {
    public static void main(String[] args) {
        List<Model> modelList = List.of(
                new Model(1, "gara", new Type(1), "a"),
                new Model(1, "gara", new Type(1), "a")
        );

//        List<Model> modelList = null;

//        List<Model> modelList = new ArrayList<>();
//        modelList.add(null);
//        modelList.add(new Model(1, "gara", new Type(1), "a"));


//        List<Model> modelList = List.of(
//                new Model(1, "gara", null, "a"),
//                new Model(1, "gara", new Type(1), "a")
//        );


        System.out.println(convertToString(modelList));
    }
}
