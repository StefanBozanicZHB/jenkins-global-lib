def generateParameters() {
    return [
        choice(choices: ['debug', 'internalRelease', 'release'], description: 'Select build environment', name: 'BUILD_ENVIRONMENT'),
        booleanParam(defaultValue: false, description: 'Enable design token', name: 'DesignToken'),
    ]
}