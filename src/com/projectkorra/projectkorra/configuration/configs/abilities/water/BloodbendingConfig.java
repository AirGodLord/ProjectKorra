package com.projectkorra.projectkorra.configuration.configs.abilities.water;

import com.projectkorra.projectkorra.configuration.configs.abilities.AbilityConfig;

public class BloodbendingConfig extends AbilityConfig {

	public final long Cooldown = 10000;
	public final long Duration = 8000;
	public final double Range = 15;
	public final double Knockback = .9;
	
	public final boolean CanOnlyBeUsedAtNight = true;
	public final boolean CanBeUsedOnUndeadMobs = false;
	public final boolean CanOnlyBeUsedDuringFullMoon = true;
	public final boolean CanBloodbendOtherBloodbenders = false;
	
	public BloodbendingConfig() {
		super(true, "Bloodbending is one of the most unique bending abilities that existed and it has immense power, which is why it was made illegal in the Avatar universe. People who are capable of bloodbending are immune to your technique, and you are immune to theirs.", "\n" + "(Control) Hold sneak while looking at an entity to bloodbend them. You will then be controlling the entity, making them move wherever you look." + "\n" + "(Throw) While bloodbending an entity, left click to throw that entity in the direction you're looking.");
	}

	@Override
	public String getName() {
		return "Bloodbending";
	}

	@Override
	public String[] getParents() {
		return new String[] { "Abilities", "Water" };
	}

}