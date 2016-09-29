# CS 134 Programming Assignment 3: Your Game

## Introduction

You're going to create your own game, with the requiremenets specified.

## Turn-In

Once you are done with your assignment, zip your entire project folder and submit the .zip file to the class Dropbox.

You will also export your game via the "Share" feature, saved as an Application.

---

# About

For this assignment, you won't be following a guide on how to make
a pre-made game - you will be writing your own game.

However, your game must meet some of the requirements listed in this document.

This document also contains reference material (how to use keyboard, mouse, 
collision, etc.) that you can use to implement your features,
and also an ideas list / outline of how to implement certain game features.

You can also reference sample code from some pre-written Greenfoot games provided to help you make your own game.

---

# Required Features

## Classes:

* At least two World classes
  * MenuWorld - Displays the game's name, instructions, and a play button
  * PlayWorld - The actual gameplay portion of the program.

You can also include more than one World if you want multiple levels or multiple gameplay types (but keep it simple!)

* At least two Character (Actor) classes
  * One that is moved by the player, either with the mouse or keyboard
  * One that is moved by AI
  
At least one Character should have functionality to handle when it collides with another Character.
  
* At least one Button (Actor) class

## Functionality:

### Win / Lose state

Your game should have some criteria to be met in order for the game to be finished. There should be a "Win" state and a "Lose" state. For example, if the score reaches 10, the player might win. If health reaches 0%, the player might lose.

### Button class

The button class should have a graphic that makes it look like a button, and it should also display text based on what kind of function it will execute (example: "Play", "Quit", etc.) - So, the button can use the showText method to draw different text on different buttons.

When clicked, the button should cause something to occur - for example, in the MenuWorld, it might cause the game to begin.

If you want to use multiple buttons, you might store a **String** member variable so that you can tell them apart and do different functions based on each button's name.

### Character classes

The character classes will be able to move around the screen and interact with each other. Characters might include the Player, the NPCs (Non-player Characters), and even Items that you could collect.

**At least one character should have a method to handle collision with a second character.**

---

# How To...

## Draw text

The text drawing function belongs to the **World** class.

If you're in the world, you can draw text with:

	showText( "yourtext", x, y );
	
but if you're in an Actor class, you have to call it this way:

	getWorld().showText( "yourtext", x, y );

## Move my Actors

There are several ways you can move an Actor in Greenfoot.

Each actor has a rotation angle and X,Y coordinates.

### Asteroids-style

![Asteroids Ship](images/pa3-00.png)

* Left and Right: Adjust rotation
* Up: Move forward
* Down: Move backward

The Actor class has these methods:

**1. void turn( int amount )**

You can turn your actor by calling turn and passing in an angle, in degrees:

	turn( 90 ); // turn 90 degrees

**2. void turnTowards( int x, int y )**

You can turn your actor towards a certain x,y coordinate by passing in the points:

	turnTowards( 100, 100 ); // Point towards (100, 100)

**3. void setRotation( int rotation )**

Instead of turning the character relative to its current facing direction,
you can set the rotation manually (0 to 360 degrees).

	setRotation( 180 );

**4. void move( int distance )**

Once an actor is rotated, the move function will move it in the direction it is facing.

	turn( 45 );
	move( 10 );

### Rotate-and-move

![Dumb character](images/pa3-01.png) ![Dumb character](images/pa3-02.png)

* Left: Turn left and move
* Right: Turn right and move
* Up: Turn up and move
* Down: Turn down and more

You can use the setRotation and move functions to turn your character
to face a certain direction and then move them forward.

	setRotation( 0 );
	move( 10 );
	
* 0 degrees - Right
* 180 degrees - Left
* 90 degrees - Down
* -90 degrees - Up

### Directly adjusting X,Y coordinates

![Bunny](images/pa3-03.png)

* Left: Subtract from X
* Right: Add to X
* Up: Subtract from Y
* Down: Add to Y

If you don't want to deal with rotation, you can just directly change
a character's position by updating their x,y position.

First, you'll want to create some temporary variables to work with,
and store the actor's current position:

	int x = getX();
	int y = getY();

Then, you can adjust the x, y coordinates:

	x += speed;
	y += speed;
	
And finally you will want to make sure to update the actor's location:

	setLocation( x, y );


## Keyboard Input

To get keyboard input, you will use Greenfoot's isKeyDown method:

	if ( Greenfoot.isKeyDown( "up" ) ) 
	{
		// do "up" action
	}

Keys available:

* Arrow keys: "up", "down", "left", "right"
* Letter keys: "a" - "z"; lower-case letters.
* Number keys: 0 - 9
* Other buttons: "space", "backspace", "enter"

## Mouse Input

To get mouse clicks, you will first have to create a MouseInfo object:

	MouseInfo mouse = Greenfoot.getMouseInfo();

Before you do any operations on the *mouse*, you want to make sure it exists.
(The mouse won't exist if it's off screen, and if you try to call mouse
functions when it doesn't exist, your program will crash.)

	if ( mouse != null )
	{
		// Do your mouse operations here.
	}
	
Then, you can get the mouse coordinates, as well as what button is clicked.

### Which button?

	if ( mouse.getButton() == 1 ) // Left button
	{
	}
	else if ( mouse.getButton() == 2 ) // Middle button
	{
	}
	else if ( mouse.getButton() == 3 ) // Right button
	{
	}

### Where is the mouse?

	int x = mouse.getX();
	int y = mouse.getY();

## Check collision

There are two ways to check to see if two Actors are colliding. This
depends on whether you want to do any operations on the thing you're colliding with.

### Touching - Only going to modify the current Actor

	if ( isTouching( TYPE.class ) )
	{
		// What to do if there's a collision
	}

Note that you'll replace "TYPE" with the Actor class name.

### Collision - Get access to the collided-with object

	TYPE collided = (TYPE)getOneIntersectingObject( TYPE.class );
	if ( collided != null )
	{
		// You can interact with the collided-with object
		// through the "collided" object.
	}

Note that you'll replace "TYPE" with the Actor class name.

## Remove objects from the world

You can remove objects from the world from an Actor class, or from
the World class.

### From within an Actor - Erase itself:

	getWorld().removeObject( this );
	
### From within an Actor - Erase collided-with object:

	getWorld().removeObject( collided );



---

# Game Ideas


---
