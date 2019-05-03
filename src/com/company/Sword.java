package com.company;

public class Sword extends CharacterDecorator
{
    public Sword(Character tempCharacter)
    {
        super(tempCharacter);
    }

    public String getName()
    {
        return tempCharacter.getName() + " The Sword Handler";
    }
    public double getHealth()
    {
        return tempCharacter.getHealth() + 10;
    }
}