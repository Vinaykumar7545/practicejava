package javaPrograms;


public class AccessModifiers {
 
 public void publicMethod() {
     System.out.println("Public method can be accessed from anywhere.");
 }

 protected void protectedMethod() {
     System.out.println("Protected method can be accessed within the same package and by subclasses.");
 }

 void defaultMethod() {
     System.out.println("Default method can be accessed within the same package only.");
 }

 private void privateMethod() {
     System.out.println("Private method can be accessed within the same class only.");
 }

 public static void main(String[] args) {
     AccessModifiers example = new AccessModifiers();

     example.publicMethod();
     example.protectedMethod();
     example.defaultMethod();
     example.privateMethod();
 }
}
