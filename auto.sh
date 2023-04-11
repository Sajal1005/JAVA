#!/bin/bash

# Set the GitHub repository URL and branch name
REPO_URL="https://github.com/Sajal1005/JAVA.git"
BRANCH_NAME="main"
USERNAME="Sajal1005"
TOKEN="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"

# Change directory to the folder that you want to push changes from
cd /mnt/c/Users/Nightriders/Desktop/JAVA 

# Add all changes to Git
git add .

# Commit the changes with a timestamp
git commit -m "Auto-commit at $(date "+%Y-%m-%d %H:%M:%S")"

# Push the changes to the GitHub repository
git push $REPO_URL $BRANCH_NAME --quiet --force --set-upstream "https://$USERNAME:$TOKEN@github.com/yourusername/repo.git"


# Print a message to indicate that the push was successful
echo "Changes pushed to GitHub repository: $REPO_URL"


