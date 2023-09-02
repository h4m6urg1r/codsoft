# Number Guessing Game

It's a game in which a number selected randomly and the player is supposed to guess the number. Players will recieve feedback if number is greater than or smaller than the random number.

### Usage
To run the game run:
```bash
javac numberGame.java
java numberGame
```

You can also pass command line arguments to modify parameters like:
- Number of rounds
- Minimum value for random number
- Maximum value for random number

### Available flags
```
--rounds    - Used to specify number of rounds
--min       - Used to specify minimum value for random number
--max       - Used to specify maximum value for random number
```

### Example
```bash
java numberGame --rounds 1 --min 1 --max 100
```
