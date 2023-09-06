def gitDownload(repo)
{
  git "https://github.com/AkashB1993/${repo}.git"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeployment(jobname,ip,appname)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def runselenium(jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/jenkins.war"
}


