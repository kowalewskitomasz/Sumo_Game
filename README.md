# Sumo Game
Student's group project - Desktop game built in Java together with JavaFX front-end connected with neural network used for teaching up to 2 bots how to play the best they can

## Main goal
We prepared this game as our group project allowing us to pass 2 of our subject's: Distributed Processing (Przetwarzanie rozproszone) and Artificial Intelligence (Sztuczna Inteligencja).

### What is this game about?
It's simple, board is a circle, every player moves using keyboard arrows and tries to throw other players out of bounds. The last one standing wins.

### Some details regarding tools used in designing game
Game part:
Whole game is written in Java, front-end was created with JavaFX. We didn't use any additional framework to handle server side so it's based on sockets and sending packets using DatagramPacket.

AI part:
We built neural network using DL4J (Deep Learning 4 Java) library and focused on feed-forward approach. We experimented with many setups and sizes of our networks so I won't dive into details in this topic. 

### Example of some in-game rounds
![alt text](https://github.com/kowalewskitomasz/Sumo_Game/blob/master/sumo1.gif "Gif showing how program works")
