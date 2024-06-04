import java.util.*;

public class CountWordsInText {

    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam pretium mauris lorem, " +
            "sit amet eleifend purus rhoncus nec. Nulla a luctus libero, id tempor metus. Nullam semper, " +
            "erat nec ultricies pharetra, odio magna venenatis sem, at tempor dolor velit id nibh. Maecenas " +
            "tempor viverra metus, ut dapibus erat aliquam nec. Aliquam tristique ullamcorper dui eget pulvinar. " +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vestibulum gravida vestibulum. " +
            "Nam vestibulum purus tincidunt neque pretium, eu placerat turpis porttitor. Integer lobortis quam sit " +
            "amet est tincidunt egestas. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per " +
            "inceptos himenaeos. Proin sodales, odio eget consequat imperdiet, mauris nisl vestibulum ante, nec pretium " +
            "lacus turpis eget nisl. Sed elementum quam et ex semper placerat. Aliquam hendrerit ipsum sit amet lacus " +
            "laoreet consequat. Morbi ante metus, ornare eget felis quis, condimentum hendrerit ipsum. Sed ac sagittis " +
            "magna, quis volutpat ipsum.\n" +
            "\n" +
            "Suspendisse sed euismod velit, vestibulum volutpat ante. Fusce pharetra, nulla ut eleifend scelerisque," +
            " velit sem tempor tellus, at dictum quam metus ac lorem. Praesent diam purus, suscipit ut velit quis, aliquam" +
            " feugiat felis. Maecenas nec nisl massa. Donec tincidunt augue erat, sed rhoncus arcu aliquet a. Aenean mattis " +
            "sagittis tortor, non dapibus tortor tempus at. Nunc nec suscipit elit, pulvinar varius enim. Phasellus a massa " +
            "nec nisi faucibus feugiat. Nulla bibendum a velit et blandit. Donec eget dictum orci. Integer eu tristique nisi," +
            " sit amet eleifend nisi. Donec libero lacus, gravida gravida egestas eget, rhoncus vitae enim. Etiam rutrum blandit ullamcorper.\n" +
            "\n" +
            "Maecenas varius sapien purus, id ultricies sapien tristique vel. Sed tincidunt elit id lorem venenatis aliquet." +
            " Donec auctor efficitur mauris et molestie. Proin at orci lectus. Morbi varius ullamcorper felis non semper. Sed " +
            "tincidunt lorem ac libero ornare, vitae sagittis lectus iaculis. Suspendisse sed mi sit amet risus aliquam interdum " +
            "sed nec mauris. Mauris purus tortor, convallis sed interdum in, vehicula at lacus. Ut pellentesque pretium" +
            " risus, vitae congue nulla aliquam ac.\n" +
            "\n" +
            "Fusce pellentesque pretium eros, non volutpat enim vulputate eget. Vivamus id turpis erat. Sed tellus ante," +
            " dignissim non dui eget, finibus elementum dui. Aenean lacinia lectus eros, eu auctor tortor dignissim sit amet." +
            " Donec pharetra posuere mi sit amet laoreet. Donec posuere, nulla porttitor faucibus venenatis, purus leo aliquam massa, " +
            "faucibus lobortis nisl ante nec diam. Curabitur varius diam sed semper pulvinar. Nulla facilisi. Mauris pharetra" +
            " nec lectus id aliquet. Ut placerat commodo massa vel accumsan. Quisque et tellus dignissim, placerat elit non," +
            "" +
            " lacinia libero. Morbi nunc sem, vestibulum ut velit id, posuere rutrum justo.\n" +
            "Maecenas tincidunt turpis porttitor, egestas dui nec, blandit lorem. Sed mollis, sem rutrum posuere pretium" +
            ", orci nisi fringilla orci, a lobortis tortor purus ac sem. Morbi aliquam varius nisl. Sed porttitor feugiat odio," +
            " posuere molestie nibh venenatis eget. Nunc accumsan ultrices pulvinar. Suspendisse gravida leo sit amet velit " +
            "ullamcorper, eget varius dui eleifend. Vivamus vitae fermentum lacus. Morbi felis lectus, viverra in cursus " +
            "id, elementum eu ex. Quisque odio ipsum, volutpat placerat ligula id, porta varius turpis. Sed eu leo id nulla " +
            "mattis egestas. Etiam nec libero nec sem convallis pharetra. Fusce id odio nec neque dapibus tincidunt efficitur " +
            "in tortor.";


    public HashMap<String, Integer> countWords(String text) {

        if (text != null) {
            HashMap<String, Integer> wordsMap = new HashMap<>();

            text = text.replace(",", "").replace(".", "");
            text = text.toLowerCase(Locale.ROOT);
            String[] split = text.split("\\s+");
            for (String s : split) {

                if (wordsMap.containsKey(s)) {
                    int count = wordsMap.get(s);
                    wordsMap.replace(s, count + 1);
                } else {
                    wordsMap.put(s, 1);
                }
            }
            return wordsMap;
        }else {
            return new HashMap<>();
        }
    }


}
