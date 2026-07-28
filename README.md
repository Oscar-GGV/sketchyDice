OVERVIEW:
- SketchyDice is a roleplaying game that is played directly from the terminal
- You as the player will try to bankrupt the sketchy opponent by either making cowardly or risky bets
- The Goal is to make it to the very end(secrets are reveled depending on how you play)

FEATURES:
- Player can name their character
- Player can choose their bet amount
- Bosses have unique dialogue
- Opponents have different betting strategies depending on how you play the game
- (hint)Game gets harder depending on how you play
  

- UML CLASS DIAGRAM:
- ```mermaid
classDiagram

%% ===========================
%% Base Character Class
%% ===========================

class Character{
    -String name
    -double aura
    -int balance

    +Character(String name, int balance, double aura)

    +String getName()
    +double getAura()
    +int getBalance()

    +void addAura(double amount)
    +void loseAura(double amount)

    +void addMoney(int amount)
    +void loseMoney(int amount)
}

%% ===========================
%% Player
%% ===========================

class Player{
    -Scanner scnr

    +Player(String name, int balance, double aura)

    +int chooseBet()
    +void playDial()
    +void betAura(int bet)
}

Character <|-- Player

%% ===========================
%% Opponent
%% ===========================

class Opponent{

    +Opponent(String name, int balance, double aura)

    +int placeBet()
    +int counterBet(Player player, int playerBet)

    +void thinkDialogue()
    +void counterDial()
}

Character <|-- Opponent

%% ===========================
%% Enemy Types
%% ===========================

class Goblin{
    +Goblin(...)
    +void thinkDialogue()
    +void counterDial()
}

class Orc{
    +Orc(...)
    +void thinkDialogue()
    +void counterDial()
}

class Wizard{
    +Wizard(...)
    +void thinkDialogue()
    +void counterDial()
}

class Unknown{
    +Unknown(...)
    +void thinkDialogue()
    +void counterDial()
}

Opponent <|-- Goblin
Opponent <|-- Orc
Opponent <|-- Wizard
Opponent <|-- Unknown

%% ===========================
%% Dice
%% ===========================

class DiceRoll{
    -int die1
    -int die2

    +DiceRoll()
    +int roll()
}

%% ===========================
%% Match
%% ===========================

class Match{

    -Player player
    -Opponent opponent

    -boolean playerStarts

    -int roundWinner
    -int matchWinner

    +playerWin : int
    +opponentWin : int
    +tie : int

    +Match(Player player, Opponent opponent)

    +void play()
    +void playRound()

    +int getWinner()
}

Match --> Player
Match --> Opponent
Match --> DiceRoll

%% ===========================
%% Game
%% ===========================

class Game{

    -Player player

    -Goblin boss1
    -Orc boss2
    -Wizard boss3
    -Unknown finalBoss

    -ArrayList~Opponent~ opponents1
    -ArrayList~Opponent~ opponents2
    -ArrayList~Opponent~ opponents3

    -Scanner scnr

    +Game()

    +void initOpponents()

    +Player createPlayer()

    +void exposition()

    +void playerdial1()

    +void sombradial1()

    +Boolean startGame()
}

Game --> Player
Game --> Match
Game --> Goblin
Game --> Orc
Game --> Wizard
Game --> Unknown

Game o-- "3" ArrayList~Opponent~

%% ===========================
%% Utility
%% ===========================

class TextUtils{

    +fast(String)
    +fastln(String)

    +medium(String)
    +mediumln(String)

    +slow(String)
    +slowln(String)
}

Game ..> TextUtils
Player ..> TextUtils
Opponent ..> TextUtils
Match ..> TextUtils

%% ===========================
%% Main
%% ===========================

class Main{
    +main(String[] args)
}

Main --> Game

%% ===========================
%% Tests
%% ===========================

class PlayerTest
class OpponentTest
class GoblinTest
class OrcTest
class DiceRollTest
class MatchTest
class GameTest

PlayerTest ..> Player
OpponentTest ..> Opponent
GoblinTest ..> Goblin
OrcTest ..> Orc
DiceRollTest ..> DiceRoll
MatchTest ..> Match
GameTest ..> Game
```
Dependencies:
JAVA

