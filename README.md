This is project of some small games, just for exercise the TDD and refactoring and oo

How to use this demo

1. Make sure you installed the gradle

2. Please clone this project and run "gradle idea" and then open the learning.ipr with IntelliJ
If you use eclipse as IDE instead of Intellij idea, then please change the learning/build.gradle file, change the
"apply plugin: 'idea'" to "apply plugin: 'eclipse'" and then run "gradle eclipse"



GameRequirements:

game1 randomNumberGame

1. The game system will generate four different random numbers in (0-9).(System numbers)

2. The player input 4 numbers in (0-9).(Guess numbers)

3. Compare the guess number with system number:
   3.1
   If there is no number is same, then there is no score.
   If there is just 1 number is same at the same position(four numbers in sequence in position 1,2,3,4 ),
   the score is '1A'.
   If there is 2 numbers are the same at the same position, then the score is '2A'.
   .....

   3.2
   If there is 1 number is the same at different position, then the score is '1B'.
   If there are 2 numbers are the same at different position, then the score is '2B'.
   .....

   3.3
   If there is 1 number is the same at same position and 1 number is same at different position, the
   score is '1A1B'

Game2 primaryNumber
    get the input number's primary numbers. If the input is less than 2. return 0;


Game 3, Calculator
    get the sum of the input string of numbers.  The numbers are split by comma and break line