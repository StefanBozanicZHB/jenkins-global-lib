def generateParameters() {
    return [
        [type: 'choice', name: 'BUILD_ENVIRONMENT', choices: ['debug', 'internalRelease', 'release'], description: 'Select build environment'],
        [type: 'booleanParam', name: 'DesignToken', defaultValue: false, description: 'Enable design token'],
    ]
}