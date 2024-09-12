//  Favourite Singer
//  Bob has a playlist of songs, each song has a singer associated with it (denoted by an integer)
//  Favourite singer of Bob is the one whose songs are the most on the playlist
//  Count the number of Favourite Singers of Bob
//  Input Format
//  The first line contains an integer , denoting the number of songs in Bob's playlist.
//  The following input contains
//   integers,  integer denoting the singer of the song.
//  Output Format
//  Output a single integer, the number of favourite singers of Bob
//  Note: Use 64 bit data type
// Sample Input
// 5
// 1 1 2 2 4
// Sample Output
// 2
// Sample Input
// 7
// 23 35 84 20 20 6 6
// Sample Output
// 2

import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long song = Long.parseLong(br.readLine());
        if (song == 0) {
            System.out.println(0);
            return;
        }
        String[] singer = br.readLine().split(" ");
        if (singer.length != song) {
            System.out.println("Input mismatch");
            return;
        }
        HashMap<Long, Integer> listen = new HashMap<>();
        for (int i = 0; i < song; i++) {
            long singerID = Long.parseLong(singer[i]);
            listen.put(singerID, listen.getOrDefault(singerID, 0) + 1);
        }
        long count = 0, max=0;
        for(long i : listen.values()){
            if(i >= max){
                max = i;
            }
        }
        for(long i : listen.values()){
            if(i == max){
                count++;
            }
        }
        System.out.println(count);
    }
}
