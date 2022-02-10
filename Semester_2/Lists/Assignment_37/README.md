# Assignment 37

## Tumor Detection

One of the challenges of medical diagnosis is that of spotting anomalies among the various images now available to physicians. Recent algorithmic developments have made it possible for software to spot many questionable situations and draw the physician’s attention to just such areas. In this problem, you will be given an image of one slice from a scan and will be asked to search within that image for a particular pattern – one that is indicative of a possible tumor.
In this problem, you will be given one slice of a scan from a patient as a series of 1’s and 0’s. The coordinate system of the scan is such that the upper left corner is (0, 0) and pairs are specified in (row, column) order. [Note that (row, column) is NOT the same as (x, y).] You will also be given a pattern that corresponds to the possible tumor. The figures below show the images that are described by the data in the first example.

![Scan sample](https://i.imgur.com/crI3iFD.png)

In this case, the 1’s are shown in black and the 0’s are in white. The possible tumor can be found anchored (by its upper left corner) at the gray square in the picture. This is square (3, 5). Note that for a possible tumor to be detected both white and black squares must match the pattern. A tumor may, however, be rotated counterclockwise within the image. [There is no such case in the image above, but there is in the second sample run shown below.] Your problem is to determine all of the locations of interest (i.e. possible tumors) within the given scanned image.

### Input

The input will consist of two consecutive sequences of lines of text containing 0’s and 1’s only. The first sequence contains the scan, while the second contains the possible tumor. Both scans and tumors will always be “square,” i.e. they will have the same number of bits along each dimension. The maximum size for a scan is 100x100; for a tumor it is 8x8. The minimum size for each is 2x2.

### Output

The output consists of a list of the possible tumors detected within the scan. For each tumor, you are to indicate the location of its anchor point (upper left corner) and the number of degrees (0, 90, 180, 270) that the input tumor was rotated counter-clockwise to determine the match. This data is to be formatted as in the first two examples, but the list may appear in any order in the case of more than one possible tumor. In the event that no tumor is found, the message from the third example is to be printed.

### Samples

"scan1.txt"
```
0000110011
1110101001
0010000000
0000000111
1100000100
0101001111
1111100110
0000000000
1111111111
1111111111
0011
0010
0111
0011

Possible tumor at (3, 5, 0)
```
"scan2.txt"
```
000010
000011
111010
010000
000000
000000
010
011
010

Possible tumor at (0, 3, 0)
Possible tumor at (1, 0, 270)
```

"scan3.txt"
```
000000
000010
000000
100000
000000
000010
010
011
010

No tumors detected.
```
"scan4.txt"
```
0000000000000000000100001011111111110101
0000101110100010000100010101000000101010
0000001111111000000100000000000000000001
1000000010101010000111010000101010010101
0000000001110100000100000111010101000000
0000100000000000101000010101000000000101
0000101111111111010100000001010100011101
0000000001010100000010101000001010100000
1000000000001010100111000101010111111111
0000001111111000101010111000101010001001
0000100000100000000000101000010000000000
0000100000000100000000000101000010000000
0000001110001000000000001010000101111111
1000000001000000000001010000101110010100
0000000001000000000001010000100000000000
0000100000111111110101010100000011000000
0000100001000000000001010000100000000000
0000001111100010000000000010100001011111
1000001101010101000001011110010101000000
0000000001000000000001010000100000000000
0000100001000000000001010000100000000000
0000001111100010000000000010100001011111
1000001101010101000001011110010101000000
0000000001000000000001010000100000000000
1000000000001010000100000000000111111111
0000001111100010000000000010100001011111
1000001101010101000001011110010101000000
0000000001000000000001010000100000000000
0000100000100000000000101000010000000000
0000100000000100000000000101000010000000
0000001110001000000000001010000101111111
1000000001000000000001010000101110010100
0000000001000000000001010000100000000000
0000100000111111110101010100000011000000
0000100001000000000001010000100000000000
0000001111100010000000000010100001011111
1000001101010101000001011110010101000000
0000100000100000000000101000010000000000
0000100000000100000000000101000010000000
0000001110001000000000001010000101111111
00010000100001010100
00000000000000000000
00000000000000000000
00000000000000000000
01100110001100000001
00000000000000000000
10011000010001100110
10011000010001100110
10001000010000100010
00011101100011101111
00101010000100100010
00010010000001000100
10000010010000010000
01010010001001000100
00001010000000110010
00010010000001000100
00000010000000000000
00000010000000000000
00000000000000000000
00000010000000010000

Possible tumor at (20, 0, 90)
```

### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.
