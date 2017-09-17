#!/bin/bash

NDK_VERSION=r14
TMP_NDK=/tmp/ndk
DIR=android-ndk-$NDK_VERSION
FILE=$DIR-linux-x86_64.bin

mkdir -p $TMP_NDK
curl -L -o $TMP_NDK/$FILE https://dl.google.com/android/ndk/$FILE

pushd $TMP_NDK
chmod a+x $FILE
./$FILE
mv $DIR /opt/android/sdk/ndk-bundle
popd

export ANDROID_NDK=/opt/android/sdk/ndk-bundle

export PATH="$PATH:$ANDROID_NDK"
export ANDROID_NDK_HOME="$ANDROID_NDK"

rm -rf $TMP_NDK