def generateParameters() {
    return [
        booleanParam(defaultValue: false, description: "Sample boolean parameter", name: "MyBooleanParam"),
        choice(choices: ["Option 1", "Option 2", "Option 3"], description: "Sample choice parameter", name: "MyChoiceParam")
    ]
}