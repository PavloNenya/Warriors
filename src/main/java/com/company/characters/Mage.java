package com.company.characters;

public class Mage extends Warrior{
    private int health = 30;
    private final int maxHealth = 30;
    private int attack = 2;
    private int buff_attack = 2;

    @Override
    public void hit(Warrior opponent) {

    }

    public int getBuff_attack() {
        return buff_attack;
    }

    @Override
    public int getAttack(){
        return attack;
    }

    @Override
    public int getHealth(){
        return health;
    }

    @Override
    public int getMaxHealth(){
        return maxHealth;
    }

    @Override
    public void setHealth(int health) {
        this.health = Math.min(getMaxHealth(), health);
    }

    @Override
    public boolean isAlive(){
        return health > 0;
    }

    private void buff(Warrior warriorToBuff) {
        warriorToBuff.
    }

    @Override
    protected void processCommand(Command command, Warrior sender) {
        buff(sender);
        super.processCommand(command, sender);
    }
}
