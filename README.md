Computer jokes
=================

Have you always wanted a hilarious random joke? This is it.

If you implement this for any other language let me know, please.

Usage:

Java
---------------------------------
```java
//At the beginning of your code after importing the class
New Joke joke = new Joke(); 

//And in the println
joke.getJoke();
```

PHP
---------------------------------
```php
//At the beginning
<?php
    $jokes = file("/path/to/jokes.txt"); //Minimum permissions 644
    $joke = $jokes[rand(0, 168)];
?>

//In the echo

echo $joke;
```

This program is licensed under Creative commons Attribution 3.0 Unported, more info : http://creativecommons.org/licenses/by/3.0/deed.en_US
