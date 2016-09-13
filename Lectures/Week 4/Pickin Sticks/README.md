**Set Background**

1. Add background image to world

**First, add treasure**

1. Create treasure item
	1. Adding different points and images
	2. Create a function to "get points"
	3. Writing a function to randomly place it in the world
3. Add treasure object in world, randomly place, randomly set points.

**NPC and Player**

1. Plan in Notepad -
What does an NPC and a Player have in common?

	1. Movement
	2. Score
	3. Speed
	4. Can collide with the treasure

2. What is different between them?

	1. Player moves from user input
	2. NPC decides where to move

3. Create a parent class "Character" that stores the common
functionality

4. Create "specialized" characters: Player and NPC

**Game Over**

1. Create "game over" state in world. Add an act() function.
