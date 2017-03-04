/*
 * Facade class
 */
public class Game
{
	private InputSystem input = new InputSystem();
	private GameObjects objects = new GameObjects();
	private GameConsole screen = new GameConsole();

	public void update()
	{
		// Input
		input.getClass();

		// Update game objects
		objects.update();

		// Draw
		screen.clearScreen();
		screen.draw(objects);
	}
}
