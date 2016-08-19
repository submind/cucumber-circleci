#!/usr/bin/env bash

mvn release:prepare arguments='-Dmaven.test.skip=true' -B