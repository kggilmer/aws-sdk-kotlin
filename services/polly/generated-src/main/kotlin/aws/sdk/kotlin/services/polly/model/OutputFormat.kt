// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



sealed class OutputFormat {

    abstract val value: kotlin.String

    object Json : aws.sdk.kotlin.services.polly.model.OutputFormat() {
        override val value: kotlin.String = "json"
        override fun toString(): kotlin.String = value
    }

    object Mp3 : aws.sdk.kotlin.services.polly.model.OutputFormat() {
        override val value: kotlin.String = "mp3"
        override fun toString(): kotlin.String = value
    }

    object OggVorbis : aws.sdk.kotlin.services.polly.model.OutputFormat() {
        override val value: kotlin.String = "ogg_vorbis"
        override fun toString(): kotlin.String = value
    }

    object Pcm : aws.sdk.kotlin.services.polly.model.OutputFormat() {
        override val value: kotlin.String = "pcm"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.polly.model.OutputFormat() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.polly.model.OutputFormat = when(str) {
            "json" -> Json
            "mp3" -> Mp3
            "ogg_vorbis" -> OggVorbis
            "pcm" -> Pcm
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.polly.model.OutputFormat> = listOf(
            Json,
            Mp3,
            OggVorbis,
            Pcm
        )
    }
}
