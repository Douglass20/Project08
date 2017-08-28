package Rand;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        DamageDealer dd1 = new DamageDealer("DD1");
        DamageDealer dd2 = new DamageDealer("DD2");
        DamageDealer dd3 = new DamageDealer("DD3");
        DamageDealer dd4 = new DamageDealer("DD4");
        DamageDealer dd5 = new DamageDealer("DD5");
        Healer heal1 = new Healer("Healer6");
        Healer heal2 = new Healer("Healer7");
        Healer heal3 = new Healer("Healer8");
        Healer heal4 = new Healer("Healer9");
        Healer heal5 = new Healer("Healer10");
        Tank tank1 = new Tank("Tank11");
        Tank tank2 = new Tank("Tank12");
        Tank tank3 = new Tank("Tank13");
        Tank tank4 = new Tank("Tank14");
        Tank tank5 = new Tank("Tank15");
        Tank tank6 = new Tank("Tank16");

        ArrayList<Player> list = new ArrayList<>();
        list.add(dd1);
        list.add(dd2);
        list.add(dd3);
        list.add(dd4);
        list.add(dd5);
        list.add(heal1);
        list.add(heal2);
        list.add(heal3);
        list.add(heal4);
        list.add(heal5);
        list.add(tank1);
        list.add(tank2);
        list.add(tank3);
        list.add(tank4);
        list.add(tank5);
        list.add(tank6);
        for(Player pl : list)
        {
            System.out.println(pl.getName() + " : " + pl.getHealthPoints());

        }
        System.out.println(" ");
        Random rand = new Random();

        while(list.size() > 1)
        {

            for(int i = 0; i< list.size(); i++)
            {
                if(list.get(i).getHealthPoints() <= 0)
                {
                    list.remove(list.get(i));
                }
            }

            int j = rand.nextInt(list.size());
            int k = rand.nextInt(list.size());
            if(j!=k) {
                list.get(j).fight(list.get(j), list.get(k));
                if(list.get(j) instanceof Healer) { list.get(j).useHeal();
                    System.out.println("Player№ " + list.get(j).getName() + " use heal!" );}
                System.out.println(list.get(j).getName() + " : " + list.get(j).getHealthPoints());
                System.out.println(list.get(k).getName() + " : " + list.get(k).getHealthPoints());
                System.out.println("______ ");
                System.out.println(list.size());
                System.out.println("______");
            }
            for(int i = 0; i< list.size(); i++)
            {
                if(list.get(i).getHealthPoints() <= 0)
                {
                    list.remove(list.get(i));
                }
            }
        }

        if(list.size() == 1 && list.get(0).getHealthPoints() > 0)
        {
            System.out.println("And the winner is " + list.get(0).getName() + " : " + "with "+ list.get(0).getHealthPoints()+ " hp");
        }
        else {
            System.out.println("All players are dead");
        }
    }
}

class Player
{
    private String name;
    private boolean inFight = false;
    private int healthPoints;
    private int damage;

    public void useHeal()
    {
        this.healthPoints += 3;
    }

    public Player()
    {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name)
    {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public boolean isInFight() {
        return inFight;
    }

    public void setInFight(boolean inFight) {
        this.inFight = inFight;
    }

    public void damageDone(Player player)
    {
        player.healthPoints -= this.damage;

    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public void fight(Player pl1, Player pl2)
    {
        pl2.healthPoints -= pl1.damage;
        pl1.healthPoints -= pl2.damage;

    }
}






class DamageDealer extends Player
{


    public DamageDealer(String name) {
        super.setHealthPoints(30);
        super.setDamage(12);
        super.setName(name);
    }

    public void fight()
    {
        super.isInFight();
    }
}








class Healer extends Player
{

    static int heal = 3;

    public Healer(String name) {

        super.setHealthPoints(25) ;
        super.setDamage(5);
        super.setName(name);


    }

    public void useHeal() {

    }
}






class Tank extends Player
{
    static int shield = 30;

    public Tank(String name) {
        super.setHealthPoints(50);
        super.setDamage(8);
        super.setName(name);
    }

    public void useShield() {

    }
}