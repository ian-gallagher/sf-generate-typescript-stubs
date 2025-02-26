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

printcustom "Generating lexer/parser code" "${BLUE}" "$BOLD"
java -jar "${FULL_ANTLR_FILE_PATH}" -package apextsstubgenerator.antlrapex -o src/main/java/apextsstubgenerator/antlrapex apex.g4
