def gitDownload(repo)
{
  git "https://github.com/AkashB1993/${repo}.git"
}
def newBuild()
{
  sh 'mvn package'
}

