def call() {
    return [
        choice(name: 'BUILD_ENVIRONMENT', choices: ['debug', 'internalRelease', 'release'], description: 'Select build environment'),
        booleanParam(name: 'DesignToken', defaultValue: false, description: 'Enable design token'),
    ]
}