package nameinverter;

public class NameInverter {
    public String invertName(String name) {
        if (name.equals("")) {
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        } else {
            String[] names = name.trim().split("\\s+");
            return names[1] + ", " + names[0];
        }
    }
}
