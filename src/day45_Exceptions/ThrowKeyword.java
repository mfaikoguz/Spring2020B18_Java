package day45_Exceptions;

public class ThrowKeyword {
    // THROW keyword:
//          we use it manually to throw the exception.
//          It CREATES an exception.
//          it DOES NOT HANDLE exception
//          We needed when we need to throw an exception manually
//          We create an object from an exception class but using new keyword and constructor of that class
//          easily used to throw UNCHECKED exceptions
//          you MUST have an object of the exception class to throw an exception manually
//          throw keyword can throw ONE EXCEPTION at a time :
//          because once an exception is thrown NOTHING is executed after
//          When you manually throw exception ==> you do not handle it ==> because the purpose was to CREATE it
// THROWS keyword:
//          we use it to HANDLE an exception temporarily
//          we use throws keyword in the method signature
//          if the method is called somewhere else ==> caller method needs to throw exception again in its signature
//          after throws keyword: order of exceptions is child to parent class ( if we wanted to use multiple classes)
//          if I use two exception classes, it is ok if the child class is not the class that handles exception,
//          ==> as long as parent class handles it
//          'throws' keyword MUST BE USED IN THE METHOD'S SIGNATURE not in the body
//          Disadvantage of throws key word ==> the CALLER of the method MUST handle exception by throwing exception
//          if we use the 'throws' keyword in the method's sig ==> it will handle MULTIPLE of EXCEPTIONS all at once
    public static void main(String[] args) {
        new ArithmeticException();
        throw new ArithmeticException();
    }
}
