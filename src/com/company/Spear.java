package com.company;

public class Spear extends CharacterDecorator
{
    public Spear(Character tempCharacter)
    {
        super(tempCharacter);
    }
    public String getName()
    {
        String rString = tempCharacter.getName() + " The Spear Thrower";
        return rString;
    }
    public double getHealth() {
        return tempCharacter.getHealth() + 5;
    }
}