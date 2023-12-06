package unit10.shop;

import java.util.HashMap;
import java.util.Map;

/*
Паспортна (КМУ 2010) - офіційна транслітерація, затверджена Кабінетом Міністрів України 27 січня 2010 р.
https://slovnyk.ua/translit.php
 */

public class Main {

            public static String translitRuEn(String str) {
                Map<String, String> map = new HashMap<>();
                map.put("зг","zgh");
                map.put("а", "a");
                map.put("б", "b");
                map.put("в", "v");
                map.put("г", "h");
                map.put("ґ", "g");
                map.put("д", "d");
                map.put("е", "e");
                map.put("є", "ie");
                map.put("ж", "zh");
                map.put("з", "z");
                map.put("и", "y");
                map.put("i", "i");
                map.put("ї", "i");
                map.put("й", "i");
                map.put("к", "k");
                map.put("л", "l");
                map.put("м", "m");
                map.put("н", "n");
                map.put("о", "o");
                map.put("п", "p");
                map.put("р", "r");
                map.put("с", "s");
                map.put("т", "t");
                map.put("у", "u'");
                map.put("ф", "f");
                map.put("х", "kh");
                map.put("ц", "ts");
                map.put("ч", "ch");
                map.put("ш", "sh");
                map.put("щ", "shch");
                map.put("ь", "");
                map.put("ю", "iu");
                map.put("я", "ia");
                map.put("'", "");
                map.put("Зг","Zgh");
                map.put("А", "A");
                map.put("Б", "B");
                map.put("В", "V");
                map.put("Г", "H");
                map.put("Ґ", "Gh");
                map.put("Д", "D");
                map.put("Е", "E");
                map.put("Є", "Ye");
                map.put("Ж", "Zh");
                map.put("З", "Z");
                map.put("И", "Y");
                map.put("І", "I");
                map.put("Ї", "Yi");
                map.put("Й", "Y");
                map.put("К", "K");
                map.put("Л", "L");
                map.put("М", "M");
                map.put("Н", "N");
                map.put("О", "O");
                map.put("П", "O");
                map.put("Р", "R");
                map.put("С", "S'");
                map.put("Т", "T");
                map.put("У", "U'");
                map.put("Ф", "F");
                map.put("Х", "Kh");
                map.put("Ц", "Ts");
                map.put("Ч", "Ch");
                map.put("Ш", "Sh");
                map.put("Щ", "Shch");
                map.put("Ь", "");
                map.put("Ю", "Yu");
                map.put("Я", "Ya");

                StringBuilder result = new StringBuilder();
                for (char c : str.toCharArray()) {
                    String lit = String.valueOf(c);
                    result.append(map.getOrDefault(lit, lit));
                }

                return result.toString();
            }

            public static void main(String[] args) {
                String input = "Коцюба Олексій";
                String transliterationResult = translitRuEn(input);
                System.out.println(transliterationResult);
            }

    }

