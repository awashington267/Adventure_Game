package com.company;

public class Starving extends CharacterDecorator
{
    public Starving(Character tempCharacter) { super(tempCharacter); }


    public double getHealth()
    {
        return tempCharacter.getHealth() - 5;
    }
}
