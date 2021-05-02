# Asteroids

A little task from codingame, that i did during studing :   https://www.codingame.com/ide/puzzle/asteroids

The goal and the task:

You have been tasked with studying a region of space to detect potentially dangerous asteroids.
You are given two pictures of the night sky of dimensions W*H, taken at two different times t1 and t2.
For your convenience, asteroids have been marked with capital letters A to Z, the rest is empty space represented by a dot (.) .
Using the information contained in those two pictures, determine the position of the asteroids at t3, and output a picture of the same region of the sky.

If necessary, the final coordinates are to be rounded-down (floor).
Asteroids travel at different altitudes (with A being the closest and Z the farthest from your observation point) and therefore cannot collide with each other during their transit.
If two or more asteroids have the same final coordinates, output only the closest one.
It is guaranteed that all asteroids at t1 will still be present at t2, that no asteroids are hidden in the given pictures, and that there is only one asteroid per altitude.
Input
Line 1: five ints separated by a space, W H t1 t2 t3
Next H lines: a row of picture 1 and picture 2, separated by a white space.
Output
H lines for the state of the sky at t3
Constraints
0<W<=H<=20
0<=t1<t2<=t3<=10000
Example
Input
5 5 1 2 3
A.... .A...
..... .....
..... .....
..... .....
..... .....
Output
..A..
.....
.....
.....
.....

Input 
20 20 25 75 100
.................O.. G...................
.....N...........U.. ...............W....
.............L.R.... ...................C
.................... ...E................
..........Q..V.H.... ..............K.....
................X... ...........T........
.............P...... ............A.......
.............A...... .....P...FLI......N.
.Z.............T.... ....................
..................F. ........D...........
.................... ......S..Y.........M
......K............W .........B....Q.....
...............Y.... ....................
..............S..... ....V.............J.
...........JE......D .........O..........
...M................ ..X...........U.....
......B..G...C....I. ....................
.................... ....................
.................... ..Z................R
.................... .......H............
Output
..................K.
....................
.......I............
.........T..........
....................
...........A........
..D.F...............
.P..................
..S.......B.........
......Y.L...........
....................
....................
....................
....................
................Q...
....................
....................
....................
....................
....................