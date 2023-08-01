package com.malva.tech.inheritence.example;

//Super Key Word
class Animal{ 
	
 String colour ="white";	
void eat(){
	System.out.println("eating...");
	
}  
}  


class Dog extends Animal{  
String colour ="balak";
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
eat();  
bark();
System.out.println(super.colour);
} 

} 

class TestSuper2{  
public static void main(String args[]){  
Dog d=new Dog();  
d.work();  
}}  
