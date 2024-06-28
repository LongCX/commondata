// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: vultisig/keysign/v1/blockchain_specific.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package vultisig.keysign.v1;

@kotlin.jvm.JvmName("-initializesolanaSpecific")
public inline fun solanaSpecific(block: vultisig.keysign.v1.SolanaSpecificKt.Dsl.() -> kotlin.Unit): vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific =
  vultisig.keysign.v1.SolanaSpecificKt.Dsl._create(vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `vultisig.keysign.v1.SolanaSpecific`
 */
public object SolanaSpecificKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific = _builder.build()

    /**
     * `string recent_block_hash = 1 [json_name = "recentBlockHash"];`
     */
    public var recentBlockHash: kotlin.String
      @JvmName("getRecentBlockHash")
      get() = _builder.getRecentBlockHash()
      @JvmName("setRecentBlockHash")
      set(value) {
        _builder.setRecentBlockHash(value)
      }
    /**
     * `string recent_block_hash = 1 [json_name = "recentBlockHash"];`
     */
    public fun clearRecentBlockHash() {
      _builder.clearRecentBlockHash()
    }

    /**
     * `string priority_fee = 2 [json_name = "priorityFee"];`
     */
    public var priorityFee: kotlin.String
      @JvmName("getPriorityFee")
      get() = _builder.getPriorityFee()
      @JvmName("setPriorityFee")
      set(value) {
        _builder.setPriorityFee(value)
      }
    /**
     * `string priority_fee = 2 [json_name = "priorityFee"];`
     */
    public fun clearPriorityFee() {
      _builder.clearPriorityFee()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific.copy(block: `vultisig.keysign.v1`.SolanaSpecificKt.Dsl.() -> kotlin.Unit): vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific =
  `vultisig.keysign.v1`.SolanaSpecificKt.Dsl._create(this.toBuilder()).apply { block() }._build()

