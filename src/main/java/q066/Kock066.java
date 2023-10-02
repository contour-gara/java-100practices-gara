package q066;

import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public final class Kock066 {
    private Kock066() {
    }

    public static String convertToString(List<Model> modelList) {
        StringBuilder builder = new StringBuilder();

        if (isNull(modelList)) return builder.toString();

        for (Model model : modelList) {
            if (nonNull(model)) modelToString(model, builder);
            else builder.append("null\n---------\n");
        }

        return builder.toString();
    }

    private static void modelToString(Model model, StringBuilder builder) {
        builder.append(String.format("id: %s%n", model.getId()));
        builder.append(String.format("name: %s%n", model.getName()));

        if (nonNull(model.getType())) builder.append(String.format("type: %s%n", model.getType().getId()));
        else builder.append("type: null\n");

        builder.append(String.format("memo: %s%n", model.getMemo()));
        builder.append("---------\n");
    }
}
