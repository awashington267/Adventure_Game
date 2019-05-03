package com.company;

public class Shield extends CharacterDecorator
{

    public Shield(Character tempCharacter) { super(tempCharacter); }


    public String getName()
    {
        String rString = tempCharacter.getName() + " The Shield Bearer";
        return rString;
    }
}
