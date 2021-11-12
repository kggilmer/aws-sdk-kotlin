// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model



/**
 * Contains the response to a successful AssumeRoleWithWebIdentity
 * request, including temporary Amazon Web Services credentials that can be used to make Amazon Web Services requests.
 */
class AssumeRoleWithWebIdentityResponse private constructor(builder: BuilderImpl) {
    /**
     * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you
     * can use to refer to the resulting temporary security credentials. For example, you can
     * reference these credentials as a principal in a resource-based policy by using the ARN or
     * assumed role ID. The ARN and ID include the RoleSessionName that you specified
     * when you called AssumeRole.
     */
    val assumedRoleUser: AssumedRoleUser? = builder.assumedRoleUser
    /**
     * The intended audience (also known as client ID) of the web identity token. This is
     * traditionally the client identifier issued to the application that requested the web
     * identity token.
     */
    val audience: String? = builder.audience
    /**
     * The temporary security credentials, which include an access key ID, a secret access key,
     * and a security token.
     * The size of the security token that STS API operations return is not fixed. We
     * strongly recommend that you make no assumptions about the maximum size.
     */
    val credentials: Credentials? = builder.credentials
    /**
     * A percentage value that indicates the packed size of the session policies and session
     * tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
     * which means the policies and tags exceeded the allowed space.
     */
    val packedPolicySize: Int? = builder.packedPolicySize
    /**
     * The issuing authority of the web identity token presented. For OpenID Connect ID
     * tokens, this contains the value of the iss field. For OAuth 2.0 access tokens,
     * this contains the value of the ProviderId parameter that was passed in the
     * AssumeRoleWithWebIdentity request.
     */
    val provider: String? = builder.provider
    /**
     * The value of the source identity that is returned in the JSON web token (JWT) from the
     * identity provider.
     * You can require users to set a source identity value when they assume a role. You do
     * this by using the sts:SourceIdentity condition key in a role trust policy.
     * That way, actions that are taken with the role are associated with that user. After the
     * source identity is set, the value cannot be changed. It is present in the request for all
     * actions that are taken by the role and persists across <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining">chained
     * role sessions. You can configure your identity provider to use an attribute
     * associated with your users, like user name or email, as the source identity when calling
     * AssumeRoleWithWebIdentity. You do this by adding a claim to the JSON web
     * token. To learn more about OIDC tokens and claims, see <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html">Using Tokens with User Pools in the Amazon Cognito Developer Guide.
     * For more information about using source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
     * actions taken with assumed roles in the
     * IAM User Guide.
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no spaces. You can
     * also include underscores or any of the following characters: =,.@-
     */
    val sourceIdentity: String? = builder.sourceIdentity
    /**
     * The unique user identifier that is returned by the identity provider. This identifier is
     * associated with the WebIdentityToken that was submitted with the
     * AssumeRoleWithWebIdentity call. The identifier is typically unique to the
     * user and the application that acquired the WebIdentityToken (pairwise
     * identifier). For OpenID Connect ID tokens, this field contains the value returned by the
     * identity provider as the token's sub (Subject) claim.
     */
    val subjectFromWebIdentityToken: String? = builder.subjectFromWebIdentityToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AssumeRoleWithWebIdentityResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AssumeRoleWithWebIdentityResponse(")
        append("assumedRoleUser=$assumedRoleUser,")
        append("audience=$audience,")
        append("credentials=$credentials,")
        append("packedPolicySize=$packedPolicySize,")
        append("provider=$provider,")
        append("sourceIdentity=$sourceIdentity,")
        append("subjectFromWebIdentityToken=$subjectFromWebIdentityToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = assumedRoleUser?.hashCode() ?: 0
        result = 31 * result + (audience?.hashCode() ?: 0)
        result = 31 * result + (credentials?.hashCode() ?: 0)
        result = 31 * result + (packedPolicySize ?: 0)
        result = 31 * result + (provider?.hashCode() ?: 0)
        result = 31 * result + (sourceIdentity?.hashCode() ?: 0)
        result = 31 * result + (subjectFromWebIdentityToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AssumeRoleWithWebIdentityResponse

        if (assumedRoleUser != other.assumedRoleUser) return false
        if (audience != other.audience) return false
        if (credentials != other.credentials) return false
        if (packedPolicySize != other.packedPolicySize) return false
        if (provider != other.provider) return false
        if (sourceIdentity != other.sourceIdentity) return false
        if (subjectFromWebIdentityToken != other.subjectFromWebIdentityToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AssumeRoleWithWebIdentityResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AssumeRoleWithWebIdentityResponse
        /**
         * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you
         * can use to refer to the resulting temporary security credentials. For example, you can
         * reference these credentials as a principal in a resource-based policy by using the ARN or
         * assumed role ID. The ARN and ID include the RoleSessionName that you specified
         * when you called AssumeRole.
         */
        fun assumedRoleUser(assumedRoleUser: AssumedRoleUser): FluentBuilder
        /**
         * The intended audience (also known as client ID) of the web identity token. This is
         * traditionally the client identifier issued to the application that requested the web
         * identity token.
         */
        fun audience(audience: String): FluentBuilder
        /**
         * The temporary security credentials, which include an access key ID, a secret access key,
         * and a security token.
         * The size of the security token that STS API operations return is not fixed. We
         * strongly recommend that you make no assumptions about the maximum size.
         */
        fun credentials(credentials: Credentials): FluentBuilder
        /**
         * A percentage value that indicates the packed size of the session policies and session
         * tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
         * which means the policies and tags exceeded the allowed space.
         */
        fun packedPolicySize(packedPolicySize: Int): FluentBuilder
        /**
         * The issuing authority of the web identity token presented. For OpenID Connect ID
         * tokens, this contains the value of the iss field. For OAuth 2.0 access tokens,
         * this contains the value of the ProviderId parameter that was passed in the
         * AssumeRoleWithWebIdentity request.
         */
        fun provider(provider: String): FluentBuilder
        /**
         * The value of the source identity that is returned in the JSON web token (JWT) from the
         * identity provider.
         * You can require users to set a source identity value when they assume a role. You do
         * this by using the sts:SourceIdentity condition key in a role trust policy.
         * That way, actions that are taken with the role are associated with that user. After the
         * source identity is set, the value cannot be changed. It is present in the request for all
         * actions that are taken by the role and persists across <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining">chained
         * role sessions. You can configure your identity provider to use an attribute
         * associated with your users, like user name or email, as the source identity when calling
         * AssumeRoleWithWebIdentity. You do this by adding a claim to the JSON web
         * token. To learn more about OIDC tokens and claims, see <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html">Using Tokens with User Pools in the Amazon Cognito Developer Guide.
         * For more information about using source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
         * actions taken with assumed roles in the
         * IAM User Guide.
         * The regex used to validate this parameter is a string of characters
         * consisting of upper- and lower-case alphanumeric characters with no spaces. You can
         * also include underscores or any of the following characters: =,.@-
         */
        fun sourceIdentity(sourceIdentity: String): FluentBuilder
        /**
         * The unique user identifier that is returned by the identity provider. This identifier is
         * associated with the WebIdentityToken that was submitted with the
         * AssumeRoleWithWebIdentity call. The identifier is typically unique to the
         * user and the application that acquired the WebIdentityToken (pairwise
         * identifier). For OpenID Connect ID tokens, this field contains the value returned by the
         * identity provider as the token's sub (Subject) claim.
         */
        fun subjectFromWebIdentityToken(subjectFromWebIdentityToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you
         * can use to refer to the resulting temporary security credentials. For example, you can
         * reference these credentials as a principal in a resource-based policy by using the ARN or
         * assumed role ID. The ARN and ID include the RoleSessionName that you specified
         * when you called AssumeRole.
         */
        var assumedRoleUser: AssumedRoleUser?
        /**
         * The intended audience (also known as client ID) of the web identity token. This is
         * traditionally the client identifier issued to the application that requested the web
         * identity token.
         */
        var audience: String?
        /**
         * The temporary security credentials, which include an access key ID, a secret access key,
         * and a security token.
         * The size of the security token that STS API operations return is not fixed. We
         * strongly recommend that you make no assumptions about the maximum size.
         */
        var credentials: Credentials?
        /**
         * A percentage value that indicates the packed size of the session policies and session
         * tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
         * which means the policies and tags exceeded the allowed space.
         */
        var packedPolicySize: Int?
        /**
         * The issuing authority of the web identity token presented. For OpenID Connect ID
         * tokens, this contains the value of the iss field. For OAuth 2.0 access tokens,
         * this contains the value of the ProviderId parameter that was passed in the
         * AssumeRoleWithWebIdentity request.
         */
        var provider: String?
        /**
         * The value of the source identity that is returned in the JSON web token (JWT) from the
         * identity provider.
         * You can require users to set a source identity value when they assume a role. You do
         * this by using the sts:SourceIdentity condition key in a role trust policy.
         * That way, actions that are taken with the role are associated with that user. After the
         * source identity is set, the value cannot be changed. It is present in the request for all
         * actions that are taken by the role and persists across <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining">chained
         * role sessions. You can configure your identity provider to use an attribute
         * associated with your users, like user name or email, as the source identity when calling
         * AssumeRoleWithWebIdentity. You do this by adding a claim to the JSON web
         * token. To learn more about OIDC tokens and claims, see <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html">Using Tokens with User Pools in the Amazon Cognito Developer Guide.
         * For more information about using source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
         * actions taken with assumed roles in the
         * IAM User Guide.
         * The regex used to validate this parameter is a string of characters
         * consisting of upper- and lower-case alphanumeric characters with no spaces. You can
         * also include underscores or any of the following characters: =,.@-
         */
        var sourceIdentity: String?
        /**
         * The unique user identifier that is returned by the identity provider. This identifier is
         * associated with the WebIdentityToken that was submitted with the
         * AssumeRoleWithWebIdentity call. The identifier is typically unique to the
         * user and the application that acquired the WebIdentityToken (pairwise
         * identifier). For OpenID Connect ID tokens, this field contains the value returned by the
         * identity provider as the token's sub (Subject) claim.
         */
        var subjectFromWebIdentityToken: String?

        fun build(): AssumeRoleWithWebIdentityResponse
        /**
         * construct an [aws.sdk.kotlin.services.sts.model.AssumedRoleUser] inside the given [block]
         */
        fun assumedRoleUser(block: AssumedRoleUser.DslBuilder.() -> kotlin.Unit) {
            this.assumedRoleUser = AssumedRoleUser.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.sts.model.Credentials] inside the given [block]
         */
        fun credentials(block: Credentials.DslBuilder.() -> kotlin.Unit) {
            this.credentials = Credentials.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var assumedRoleUser: AssumedRoleUser? = null
        override var audience: String? = null
        override var credentials: Credentials? = null
        override var packedPolicySize: Int? = null
        override var provider: String? = null
        override var sourceIdentity: String? = null
        override var subjectFromWebIdentityToken: String? = null

        constructor(x: AssumeRoleWithWebIdentityResponse) : this() {
            this.assumedRoleUser = x.assumedRoleUser
            this.audience = x.audience
            this.credentials = x.credentials
            this.packedPolicySize = x.packedPolicySize
            this.provider = x.provider
            this.sourceIdentity = x.sourceIdentity
            this.subjectFromWebIdentityToken = x.subjectFromWebIdentityToken
        }

        override fun build(): AssumeRoleWithWebIdentityResponse = AssumeRoleWithWebIdentityResponse(this)
        override fun assumedRoleUser(assumedRoleUser: AssumedRoleUser): FluentBuilder = apply { this.assumedRoleUser = assumedRoleUser }
        override fun audience(audience: String): FluentBuilder = apply { this.audience = audience }
        override fun credentials(credentials: Credentials): FluentBuilder = apply { this.credentials = credentials }
        override fun packedPolicySize(packedPolicySize: Int): FluentBuilder = apply { this.packedPolicySize = packedPolicySize }
        override fun provider(provider: String): FluentBuilder = apply { this.provider = provider }
        override fun sourceIdentity(sourceIdentity: String): FluentBuilder = apply { this.sourceIdentity = sourceIdentity }
        override fun subjectFromWebIdentityToken(subjectFromWebIdentityToken: String): FluentBuilder = apply { this.subjectFromWebIdentityToken = subjectFromWebIdentityToken }
    }
}
