#!/bin/bash

if [ ! -d "/usr/local/android-sdk-linux/platforms/android-26" ]; then
	echo y | android update sdk --no-ui --all --filter "android-26"
fi

if [ ! -d "/usr/local/android-sdk-linux/build-tools/26.0.1" ]; then
	echo y | android update sdk --no-ui --all --filter "build-tools-26.0.1"
fi

echo y | android update sdk --no-ui --all --filter "extra-android-m2repository"
