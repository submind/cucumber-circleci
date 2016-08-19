#!/usr/bin/env bash

git config --global user.email "you@example.com"
git config --global user.name "circleci"
mvn release:prepare arguments='-Dmaven.test.skip=true' -B