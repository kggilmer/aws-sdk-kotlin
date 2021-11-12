// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about the error for the burstable performance instance whose credit option
 * for CPU usage was not modified.
 */
class UnsuccessfulInstanceCreditSpecificationItemError private constructor(builder: BuilderImpl) {
    /**
     * The error code.
     */
    val code: UnsuccessfulInstanceCreditSpecificationErrorCode? = builder.code
    /**
     * The applicable error message.
     */
    val message: String? = builder.message

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): UnsuccessfulInstanceCreditSpecificationItemError = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("UnsuccessfulInstanceCreditSpecificationItemError(")
        append("code=$code,")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (message?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UnsuccessfulInstanceCreditSpecificationItemError

        if (code != other.code) return false
        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): UnsuccessfulInstanceCreditSpecificationItemError = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): UnsuccessfulInstanceCreditSpecificationItemError
        /**
         * The error code.
         */
        fun code(code: UnsuccessfulInstanceCreditSpecificationErrorCode): FluentBuilder
        /**
         * The applicable error message.
         */
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The error code.
         */
        var code: UnsuccessfulInstanceCreditSpecificationErrorCode?
        /**
         * The applicable error message.
         */
        var message: String?

        fun build(): UnsuccessfulInstanceCreditSpecificationItemError
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var code: UnsuccessfulInstanceCreditSpecificationErrorCode? = null
        override var message: String? = null

        constructor(x: UnsuccessfulInstanceCreditSpecificationItemError) : this() {
            this.code = x.code
            this.message = x.message
        }

        override fun build(): UnsuccessfulInstanceCreditSpecificationItemError = UnsuccessfulInstanceCreditSpecificationItemError(this)
        override fun code(code: UnsuccessfulInstanceCreditSpecificationErrorCode): FluentBuilder = apply { this.code = code }
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
