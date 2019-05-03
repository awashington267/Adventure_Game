package com.company;

abstract class CharacterDecorator implements Character
{
    protected Character tempCharacter;
    public CharacterDecorator(Character tempCharacter)
    {
        this.tempCharacter = tempCharacter;
    }


    public String getName()
    {
        return tempCharacter.getName();
    }
    public double getHealth()
    {
        return tempCharacter.getHealth();
    }
}