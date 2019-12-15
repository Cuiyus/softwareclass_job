package lesson18.test18_4.game;

import java.io.*;
import java.util.*;

public class Memento implements Serializable
{
	int money;
	ArrayList fruits;

	public int getMoney()
	{
		return money;
	}

	Memento(int money)
	{
		this.money = money;
		this.fruits = new ArrayList();
	}

	void addFruit(String fruit)
	{
		fruits.add(fruit);
	}

	List getFruits()
	{
		return (List) fruits.clone();
	}
}
