#!/bin/bash

set -e
source ./scripts/config.cfg

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

source ./scripts/config.cfg

# Check if the environment variable is set
if [ -z "$ANTLR_JAR_DEST_FOLDER" ]; then
  echo "ANTLR_JAR_DEST_FOLDER is not set. Please check config.cfg settings."
  exit 1
fi

# Check if the environment variable is set
if [ -z "$ANTLR_JAR_FILENAME" ]; then
  echo "ANTLR_JAR_FILENAME is not set. Please check config.cfg settings."
  exit 1
fi

# Check if the environment variable is set
if [ -z "$FULL_ANTLR_FILE_PATH" ]; then
  echo "FULL_ANTLR_FILE_PATH is not set. Please check config.cfg settings."
  exit 1
fi

if [ -e "$FULL_ANTLR_FILE_PATH" ]; then
    printcustom "$FULL_ANTLR_FILE_PATH found. Skipping further steps." "$BLUE" "$BOLD"
else
    printcustom "Downloading $ANTLR_JAR_FILENAME" "$BLUE" "$BOLD"
    wget https://www.antlr.org/download/"$ANTLR_JAR_FILENAME"

    printcustom "Moving $ANTLR_JAR_FILENAME to ${ANTLR_JAR_DEST_FOLDER}" "$BLUE" "$BOLD"
    sudo mv "$ANTLR_JAR_FILENAME" "${ANTLR_JAR_DEST_FOLDER}"
fi
