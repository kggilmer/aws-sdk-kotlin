// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the input of a PutItem operation.
 */
class PutItemRequest private constructor(builder: BuilderImpl) {
    /**
     * A condition that must be satisfied in order for a conditional PutItem operation to
     * succeed.
     * An expression can contain any of the following:
     * Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size
     * These function names are case-sensitive.
     * Comparison operators: = | <> |
     * < | > | <= | >= |
     * BETWEEN | IN
     * Logical operators: AND | OR | NOT
     * For more information on condition expressions, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
     * Guide.
     */
    val conditionExpression: String? = builder.conditionExpression
    /**
     * This is a legacy parameter.  Use ConditionExpression instead.  For more information, see
     * <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html">ConditionalOperator in the Amazon DynamoDB Developer Guide.
     */
    val conditionalOperator: ConditionalOperator? = builder.conditionalOperator
    /**
     * This is a legacy parameter.  Use ConditionExpression instead.  For more information, see
     * <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html">Expected in the Amazon DynamoDB Developer Guide.
     */
    val expected: Map<String, ExpectedAttributeValue>? = builder.expected
    /**
     * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:
     * To access an attribute whose name conflicts with a DynamoDB reserved word.
     * To create a placeholder for repeating occurrences of an attribute name in an expression.
     * To prevent special characters in an attribute name from being misinterpreted in an expression.
     * Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:
     * Percentile
     * The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:
     * {"#P":"Percentile"}
     * You could then use this substitution in an expression, as in this example:
     * #P = :val
     * Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.
     * For more information on expression attribute names, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying Item Attributes in the Amazon DynamoDB Developer
     * Guide.
     */
    val expressionAttributeNames: Map<String, String>? = builder.expressionAttributeNames
    /**
     * One or more values that can be substituted in an expression.
     * Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:
     * Available | Backordered | Discontinued
     * You would first need to specify ExpressionAttributeValues as follows:
     * { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }
     * You could then use these values in an expression, such as this:
     * ProductStatus IN (:avail, :back, :disc)
     * For more information on expression attribute values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
     * Guide.
     */
    val expressionAttributeValues: Map<String, AttributeValue>? = builder.expressionAttributeValues
    /**
     * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
     * You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key.
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.
     * Empty String and Binary attribute values are allowed. Attribute values of type String and Binary must have a length greater than zero if the attribute is used as a key attribute for a table or index.
     * For more information about primary keys, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.CoreComponents.html#HowItWorks.CoreComponents.PrimaryKey">Primary Key in the Amazon DynamoDB Developer
     * Guide.
     * Each element in the Item map is an AttributeValue object.
     */
    val item: Map<String, AttributeValue>? = builder.item
    /**
     * Determines the level of detail about provisioned throughput consumption that is returned in the response:
     * INDEXES - The response includes the aggregate ConsumedCapacity for the operation, together with ConsumedCapacity for each table and secondary index that was accessed.
     * Note that some operations, such as GetItem and BatchGetItem, do not access any indexes at all.  In these cases, specifying INDEXES will only return ConsumedCapacity information for table(s).
     * TOTAL - The response includes only the aggregate ConsumedCapacity for the operation.
     * NONE - No ConsumedCapacity details are included in the response.
     */
    val returnConsumedCapacity: ReturnConsumedCapacity? = builder.returnConsumedCapacity
    /**
     * Determines whether item collection metrics are returned.  If set to SIZE, the response includes statistics about item collections, if any, that were modified during
     * the operation are returned in the response. If set to NONE (the default), no statistics are returned.
     */
    val returnItemCollectionMetrics: ReturnItemCollectionMetrics? = builder.returnItemCollectionMetrics
    /**
     * Use ReturnValues if you want to get the item attributes as they appeared before they
     * were updated with the PutItem request. For PutItem, the valid values are:
     * NONE - If ReturnValues is not specified, or if its value is
     * NONE, then nothing is returned. (This setting is the default for
     * ReturnValues.)
     * ALL_OLD - If PutItem overwrote an attribute name-value pair, then the
     * content of the old item is returned.
     * The ReturnValues parameter is used by several DynamoDB operations; however,
     * PutItem does not recognize any values other than NONE or
     * ALL_OLD.
     */
    val returnValues: ReturnValue? = builder.returnValues
    /**
     * The name of the table to contain the item.
     */
    val tableName: String? = builder.tableName

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): PutItemRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("PutItemRequest(")
        append("conditionExpression=$conditionExpression,")
        append("conditionalOperator=$conditionalOperator,")
        append("expected=$expected,")
        append("expressionAttributeNames=$expressionAttributeNames,")
        append("expressionAttributeValues=$expressionAttributeValues,")
        append("item=$item,")
        append("returnConsumedCapacity=$returnConsumedCapacity,")
        append("returnItemCollectionMetrics=$returnItemCollectionMetrics,")
        append("returnValues=$returnValues,")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = conditionExpression?.hashCode() ?: 0
        result = 31 * result + (conditionalOperator?.hashCode() ?: 0)
        result = 31 * result + (expected?.hashCode() ?: 0)
        result = 31 * result + (expressionAttributeNames?.hashCode() ?: 0)
        result = 31 * result + (expressionAttributeValues?.hashCode() ?: 0)
        result = 31 * result + (item?.hashCode() ?: 0)
        result = 31 * result + (returnConsumedCapacity?.hashCode() ?: 0)
        result = 31 * result + (returnItemCollectionMetrics?.hashCode() ?: 0)
        result = 31 * result + (returnValues?.hashCode() ?: 0)
        result = 31 * result + (tableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PutItemRequest

        if (conditionExpression != other.conditionExpression) return false
        if (conditionalOperator != other.conditionalOperator) return false
        if (expected != other.expected) return false
        if (expressionAttributeNames != other.expressionAttributeNames) return false
        if (expressionAttributeValues != other.expressionAttributeValues) return false
        if (item != other.item) return false
        if (returnConsumedCapacity != other.returnConsumedCapacity) return false
        if (returnItemCollectionMetrics != other.returnItemCollectionMetrics) return false
        if (returnValues != other.returnValues) return false
        if (tableName != other.tableName) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): PutItemRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): PutItemRequest
        /**
         * A condition that must be satisfied in order for a conditional PutItem operation to
         * succeed.
         * An expression can contain any of the following:
         * Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size
         * These function names are case-sensitive.
         * Comparison operators: = | <> |
         * < | > | <= | >= |
         * BETWEEN | IN
         * Logical operators: AND | OR | NOT
         * For more information on condition expressions, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
         * Guide.
         */
        fun conditionExpression(conditionExpression: String): FluentBuilder
        /**
         * This is a legacy parameter.  Use ConditionExpression instead.  For more information, see
         * <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html">ConditionalOperator in the Amazon DynamoDB Developer Guide.
         */
        fun conditionalOperator(conditionalOperator: ConditionalOperator): FluentBuilder
        /**
         * This is a legacy parameter.  Use ConditionExpression instead.  For more information, see
         * <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html">Expected in the Amazon DynamoDB Developer Guide.
         */
        fun expected(expected: Map<String, ExpectedAttributeValue>): FluentBuilder
        /**
         * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:
         * To access an attribute whose name conflicts with a DynamoDB reserved word.
         * To create a placeholder for repeating occurrences of an attribute name in an expression.
         * To prevent special characters in an attribute name from being misinterpreted in an expression.
         * Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:
         * Percentile
         * The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:
         * {"#P":"Percentile"}
         * You could then use this substitution in an expression, as in this example:
         * #P = :val
         * Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.
         * For more information on expression attribute names, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying Item Attributes in the Amazon DynamoDB Developer
         * Guide.
         */
        fun expressionAttributeNames(expressionAttributeNames: Map<String, String>): FluentBuilder
        /**
         * One or more values that can be substituted in an expression.
         * Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:
         * Available | Backordered | Discontinued
         * You would first need to specify ExpressionAttributeValues as follows:
         * { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }
         * You could then use these values in an expression, such as this:
         * ProductStatus IN (:avail, :back, :disc)
         * For more information on expression attribute values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
         * Guide.
         */
        fun expressionAttributeValues(expressionAttributeValues: Map<String, AttributeValue>): FluentBuilder
        /**
         * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
         * You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key.
         * If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.
         * Empty String and Binary attribute values are allowed. Attribute values of type String and Binary must have a length greater than zero if the attribute is used as a key attribute for a table or index.
         * For more information about primary keys, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.CoreComponents.html#HowItWorks.CoreComponents.PrimaryKey">Primary Key in the Amazon DynamoDB Developer
         * Guide.
         * Each element in the Item map is an AttributeValue object.
         */
        fun item(item: Map<String, AttributeValue>): FluentBuilder
        /**
         * Determines the level of detail about provisioned throughput consumption that is returned in the response:
         * INDEXES - The response includes the aggregate ConsumedCapacity for the operation, together with ConsumedCapacity for each table and secondary index that was accessed.
         * Note that some operations, such as GetItem and BatchGetItem, do not access any indexes at all.  In these cases, specifying INDEXES will only return ConsumedCapacity information for table(s).
         * TOTAL - The response includes only the aggregate ConsumedCapacity for the operation.
         * NONE - No ConsumedCapacity details are included in the response.
         */
        fun returnConsumedCapacity(returnConsumedCapacity: ReturnConsumedCapacity): FluentBuilder
        /**
         * Determines whether item collection metrics are returned.  If set to SIZE, the response includes statistics about item collections, if any, that were modified during
         * the operation are returned in the response. If set to NONE (the default), no statistics are returned.
         */
        fun returnItemCollectionMetrics(returnItemCollectionMetrics: ReturnItemCollectionMetrics): FluentBuilder
        /**
         * Use ReturnValues if you want to get the item attributes as they appeared before they
         * were updated with the PutItem request. For PutItem, the valid values are:
         * NONE - If ReturnValues is not specified, or if its value is
         * NONE, then nothing is returned. (This setting is the default for
         * ReturnValues.)
         * ALL_OLD - If PutItem overwrote an attribute name-value pair, then the
         * content of the old item is returned.
         * The ReturnValues parameter is used by several DynamoDB operations; however,
         * PutItem does not recognize any values other than NONE or
         * ALL_OLD.
         */
        fun returnValues(returnValues: ReturnValue): FluentBuilder
        /**
         * The name of the table to contain the item.
         */
        fun tableName(tableName: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * A condition that must be satisfied in order for a conditional PutItem operation to
         * succeed.
         * An expression can contain any of the following:
         * Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size
         * These function names are case-sensitive.
         * Comparison operators: = | <> |
         * < | > | <= | >= |
         * BETWEEN | IN
         * Logical operators: AND | OR | NOT
         * For more information on condition expressions, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
         * Guide.
         */
        var conditionExpression: String?
        /**
         * This is a legacy parameter.  Use ConditionExpression instead.  For more information, see
         * <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html">ConditionalOperator in the Amazon DynamoDB Developer Guide.
         */
        var conditionalOperator: ConditionalOperator?
        /**
         * This is a legacy parameter.  Use ConditionExpression instead.  For more information, see
         * <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html">Expected in the Amazon DynamoDB Developer Guide.
         */
        var expected: Map<String, ExpectedAttributeValue>?
        /**
         * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:
         * To access an attribute whose name conflicts with a DynamoDB reserved word.
         * To create a placeholder for repeating occurrences of an attribute name in an expression.
         * To prevent special characters in an attribute name from being misinterpreted in an expression.
         * Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:
         * Percentile
         * The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:
         * {"#P":"Percentile"}
         * You could then use this substitution in an expression, as in this example:
         * #P = :val
         * Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.
         * For more information on expression attribute names, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Specifying Item Attributes in the Amazon DynamoDB Developer
         * Guide.
         */
        var expressionAttributeNames: Map<String, String>?
        /**
         * One or more values that can be substituted in an expression.
         * Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:
         * Available | Backordered | Discontinued
         * You would first need to specify ExpressionAttributeValues as follows:
         * { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }
         * You could then use these values in an expression, such as this:
         * ProductStatus IN (:avail, :back, :disc)
         * For more information on expression attribute values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html">Condition Expressions in the Amazon DynamoDB Developer
         * Guide.
         */
        var expressionAttributeValues: Map<String, AttributeValue>?
        /**
         * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
         * You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key.
         * If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.
         * Empty String and Binary attribute values are allowed. Attribute values of type String and Binary must have a length greater than zero if the attribute is used as a key attribute for a table or index.
         * For more information about primary keys, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.CoreComponents.html#HowItWorks.CoreComponents.PrimaryKey">Primary Key in the Amazon DynamoDB Developer
         * Guide.
         * Each element in the Item map is an AttributeValue object.
         */
        var item: Map<String, AttributeValue>?
        /**
         * Determines the level of detail about provisioned throughput consumption that is returned in the response:
         * INDEXES - The response includes the aggregate ConsumedCapacity for the operation, together with ConsumedCapacity for each table and secondary index that was accessed.
         * Note that some operations, such as GetItem and BatchGetItem, do not access any indexes at all.  In these cases, specifying INDEXES will only return ConsumedCapacity information for table(s).
         * TOTAL - The response includes only the aggregate ConsumedCapacity for the operation.
         * NONE - No ConsumedCapacity details are included in the response.
         */
        var returnConsumedCapacity: ReturnConsumedCapacity?
        /**
         * Determines whether item collection metrics are returned.  If set to SIZE, the response includes statistics about item collections, if any, that were modified during
         * the operation are returned in the response. If set to NONE (the default), no statistics are returned.
         */
        var returnItemCollectionMetrics: ReturnItemCollectionMetrics?
        /**
         * Use ReturnValues if you want to get the item attributes as they appeared before they
         * were updated with the PutItem request. For PutItem, the valid values are:
         * NONE - If ReturnValues is not specified, or if its value is
         * NONE, then nothing is returned. (This setting is the default for
         * ReturnValues.)
         * ALL_OLD - If PutItem overwrote an attribute name-value pair, then the
         * content of the old item is returned.
         * The ReturnValues parameter is used by several DynamoDB operations; however,
         * PutItem does not recognize any values other than NONE or
         * ALL_OLD.
         */
        var returnValues: ReturnValue?
        /**
         * The name of the table to contain the item.
         */
        var tableName: String?

        fun build(): PutItemRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var conditionExpression: String? = null
        override var conditionalOperator: ConditionalOperator? = null
        override var expected: Map<String, ExpectedAttributeValue>? = null
        override var expressionAttributeNames: Map<String, String>? = null
        override var expressionAttributeValues: Map<String, AttributeValue>? = null
        override var item: Map<String, AttributeValue>? = null
        override var returnConsumedCapacity: ReturnConsumedCapacity? = null
        override var returnItemCollectionMetrics: ReturnItemCollectionMetrics? = null
        override var returnValues: ReturnValue? = null
        override var tableName: String? = null

        constructor(x: PutItemRequest) : this() {
            this.conditionExpression = x.conditionExpression
            this.conditionalOperator = x.conditionalOperator
            this.expected = x.expected
            this.expressionAttributeNames = x.expressionAttributeNames
            this.expressionAttributeValues = x.expressionAttributeValues
            this.item = x.item
            this.returnConsumedCapacity = x.returnConsumedCapacity
            this.returnItemCollectionMetrics = x.returnItemCollectionMetrics
            this.returnValues = x.returnValues
            this.tableName = x.tableName
        }

        override fun build(): PutItemRequest = PutItemRequest(this)
        override fun conditionExpression(conditionExpression: String): FluentBuilder = apply { this.conditionExpression = conditionExpression }
        override fun conditionalOperator(conditionalOperator: ConditionalOperator): FluentBuilder = apply { this.conditionalOperator = conditionalOperator }
        override fun expected(expected: Map<String, ExpectedAttributeValue>): FluentBuilder = apply { this.expected = expected }
        override fun expressionAttributeNames(expressionAttributeNames: Map<String, String>): FluentBuilder = apply { this.expressionAttributeNames = expressionAttributeNames }
        override fun expressionAttributeValues(expressionAttributeValues: Map<String, AttributeValue>): FluentBuilder = apply { this.expressionAttributeValues = expressionAttributeValues }
        override fun item(item: Map<String, AttributeValue>): FluentBuilder = apply { this.item = item }
        override fun returnConsumedCapacity(returnConsumedCapacity: ReturnConsumedCapacity): FluentBuilder = apply { this.returnConsumedCapacity = returnConsumedCapacity }
        override fun returnItemCollectionMetrics(returnItemCollectionMetrics: ReturnItemCollectionMetrics): FluentBuilder = apply { this.returnItemCollectionMetrics = returnItemCollectionMetrics }
        override fun returnValues(returnValues: ReturnValue): FluentBuilder = apply { this.returnValues = returnValues }
        override fun tableName(tableName: String): FluentBuilder = apply { this.tableName = tableName }
    }
}
