dif gitDownload(repo)
{
  git "https://github.com/AkashB1993/${repo}.git"
}
dif newBuild()
{
  sh 'mvn package'
}

