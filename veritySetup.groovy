//def 'Should return number of lines in File using ReadFile.readFileLineByLine given filePath' () {
def testLinesNumberReturnedByRead_Function () {
    given:
        def filePath = ".devcontainer/devcontainer.json"
    when:
        def noOfLines = readFile.readFileLineByLine(filePath)
    then:
        noOfLines
        noOfLines instanceof Integer
        assert noOfLines, 3
}
