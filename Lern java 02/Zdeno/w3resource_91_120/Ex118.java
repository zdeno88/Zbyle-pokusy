package w3resource_91_120;

public class Ex118 {
    public static void main(String[] args) {
        String s = "Python";
        String t = "Py";
//        String t = "yt";
//        String t = "Python";
//        String t = "ab";
        System.out.printf(String.valueOf(metoda(s, t)));
    }
        public static int metoda(String zdroj, String cil) {
            if (zdroj == null || cil == null)
                return -1;
            if ("".equals(cil) || zdroj.equals(cil))
                return 0;
            int i = 0;
            int last = zdroj.length() - cil.length() + 1;
            while (last > i) {
                if (zdroj.charAt(i) == cil.charAt(0)) {
                    boolean equal = true;
                    for (int j = 0; j < cil.length() && equal; ++j) {
                        if (zdroj.charAt(i + j) != cil.charAt(j)) {
                            equal = false;
                        }

                    }
                    if (equal) {
                        return i;
                    }

                }
                i++;

            }
            return -1;
        }


}

