// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: vultisig/keysign/v1/1inch_swap_payload.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package vultisig.keysign.v1;

@kotlin.jvm.JvmName("-initializeoneInchQuote")
public inline fun oneInchQuote(block: vultisig.keysign.v1.OneInchQuoteKt.Dsl.() -> kotlin.Unit): vultisig.keysign.v1.1InchSwapPayload.OneInchQuote =
  vultisig.keysign.v1.OneInchQuoteKt.Dsl._create(vultisig.keysign.v1.1InchSwapPayload.OneInchQuote.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `vultisig.keysign.v1.OneInchQuote`
 */
public object OneInchQuoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: vultisig.keysign.v1.1InchSwapPayload.OneInchQuote.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: vultisig.keysign.v1.1InchSwapPayload.OneInchQuote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): vultisig.keysign.v1.1InchSwapPayload.OneInchQuote = _builder.build()

    /**
     * `string dst_amount = 1 [json_name = "dstAmount"];`
     */
    public var dstAmount: kotlin.String
      @JvmName("getDstAmount")
      get() = _builder.getDstAmount()
      @JvmName("setDstAmount")
      set(value) {
        _builder.setDstAmount(value)
      }
    /**
     * `string dst_amount = 1 [json_name = "dstAmount"];`
     */
    public fun clearDstAmount() {
      _builder.clearDstAmount()
    }

    /**
     * `.vultisig.keysign.v1.OneInchTransaction tx = 2 [json_name = "tx"];`
     */
    public var tx: vultisig.keysign.v1.1InchSwapPayload.OneInchTransaction
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * `.vultisig.keysign.v1.OneInchTransaction tx = 2 [json_name = "tx"];`
     */
    public fun clearTx() {
      _builder.clearTx()
    }
    /**
     * `.vultisig.keysign.v1.OneInchTransaction tx = 2 [json_name = "tx"];`
     * @return Whether the tx field is set.
     */
    public fun hasTx(): kotlin.Boolean {
      return _builder.hasTx()
    }
    public val OneInchQuoteKt.Dsl.txOrNull: vultisig.keysign.v1.1InchSwapPayload.OneInchTransaction?
      get() = _builder.txOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun vultisig.keysign.v1.1InchSwapPayload.OneInchQuote.copy(block: `vultisig.keysign.v1`.OneInchQuoteKt.Dsl.() -> kotlin.Unit): vultisig.keysign.v1.1InchSwapPayload.OneInchQuote =
  `vultisig.keysign.v1`.OneInchQuoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val vultisig.keysign.v1.1InchSwapPayload.OneInchQuoteOrBuilder.txOrNull: vultisig.keysign.v1.1InchSwapPayload.OneInchTransaction?
  get() = if (hasTx()) getTx() else null
