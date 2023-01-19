class MethodTest4 {

    public static void main(String[] var0) {
        System.out.println(add(10));
    }

    public static int add(int var0) {
        int var1 = 0;

        for(int var2 = 1; var2 <= var0; ++var2) {
            var1 += var2;
        }

        return var1;
    }
}

class MethodTest5 {

    public static void main(String[] var0) {
        System.out.println(add(3, 6));
    }

    public static int add(int var0, int var1) {
        int var2 = 0;

        for(int var3 = var0; var3 <= var1; ++var3) {
            var2 += var3;
        }

        return var2;
    }
}

class MethodTest6 {

    public static void main(String[] var0) {
        System.out.println(multiply(5));
    }

    public static int multiply(int var0) {
        int var1 = 1;

        for(int var2 = 1; var2 <= var0; ++var2) {
            var1 *= var2;
        }

        return var1;
    }
}

class MethodTest7 {

    public static void main(String[] var0) {
        System.out.println(prime(7));
        System.out.println(prime(-1));
    }

    public static boolean prime(int var0) {
        boolean var1 = true;
        if (var0 > 1) {
            for(int var2 = 2; var2 < var0; ++var2) {
                if (var0 % var2 == 0) {
                    var1 = false;
                    break;
                }
            }
        } else {
            var1 = false;
        }

        return var1;
    }
}

class MethodTest8 {

    public static void main(String[] var0) {
        for(int var1 = 2; var1 <= 100; ++var1) {
            if (prime(var1)) {
                System.out.print("" + var1 + "\t");
            }
        }

        System.out.println();
        System.out.println(isPrimeNumber(5));
        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(6));
        System.out.println(isPrimeNumber(-4));
        System.out.println();
        System.out.println(isPrime(5));
        System.out.println(isPrime(2));
        System.out.println(isPrime(6));
        System.out.println(isPrime(-4));
    }

    public static boolean prime(int var0) {
        boolean var1 = true;

        for(int var2 = 2; var2 < var0; ++var2) {
            if (var0 % var2 == 0) {
                var1 = false;
                break;
            }
        }

        return var1;
    }

    public static boolean isPrimeNumber(int var0) {
        if (var0 <= 1) {
            return false;
        } else {
            for(int var1 = 2; var1 < var0; ++var1) {
                if (var0 % var1 == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static boolean isPrime(int var0) {
        if (var0 > 1) {
            for(int var1 = 2; var1 < var0; ++var1) {
                if (var0 % var1 == 0) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}