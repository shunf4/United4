package us.dangeru.launcher.utils;

/**
 * Shortcuts for accessing PropertiesSingleton
 */

public final class P {
    private P() {
    }

    /**
     * @see PropertiesSingleton#getProperty(String)
     * @param prop the property to get
     * @return the value of that property
     */
    public static String get(String prop) {
        return PropertiesSingleton.get().getProperty(prop);
    }
    /**
     * @see PropertiesSingleton#setProperty(String, String)
     * @param prop the property to set
     * @param value the value to set it to
     */
    public static void set(String prop, String value) {
        PropertiesSingleton.get().setProperty(prop, value);
    }

    /**
     * Gets the property as a boolean value, defaulting to false
     * @param prop the property to read
     * @return the value of that property as a boolean
     */
    public static boolean getBool(String prop) {
        return "true".equalsIgnoreCase(get(prop));
    }

    /**
     * Toggles a boolean property
     * @param prop the property to toggle
     */
    public static void toggle(String prop) {
        //noinspection CallToNumericToString
        set(prop, Boolean.valueOf(!getBool(prop)).toString());
    }
}
