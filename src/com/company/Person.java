package com.company;

public class Person {
    // declare fields
    private boolean man;
    private String name;
    private Person spouse;


    // Create constructor
    public Person(String name, boolean man){
        this.name = name;
        this.man = man;
    }

    //function marry
    public void marry(Person person){
        if(person.man != this.man){
           if (this.spouse != null){
              this.divorce();
           }
           if (person.spouse != null){
                person.divorce();
            }
           if(this.spouse == null && person.spouse == null){
                this.spouse = person;
                person.spouse = this;
            }
        }

    }
    // fuction divorce
    public boolean divorce() {
        if(spouse != null)
            {
                this.spouse.spouse = null;
                this.spouse = null;
                return true;
            }
        return false;
    }

}

















