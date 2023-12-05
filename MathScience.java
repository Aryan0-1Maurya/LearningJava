class TanValue {  
    public static void main(String a[])   {    
        System.out.println("Value of tan(0) is: " + Math.tan(0));    
        System.out.println("Value of tan(45) is: " + Math.tan(45));    
        System.out.println("Value of tan(90) is: " + Math.tan(90));  
    }
}
class SineValue {  
    public static void main(String a[])   {    
        System.out.println("Value of sin(90) is: " + Math.sin(0));    
        System.out.println("Value of sin(45) is: " + Math.sin(45));    
        System.out.println("Value of sin(30) is: " + Math.sin(90));  
    }
}
class CosValue {  
    public static void main(String a[])   {    
        System.out.println("Value of cos(0) is: " + Math.cos(0));    
        System.out.println("Value of cos(45) is: " + Math.cos(45));    
        System.out.println("Value of cos(90) is: " + Math.cos(90));  
    }
}
class RadTodeg {  
    public static void main(String a[])   {    
        System.out.println("Radiance 4.0 in degrees: " + Math.toDegrees(4.0));    
        System.out.println("Radiance 6.0 in degrees: " + Math.toDegrees(6.0));  
    }
}
class LogValue {  
    public static void main(String a[])   {    
        System.out.println("Natural logarithm value of 50 is: " + Math.log(50));  
    }
}
class MathPower {  
    public static void main(String a[])   {    
        System.out.println("5 to the power of 3 is: " + Math.pow(5, 3));    
        System.out.println("6.4 to the power of 6 is: " + Math.pow(6.4, 6));    
        System.out.println("7.3 to the power of 1.2 is: " + Math.pow(7.3, 1.2));  
    }
}
class SigNumValue {  
    public static void main(String a[])   {    
        System.out.println("Signum value of 30.2 is: " + Math.signum(30.2));    
        System.out.println("Signum value of 0 is: " + Math.signum(0));    
        System.out.println("Signum value of -28.63 is: " + Math.signum(-28.63));  
    }
}
class NextUpValue {  
    public static void main(String a[])   {    
        System.out.println("Next up value for 48.5 is: " + Math.nextUp(48.5));  
    }
}
class NextAfterValue {  
    public static void main(String a[])   {    
        System.out.println("Next after value of 10 in the direction of 7: "                   + Math.nextAfter(9, 6));    
        System.out.println("Next after value of 10 in the direction of 12: "                   + Math.nextAfter(13, 18));  
    }
}
class MyCopySign {  
    public static void main(String a[])   {    
        System.out.println("After copying sign from -10, the value is: "                   + Math.copySign(46.8, -90));    
        System.out.println("After copying sign from -3, the value is: "                   + Math.copySign(-23.1, 45));  
    }
}
class HypotenuseValue {  
    public static void main(String[] args)   {    
        int side1 = 50;    
        int side2 = 30;    
        System.out.println("The length of hypotenuse is: " + Math.hypot(side1, side2));  
    }
}
class ExponentialValue {  
    public static void main(String a[])   {    
        System.out.println("Exponential value of 1: " + Math.exp(1));    
        System.out.println("Exponential value of 3: " + Math.exp(3));    
        System.out.println("Exponential value of 9: " + Math.exp(9));  
    }
}
class CubeRoot {  
    public static void main(String a[])   {    
        System.out.println("Cube root of 10: " + Math.cbrt(27));    
        System.out.println("Cube root of 625: " + Math.cbrt(125));    
        System.out.println("Cube root of 1090: " + Math.cbrt(1000));  
    }
}
class CeilValue {  
    public static void main(String[] args)   {    
        System.out.println("Ceiling value of 55: " + Math.ceil(55));    
        System.out.println("Ceiling value of -67.8: " + Math.ceil(-67.8));    
        System.out.println("Ceiling value of 29.5: " + Math.ceil(29.5));  
    }
}
class LogBase10Value {  
    public static void main(String a[])   {    
        System.out.println("Base 10 logarithm value of 15 is: " + Math.log10(25));  
    }
}
class AbsValue {  
    public static void main(String[] args)   {    
        double a = -33.65;    
        int b = 185;    
        System.out.println("Absolute value of a: " + Math.abs(a));    
        System.out.println("Absolute value of b: " + Math.abs(b));  
    }
}