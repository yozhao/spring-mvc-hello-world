#!/usr/bin/env bash

bin=`dirname "$0"`
bin=`cd "$bin"; pwd`

target=$bin/../target

HEAP_OPTS="-Xmx512m -Xms256m -XX:NewSize=128m"
JAVA_OPTS="-server -d64"
MAIN_CLASS="com.example.service.HelloWorldHttpServer"

CLASSPATH=$target/*:$target/lib/*

exec java $JAVA_OPTS $HEAP_OPTS -classpath $CLASSPATH $MAIN_CLASS
