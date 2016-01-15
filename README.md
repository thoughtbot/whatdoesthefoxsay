# What Does the Fox Say?
For Java/Android

This library allows you to create different Animal classes and query for what they say. Each query returns a List of Strings.

```java
Fox fox = new Fox();
// returns everything the fox says in ascending order
List<String> foxSays = fox.goes();
for(int i = 0; i < foxSays.size(); i++){
    System.out.println(foxSays.get(i));
}
// output: 
// A-hee-ahee ha-hee!
// A-oo-oo-oo-ooo!
// Fraka-kaka-kaka-kaka-kow!
// Gering-ding-ding-ding-dingeringeding!
// Hatee-hatee-hatee-ho!
// Jacha-chacha-chacha-chow!
// Joff-tchoff-tchoff-tchoffo-tchoffo-tchoff!
// Ring-ding-ding-ding-dingeringeding!
// Wa-pa-pa-pa-pa-pa-pow!
// Woo-oo-oo-ooo!

// returns everything the fox says that starts with "ring" or contains "ring"
// starts with items are returned first in ascending order and then the remaining matches
// are returned in ascending order
List<String> foxSaysRing = foc.goes("ring"); 
for(int i = 0; i < foxSaysRing.size(); i++){
    System.out.println(foxSaysRing.get(i));
}
// output: 
// Ring-ding-ding-ding-dingeringeding!
// Gering-ding-ding-ding-dingeringeding!

```
