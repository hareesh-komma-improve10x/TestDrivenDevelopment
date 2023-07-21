package nameinverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameInverter {
    public String invertName(String name) {
        if (name.equals("")) {
            return "";
        } else if (isSingleWord(name)) {
            return name.trim();
        } else {
            return formatMultiElementName(name);
        }
    }

    private static boolean isSingleWord(String name) {
        return !name.trim().contains(" ");
    }

    private static String formatMultiElementName(String name) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
        removeHonorifics(names);
        String postNomial = getPostNomial(names.subList(2, names.size()));
        return (names.get(1) + ", " + names.get(0) + " " + postNomial).trim();
    }

    private static String getPostNomial(List<String> postNomialsList) {
        String postNomial = "";
        for (int i = 0; i < postNomialsList.size(); i++) {
            postNomial += postNomialsList.get(i) + " ";
        }
        return postNomial;
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (hasHonorifice(names) && names.size() > 2) {
            names.remove(0);
        }
    }

    private static boolean hasHonorifice(ArrayList<String> names) {
        return names.get(0).matches("Mrs.|Mr.|Miss.");
    }
}
