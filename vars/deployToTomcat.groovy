def call(Map stageParams){
    deploy adapters: stageParams.adapters,
    contextPath :stageParams.contextPath,
    war : stageParams.war

}
