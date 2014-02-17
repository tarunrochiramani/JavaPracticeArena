/**
 * This Class is to show access modifiers on Class and methods
 */
public final class AccessModifiers {
    String defaultAccess;
    private String privateAccess;
    final int x= 10;



    final String anyString = new String("blah");

    //anyString = new String("blhaaah2"); cannot do this

    public String getDefaultAccess() {
        return defaultAccess;
    }

    public void setDefaultAccess(String defaultAccess) {
        this.defaultAccess = defaultAccess;
    }

    public String getPrivateAccess() {
        return privateAccess;
    }

    public void setPrivateAccess(String privateAccess) {
        this.privateAccess = privateAccess;
    }

    void defaultAccessMethod() {}
    public void publicAccessMethod() {}
    private void privateAccessMethod() {}
    protected void protectedAccessMethod() {}

    public static void main (String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();

//        accessModifiers.x = 15; Cannot do

        accessModifiers.anyString.concat("blahh2"); //Can modify the state of object.
//        accessModifiers.anyString = new String("blahhhhhhh"); cannot do
    }
}


class DefaultAccessClass {}

final class FinalClass {

}

// Not Allowed examples
//protected class ProtectedAccessClass {
//}
//
//private class PrivateAccessClass {
//}