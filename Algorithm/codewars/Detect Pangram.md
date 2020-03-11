
> A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
>
> Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

- Best Practice
    - Java
~~~java
public class PangramChecker {
  public boolean check(String sentence){
    return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
  }
}
~~~
나는 for문과 if문으로 구현했는데, 트랜드에 많이 뒤쳐진 것 같다.
람다나 rx 사용은 kotlin을 사용하면서 많이 익숙하지만, Stream API(map / filter 등등)은 잘 사용하지 못했던 것 같다. Stream에 익숙해지도록.