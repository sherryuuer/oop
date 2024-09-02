package enums.src;

public enum Size {
    SMALL, MEDIUM, LARGE
}

// Size针对Enum的具体实现
// public final class Size extends Enum<Size>{
// public static final Size SMALL = new Size("SMALL", 0);
// public static final Size MEDIUM = new Size("MEDIUM", 1);
// public static final Size LARGE = new Size("LARGE", 2);
// private static Size[] VALUES = new Size[]{SMALL, MEDIUM, LARGE};
// private Size(String name, int ordinal){
// super(name, ordinal);
// }
// public static Size[] values(){
// Size[] values = new Size[VALUES.length];
// System.arraycopy(VALUES, 0, values, 0, VALUES.length);
// return values;
// }
// public static Size valueOf(String name){
// return Enum.valueOf(Size.class, name);
// }

// }
