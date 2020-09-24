def call(Map stageParams){
         def server = Artifactory.server(stageParams.server)
         def rtMaven = Artifactory.newMavenBuild()
         rtMaven.resolver server: server, releaseRepo: 'libs-release', snapshotRepo: 'libs-snapshot'
         rtMaven.deployer server: server, releaseRepo: 'libs-release-local', snapshotRepo: 'libs-snapshot-local'
         rtMaven.tool =stageParams.tool 
         def buildInfo = rtMaven.run pom: 'pom.xml', goals: 'install'
         server.publishBuildInfo buildInfo
  
}
