#!/bin/bash

set -e
source ./config.cfg

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

# Check if the environment variable is set
if [ -z "$JAR_DEST_FOLDER" ]; then
  echo "JAR_DEST_FOLDER is not set. Please check config.cfg settings."
  exit 1
fi

# Check if the environment variable is set
if [ -z "$COMMONS_CLI_FILENAME" ]; then
  echo "COMMONS_CLI_FILENAME is not set. Please check config.cfg settings."
  exit 1
fi

# Check if the environment variable is set
if [ -z "$COMMONS_CLI_FILE_PATH" ]; then
  echo "COMMONS_CLI_FILE_PATH is not set. Please check config.cfg settings."
  exit 1
fi

if [ -e "$COMMONS_CLI_FILE_PATH" ]; then
    printcustom "$COMMONS_CLI_FILE_PATH found. Skipping further steps." "$BLUE" "$BOLD"
else
    printcustom "Downloading $COMMONS_CLI_FILENAME" "$BLUE" "$BOLD"
    wget https://dlcdn.apache.org//commons/cli/binaries/"$COMMONS_CLI_FILENAME"
    printcustom "Extracting tar file $COMMONS_CLI_FILENAME to ${JAR_DEST_FOLDER}" "$BLUE" "$BOLD"
    sudo tar -xvf "$COMMONS_CLI_FILENAME" -C "$JAR_DEST_FOLDER"
    printcustom "Deleting tar file $COMMONS_CLI_FILENAME" "$BLUE" "$BOLD"
    rm "$COMMONS_CLI_FILENAME"
fi
