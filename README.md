# audio-video-practice

A Clojure project to sound audios and show images.

## Setup overtone
```
lein deps # It may takes arround 30 min
```

For ubuntu, see [this site](http://marianoguerra.org/posts/overtone-clojure-jackd-alsa-in-ubuntu-1410.html) and [ubuntu memo](ubuntu_memo.md).

## Usage
```
lein run -m audio-video-practice.core/main
```

After that, you can get `overtone.wav` in project directory.

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
