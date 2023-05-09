def myFile = ".devcontainer/devcontainer.json"
//println(new groovy.json.JsonBuilder(new File(myFile).readLines())) // .toPrettyString())

new File(myFile).eachLine { line ->
    println line
}
