
Golf Video Camera
===================================

Android app for recording slow motion video of golf swings.

Introduction
------------

This is an Android application I'm developing for recording slow motion video of my golf swing. I use a
[selfie stick with a tripod and bluetooth remote][1] to hold my phone while recording my swing. 

This software is originally based on the [Android Camera2Video Sample][2] Google Sample code project and
retains the license derived from that project.  Special thanks to GitHub user [skynetlabz][3] for resolving
an issue with the original Google sample and from whose project this one is directly forked.

Features Added to Original Google Sample:

1. Control of video record start/stop from bluetooth remote ([#1][4])
2. Video recording at device maximum framerate ([#4][5])
3. Timer for recording start/end ([#2][6], [#3][7], [#5][8])

[1]: https://www.amazon.com/Bluetooth-Android-Foneso-Extendable-Aluminum/dp/B012AGH0KO
[2]: https://github.com/googlesamples/android-Camera2Video
[3]: https://github.com/skynetlabz
[4]: https://github.com/vince1310/android-GolfVideoCamera/issues/1
[5]: https://github.com/vince1310/android-GolfVideoCamera/issues/4
[6]: https://github.com/vince1310/android-GolfVideoCamera/issues/2
[7]: https://github.com/vince1310/android-GolfVideoCamera/issues/3
[8]: https://github.com/vince1310/android-GolfVideoCamera/issues/5

Pre-requisites (needs update)
--------------

- Android SDK 25
- Android Build Tools v25.0.3
- Android Support Repository

Screenshots (needs update)
-------------

<img src="screenshots/1-launch.png" height="400" alt="Screenshot"/> <img src="screenshots/2-record.png" height="400" alt="Screenshot"/> <img src="screenshots/3-save.png" height="400" alt="Screenshot"/> 

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

License
-------

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
