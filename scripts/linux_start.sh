#!/bin/bash

set -e

# Define color codes
RED='\e[31m'
GREEN='\e[32m'
YELLOW='\e[33m'
BLUE='\e[34m'
RESET='\e[0m' # Reset color
BOLD='\e[1m'
JAR_DESTINATION='/usr/local/lib/'

# Function to print colored messages
printcustom() {
  local message="$1"
  local color="$2"
  local formatting="$3" # Optional: additional formatting (e.g., bold, underline)

  # Check if the terminal supports color
  if [ -t 1 ]; then
    # Terminal supports color, apply the specified color and formatting
    printf "${formatting}${color}%s${RESET}\n" "$message"
  else
    # Terminal does not support color, print plain text
    printf "%s\n" "$message"
  fi
}

# Check if the version argument is provided
if [ -z "$1" ]; then
  printcustom "Error: Please provide the version number as an argument." "$RED"
  printcustom "Usage: $0 <version>" "$YELLOW"
  exit 1
fi

# Assign the first argument to the VERSION variable
VERSION="$1"

JAR_FILENAME="antlr-${VERSION}-complete.jar"
FILE_PATH="${JAR_DESTINATION}${JAR_FILENAME}"

if [ -e "$FILE_PATH" ]; then
    printcustom "$FILE_PATH found. Skipping further steps." "$BLUE" "$BOLD"
else
    printcustom "Downloading ${JAR_FILENAME}" "$BLUE" "$BOLD"
    wget https://www.antlr.org/download/${JAR_FILENAME}

    printcustom "Moving ${JAR_FILENAME} to ${JAR_DESTINATION}" "$BLUE" "$BOLD"
    sudo mv ${JAR_FILENAME} ${JAR_DESTINATION}
fi

printcustom "Generating lexer/parser code" ${BLUE} "$BOLD"
java -jar ${FILE_PATH} -package antlrapex -o src/antlrapex apex.g4

printcustom "Project setup completed successfully!" ${GREEN} "$BOLD"
