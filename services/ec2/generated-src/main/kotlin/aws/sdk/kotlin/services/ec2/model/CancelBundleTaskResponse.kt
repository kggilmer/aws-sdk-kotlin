// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of CancelBundleTask.
 */
class CancelBundleTaskResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the bundle task.
     */
    val bundleTask: BundleTask? = builder.bundleTask

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CancelBundleTaskResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CancelBundleTaskResponse(")
        append("bundleTask=$bundleTask)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bundleTask?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CancelBundleTaskResponse

        if (bundleTask != other.bundleTask) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CancelBundleTaskResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CancelBundleTaskResponse
        /**
         * Information about the bundle task.
         */
        fun bundleTask(bundleTask: BundleTask): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the bundle task.
         */
        var bundleTask: BundleTask?

        fun build(): CancelBundleTaskResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.BundleTask] inside the given [block]
         */
        fun bundleTask(block: BundleTask.DslBuilder.() -> kotlin.Unit) {
            this.bundleTask = BundleTask.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var bundleTask: BundleTask? = null

        constructor(x: CancelBundleTaskResponse) : this() {
            this.bundleTask = x.bundleTask
        }

        override fun build(): CancelBundleTaskResponse = CancelBundleTaskResponse(this)
        override fun bundleTask(bundleTask: BundleTask): FluentBuilder = apply { this.bundleTask = bundleTask }
    }
}
