import linkedindataparsing.SecUserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    secUserPasswordEncoderListener(SecUserPasswordEncoderListener, ref('hibernateDatastore'))
}
