Signal-Server
=================

Documentation
-------------

Looking for protocol documentation? Check out the website!

https://whispersystems.org/docs/


Bug tracker
-----------

Have a bug? Please create an issue here on GitHub!

https://github.com/WhisperSystems/Signal-Server/issues


Mailing list
------------

Have a question? Ask on our mailing list!

whispersystems@lists.riseup.net

https://lists.riseup.net/www/info/whispersystems

Current BitHub Payment Per Commit:
=================
![Current Price](https://bithub.herokuapp.com/v1/status/payment/commit)


This Repository
-------------
Signal Server is a dropwizard java application built with maven and
deployed to Heroku with a Procfile.
If you have maven and java 8 installed you should be able to do most any development.

Development
------------

```
mvn clean teat
```

You can use docker and alpine linux to test easily without installing maven locally

```
docker run -it --rm \
       -v ~/.m2:/var/maven/.m2 \
       -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven \
       -u 1000 \
       -e MAVEN_CONFIG=/var/maven/.m2 \
       maven:alpine \
       mvn -Duser.home=/var/maven clean test
```


Cryptography Notice
------------

This distribution includes cryptographic software. The country in which you currently reside may have restrictions on the import, possession, use, and/or re-export to another country, of encryption software.
BEFORE using any encryption software, please check your country's laws, regulations and policies concerning the import, possession, or use, and re-export of encryption software, to see if this is permitted.
See <http://www.wassenaar.org/> for more information.

The U.S. Government Department of Commerce, Bureau of Industry and Security (BIS), has classified this software as Export Commodity Control Number (ECCN) 5D002.C.1, which includes information security software using or performing cryptographic functions with asymmetric algorithms.
The form and manner of this distribution makes it eligible for export under the License Exception ENC Technology Software Unrestricted (TSU) exception (see the BIS Export Administration Regulations, Section 740.13) for both object code and source code.

License
---------------------

Copyright 2013-2017 Open Whisper Systems

Licensed under the AGPLv3: https://www.gnu.org/licenses/agpl-3.0.html
