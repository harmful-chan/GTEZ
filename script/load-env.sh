#!/bin/bash
export $(grep -v '^#' $( dirname "${BASH_SOURCE[0]}" )/../.env | xargs)
