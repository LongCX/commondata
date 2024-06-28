// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: vultisig/keysign/v1/keysign_message.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package vultisig.keysign.v1;

@kotlin.jvm.JvmName("-initializekeysignPayload")
public inline fun keysignPayload(block: vultisig.keysign.v1.KeysignPayloadKt.Dsl.() -> kotlin.Unit): vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload =
  vultisig.keysign.v1.KeysignPayloadKt.Dsl._create(vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `vultisig.keysign.v1.KeysignPayload`
 */
public object KeysignPayloadKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload = _builder.build()

    /**
     * `.vultisig.keysign.v1.Coin coin = 1 [json_name = "coin"];`
     */
    public var coin: vultisig.keysign.v1.CoinOuterClass.Coin
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * `.vultisig.keysign.v1.Coin coin = 1 [json_name = "coin"];`
     */
    public fun clearCoin() {
      _builder.clearCoin()
    }
    /**
     * `.vultisig.keysign.v1.Coin coin = 1 [json_name = "coin"];`
     * @return Whether the coin field is set.
     */
    public fun hasCoin(): kotlin.Boolean {
      return _builder.hasCoin()
    }
    public val KeysignPayloadKt.Dsl.coinOrNull: vultisig.keysign.v1.CoinOuterClass.Coin?
      get() = _builder.coinOrNull

    /**
     * `string to_address = 2 [json_name = "toAddress"];`
     */
    public var toAddress: kotlin.String
      @JvmName("getToAddress")
      get() = _builder.getToAddress()
      @JvmName("setToAddress")
      set(value) {
        _builder.setToAddress(value)
      }
    /**
     * `string to_address = 2 [json_name = "toAddress"];`
     */
    public fun clearToAddress() {
      _builder.clearToAddress()
    }

    /**
     * `string to_amount = 3 [json_name = "toAmount"];`
     */
    public var toAmount: kotlin.String
      @JvmName("getToAmount")
      get() = _builder.getToAmount()
      @JvmName("setToAmount")
      set(value) {
        _builder.setToAmount(value)
      }
    /**
     * `string to_amount = 3 [json_name = "toAmount"];`
     */
    public fun clearToAmount() {
      _builder.clearToAmount()
    }

    /**
     * `.vultisig.keysign.v1.UTXOSpecific utxo_specific = 4 [json_name = "utxoSpecific"];`
     */
    public var utxoSpecific: vultisig.keysign.v1.BlockchainSpecific.UTXOSpecific
      @JvmName("getUtxoSpecific")
      get() = _builder.getUtxoSpecific()
      @JvmName("setUtxoSpecific")
      set(value) {
        _builder.setUtxoSpecific(value)
      }
    /**
     * `.vultisig.keysign.v1.UTXOSpecific utxo_specific = 4 [json_name = "utxoSpecific"];`
     */
    public fun clearUtxoSpecific() {
      _builder.clearUtxoSpecific()
    }
    /**
     * `.vultisig.keysign.v1.UTXOSpecific utxo_specific = 4 [json_name = "utxoSpecific"];`
     * @return Whether the utxoSpecific field is set.
     */
    public fun hasUtxoSpecific(): kotlin.Boolean {
      return _builder.hasUtxoSpecific()
    }

    /**
     * `.vultisig.keysign.v1.EthereumSpecific ethereum_specific = 5 [json_name = "ethereumSpecific"];`
     */
    public var ethereumSpecific: vultisig.keysign.v1.BlockchainSpecific.EthereumSpecific
      @JvmName("getEthereumSpecific")
      get() = _builder.getEthereumSpecific()
      @JvmName("setEthereumSpecific")
      set(value) {
        _builder.setEthereumSpecific(value)
      }
    /**
     * `.vultisig.keysign.v1.EthereumSpecific ethereum_specific = 5 [json_name = "ethereumSpecific"];`
     */
    public fun clearEthereumSpecific() {
      _builder.clearEthereumSpecific()
    }
    /**
     * `.vultisig.keysign.v1.EthereumSpecific ethereum_specific = 5 [json_name = "ethereumSpecific"];`
     * @return Whether the ethereumSpecific field is set.
     */
    public fun hasEthereumSpecific(): kotlin.Boolean {
      return _builder.hasEthereumSpecific()
    }

    /**
     * `.vultisig.keysign.v1.THORChainSpecific thorchain_specific = 6 [json_name = "thorchainSpecific"];`
     */
    public var thorchainSpecific: vultisig.keysign.v1.BlockchainSpecific.THORChainSpecific
      @JvmName("getThorchainSpecific")
      get() = _builder.getThorchainSpecific()
      @JvmName("setThorchainSpecific")
      set(value) {
        _builder.setThorchainSpecific(value)
      }
    /**
     * `.vultisig.keysign.v1.THORChainSpecific thorchain_specific = 6 [json_name = "thorchainSpecific"];`
     */
    public fun clearThorchainSpecific() {
      _builder.clearThorchainSpecific()
    }
    /**
     * `.vultisig.keysign.v1.THORChainSpecific thorchain_specific = 6 [json_name = "thorchainSpecific"];`
     * @return Whether the thorchainSpecific field is set.
     */
    public fun hasThorchainSpecific(): kotlin.Boolean {
      return _builder.hasThorchainSpecific()
    }

    /**
     * `.vultisig.keysign.v1.MAYAChainSpecific maya_specific = 7 [json_name = "mayaSpecific"];`
     */
    public var mayaSpecific: vultisig.keysign.v1.BlockchainSpecific.MAYAChainSpecific
      @JvmName("getMayaSpecific")
      get() = _builder.getMayaSpecific()
      @JvmName("setMayaSpecific")
      set(value) {
        _builder.setMayaSpecific(value)
      }
    /**
     * `.vultisig.keysign.v1.MAYAChainSpecific maya_specific = 7 [json_name = "mayaSpecific"];`
     */
    public fun clearMayaSpecific() {
      _builder.clearMayaSpecific()
    }
    /**
     * `.vultisig.keysign.v1.MAYAChainSpecific maya_specific = 7 [json_name = "mayaSpecific"];`
     * @return Whether the mayaSpecific field is set.
     */
    public fun hasMayaSpecific(): kotlin.Boolean {
      return _builder.hasMayaSpecific()
    }

    /**
     * `.vultisig.keysign.v1.CosmosSpecific cosmos_specific = 8 [json_name = "cosmosSpecific"];`
     */
    public var cosmosSpecific: vultisig.keysign.v1.BlockchainSpecific.CosmosSpecific
      @JvmName("getCosmosSpecific")
      get() = _builder.getCosmosSpecific()
      @JvmName("setCosmosSpecific")
      set(value) {
        _builder.setCosmosSpecific(value)
      }
    /**
     * `.vultisig.keysign.v1.CosmosSpecific cosmos_specific = 8 [json_name = "cosmosSpecific"];`
     */
    public fun clearCosmosSpecific() {
      _builder.clearCosmosSpecific()
    }
    /**
     * `.vultisig.keysign.v1.CosmosSpecific cosmos_specific = 8 [json_name = "cosmosSpecific"];`
     * @return Whether the cosmosSpecific field is set.
     */
    public fun hasCosmosSpecific(): kotlin.Boolean {
      return _builder.hasCosmosSpecific()
    }

    /**
     * `.vultisig.keysign.v1.SolanaSpecific solana_specific = 9 [json_name = "solanaSpecific"];`
     */
    public var solanaSpecific: vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific
      @JvmName("getSolanaSpecific")
      get() = _builder.getSolanaSpecific()
      @JvmName("setSolanaSpecific")
      set(value) {
        _builder.setSolanaSpecific(value)
      }
    /**
     * `.vultisig.keysign.v1.SolanaSpecific solana_specific = 9 [json_name = "solanaSpecific"];`
     */
    public fun clearSolanaSpecific() {
      _builder.clearSolanaSpecific()
    }
    /**
     * `.vultisig.keysign.v1.SolanaSpecific solana_specific = 9 [json_name = "solanaSpecific"];`
     * @return Whether the solanaSpecific field is set.
     */
    public fun hasSolanaSpecific(): kotlin.Boolean {
      return _builder.hasSolanaSpecific()
    }

    /**
     * `.vultisig.keysign.v1.PolkadotSpecific polkadot_specific = 10 [json_name = "polkadotSpecific"];`
     */
    public var polkadotSpecific: vultisig.keysign.v1.BlockchainSpecific.PolkadotSpecific
      @JvmName("getPolkadotSpecific")
      get() = _builder.getPolkadotSpecific()
      @JvmName("setPolkadotSpecific")
      set(value) {
        _builder.setPolkadotSpecific(value)
      }
    /**
     * `.vultisig.keysign.v1.PolkadotSpecific polkadot_specific = 10 [json_name = "polkadotSpecific"];`
     */
    public fun clearPolkadotSpecific() {
      _builder.clearPolkadotSpecific()
    }
    /**
     * `.vultisig.keysign.v1.PolkadotSpecific polkadot_specific = 10 [json_name = "polkadotSpecific"];`
     * @return Whether the polkadotSpecific field is set.
     */
    public fun hasPolkadotSpecific(): kotlin.Boolean {
      return _builder.hasPolkadotSpecific()
    }

    /**
     * `.vultisig.keysign.v1.SuiSpecific suiche_specific = 11 [json_name = "suicheSpecific"];`
     */
    public var suicheSpecific: vultisig.keysign.v1.BlockchainSpecific.SuiSpecific
      @JvmName("getSuicheSpecific")
      get() = _builder.getSuicheSpecific()
      @JvmName("setSuicheSpecific")
      set(value) {
        _builder.setSuicheSpecific(value)
      }
    /**
     * `.vultisig.keysign.v1.SuiSpecific suiche_specific = 11 [json_name = "suicheSpecific"];`
     */
    public fun clearSuicheSpecific() {
      _builder.clearSuicheSpecific()
    }
    /**
     * `.vultisig.keysign.v1.SuiSpecific suiche_specific = 11 [json_name = "suicheSpecific"];`
     * @return Whether the suicheSpecific field is set.
     */
    public fun hasSuicheSpecific(): kotlin.Boolean {
      return _builder.hasSuicheSpecific()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UtxoInfoProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .vultisig.keysign.v1.UtxoInfo utxo_info = 20 [json_name = "utxoInfo"];`
     */
     public val utxoInfo: com.google.protobuf.kotlin.DslList<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo, UtxoInfoProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getUtxoInfoList()
      )
    /**
     * `repeated .vultisig.keysign.v1.UtxoInfo utxo_info = 20 [json_name = "utxoInfo"];`
     * @param value The utxoInfo to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addUtxoInfo")
    public fun com.google.protobuf.kotlin.DslList<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo, UtxoInfoProxy>.add(value: vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo) {
      _builder.addUtxoInfo(value)
    }
    /**
     * `repeated .vultisig.keysign.v1.UtxoInfo utxo_info = 20 [json_name = "utxoInfo"];`
     * @param value The utxoInfo to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignUtxoInfo")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo, UtxoInfoProxy>.plusAssign(value: vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo) {
      add(value)
    }
    /**
     * `repeated .vultisig.keysign.v1.UtxoInfo utxo_info = 20 [json_name = "utxoInfo"];`
     * @param values The utxoInfo to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllUtxoInfo")
    public fun com.google.protobuf.kotlin.DslList<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo, UtxoInfoProxy>.addAll(values: kotlin.collections.Iterable<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo>) {
      _builder.addAllUtxoInfo(values)
    }
    /**
     * `repeated .vultisig.keysign.v1.UtxoInfo utxo_info = 20 [json_name = "utxoInfo"];`
     * @param values The utxoInfo to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllUtxoInfo")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo, UtxoInfoProxy>.plusAssign(values: kotlin.collections.Iterable<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo>) {
      addAll(values)
    }
    /**
     * `repeated .vultisig.keysign.v1.UtxoInfo utxo_info = 20 [json_name = "utxoInfo"];`
     * @param index The index to set the value at.
     * @param value The utxoInfo to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setUtxoInfo")
    public operator fun com.google.protobuf.kotlin.DslList<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo, UtxoInfoProxy>.set(index: kotlin.Int, value: vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo) {
      _builder.setUtxoInfo(index, value)
    }
    /**
     * `repeated .vultisig.keysign.v1.UtxoInfo utxo_info = 20 [json_name = "utxoInfo"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearUtxoInfo")
    public fun com.google.protobuf.kotlin.DslList<vultisig.keysign.v1.UtxoInfoOuterClass.UtxoInfo, UtxoInfoProxy>.clear() {
      _builder.clearUtxoInfo()
    }


    /**
     * `optional string memo = 21 [json_name = "memo"];`
     */
    public var memo: kotlin.String
      @JvmName("getMemo")
      get() = _builder.getMemo()
      @JvmName("setMemo")
      set(value) {
        _builder.setMemo(value)
      }
    /**
     * `optional string memo = 21 [json_name = "memo"];`
     */
    public fun clearMemo() {
      _builder.clearMemo()
    }
    /**
     * `optional string memo = 21 [json_name = "memo"];`
     * @return Whether the memo field is set.
     */
    public fun hasMemo(): kotlin.Boolean {
      return _builder.hasMemo()
    }

    /**
     * `.vultisig.keysign.v1.THORChainSwapPayload thorchain_swap_payload = 22 [json_name = "thorchainSwapPayload"];`
     */
    public var thorchainSwapPayload: vultisig.keysign.v1.ThorchainSwapPayload.THORChainSwapPayload
      @JvmName("getThorchainSwapPayload")
      get() = _builder.getThorchainSwapPayload()
      @JvmName("setThorchainSwapPayload")
      set(value) {
        _builder.setThorchainSwapPayload(value)
      }
    /**
     * `.vultisig.keysign.v1.THORChainSwapPayload thorchain_swap_payload = 22 [json_name = "thorchainSwapPayload"];`
     */
    public fun clearThorchainSwapPayload() {
      _builder.clearThorchainSwapPayload()
    }
    /**
     * `.vultisig.keysign.v1.THORChainSwapPayload thorchain_swap_payload = 22 [json_name = "thorchainSwapPayload"];`
     * @return Whether the thorchainSwapPayload field is set.
     */
    public fun hasThorchainSwapPayload(): kotlin.Boolean {
      return _builder.hasThorchainSwapPayload()
    }

    /**
     * `.vultisig.keysign.v1.THORChainSwapPayload mayachain_swap_payload = 23 [json_name = "mayachainSwapPayload"];`
     */
    public var mayachainSwapPayload: vultisig.keysign.v1.ThorchainSwapPayload.THORChainSwapPayload
      @JvmName("getMayachainSwapPayload")
      get() = _builder.getMayachainSwapPayload()
      @JvmName("setMayachainSwapPayload")
      set(value) {
        _builder.setMayachainSwapPayload(value)
      }
    /**
     * `.vultisig.keysign.v1.THORChainSwapPayload mayachain_swap_payload = 23 [json_name = "mayachainSwapPayload"];`
     */
    public fun clearMayachainSwapPayload() {
      _builder.clearMayachainSwapPayload()
    }
    /**
     * `.vultisig.keysign.v1.THORChainSwapPayload mayachain_swap_payload = 23 [json_name = "mayachainSwapPayload"];`
     * @return Whether the mayachainSwapPayload field is set.
     */
    public fun hasMayachainSwapPayload(): kotlin.Boolean {
      return _builder.hasMayachainSwapPayload()
    }

    /**
     * `.vultisig.keysign.v1.OneInchSwapPayload oneinch_swap_payload = 24 [json_name = "oneinchSwapPayload"];`
     */
    public var oneinchSwapPayload: vultisig.keysign.v1.1InchSwapPayload.OneInchSwapPayload
      @JvmName("getOneinchSwapPayload")
      get() = _builder.getOneinchSwapPayload()
      @JvmName("setOneinchSwapPayload")
      set(value) {
        _builder.setOneinchSwapPayload(value)
      }
    /**
     * `.vultisig.keysign.v1.OneInchSwapPayload oneinch_swap_payload = 24 [json_name = "oneinchSwapPayload"];`
     */
    public fun clearOneinchSwapPayload() {
      _builder.clearOneinchSwapPayload()
    }
    /**
     * `.vultisig.keysign.v1.OneInchSwapPayload oneinch_swap_payload = 24 [json_name = "oneinchSwapPayload"];`
     * @return Whether the oneinchSwapPayload field is set.
     */
    public fun hasOneinchSwapPayload(): kotlin.Boolean {
      return _builder.hasOneinchSwapPayload()
    }

    /**
     * `optional .vultisig.keysign.v1.Erc20ApprovePayload erc20_approve_payload = 30 [json_name = "erc20ApprovePayload"];`
     */
    public var erc20ApprovePayload: vultisig.keysign.v1.Erc20ApprovePayloadOuterClass.Erc20ApprovePayload
      @JvmName("getErc20ApprovePayload")
      get() = _builder.getErc20ApprovePayload()
      @JvmName("setErc20ApprovePayload")
      set(value) {
        _builder.setErc20ApprovePayload(value)
      }
    /**
     * `optional .vultisig.keysign.v1.Erc20ApprovePayload erc20_approve_payload = 30 [json_name = "erc20ApprovePayload"];`
     */
    public fun clearErc20ApprovePayload() {
      _builder.clearErc20ApprovePayload()
    }
    /**
     * `optional .vultisig.keysign.v1.Erc20ApprovePayload erc20_approve_payload = 30 [json_name = "erc20ApprovePayload"];`
     * @return Whether the erc20ApprovePayload field is set.
     */
    public fun hasErc20ApprovePayload(): kotlin.Boolean {
      return _builder.hasErc20ApprovePayload()
    }
    public val KeysignPayloadKt.Dsl.erc20ApprovePayloadOrNull: vultisig.keysign.v1.Erc20ApprovePayloadOuterClass.Erc20ApprovePayload?
      get() = _builder.erc20ApprovePayloadOrNull

    /**
     * `string vault_public_key_ecdsa = 31 [json_name = "vaultPublicKeyEcdsa"];`
     */
    public var vaultPublicKeyEcdsa: kotlin.String
      @JvmName("getVaultPublicKeyEcdsa")
      get() = _builder.getVaultPublicKeyEcdsa()
      @JvmName("setVaultPublicKeyEcdsa")
      set(value) {
        _builder.setVaultPublicKeyEcdsa(value)
      }
    /**
     * `string vault_public_key_ecdsa = 31 [json_name = "vaultPublicKeyEcdsa"];`
     */
    public fun clearVaultPublicKeyEcdsa() {
      _builder.clearVaultPublicKeyEcdsa()
    }

    /**
     * `string vault_local_party_id = 32 [json_name = "vaultLocalPartyId"];`
     */
    public var vaultLocalPartyId: kotlin.String
      @JvmName("getVaultLocalPartyId")
      get() = _builder.getVaultLocalPartyId()
      @JvmName("setVaultLocalPartyId")
      set(value) {
        _builder.setVaultLocalPartyId(value)
      }
    /**
     * `string vault_local_party_id = 32 [json_name = "vaultLocalPartyId"];`
     */
    public fun clearVaultLocalPartyId() {
      _builder.clearVaultLocalPartyId()
    }
    public val blockchainSpecificCase: vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload.BlockchainSpecificCase
      @JvmName("getBlockchainSpecificCase")
      get() = _builder.getBlockchainSpecificCase()

    public fun clearBlockchainSpecific() {
      _builder.clearBlockchainSpecific()
    }
    public val swapPayloadCase: vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload.SwapPayloadCase
      @JvmName("getSwapPayloadCase")
      get() = _builder.getSwapPayloadCase()

    public fun clearSwapPayload() {
      _builder.clearSwapPayload()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload.copy(block: `vultisig.keysign.v1`.KeysignPayloadKt.Dsl.() -> kotlin.Unit): vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayload =
  `vultisig.keysign.v1`.KeysignPayloadKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.coinOrNull: vultisig.keysign.v1.CoinOuterClass.Coin?
  get() = if (hasCoin()) getCoin() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.utxoSpecificOrNull: vultisig.keysign.v1.BlockchainSpecific.UTXOSpecific?
  get() = if (hasUtxoSpecific()) getUtxoSpecific() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.ethereumSpecificOrNull: vultisig.keysign.v1.BlockchainSpecific.EthereumSpecific?
  get() = if (hasEthereumSpecific()) getEthereumSpecific() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.thorchainSpecificOrNull: vultisig.keysign.v1.BlockchainSpecific.THORChainSpecific?
  get() = if (hasThorchainSpecific()) getThorchainSpecific() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.mayaSpecificOrNull: vultisig.keysign.v1.BlockchainSpecific.MAYAChainSpecific?
  get() = if (hasMayaSpecific()) getMayaSpecific() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.cosmosSpecificOrNull: vultisig.keysign.v1.BlockchainSpecific.CosmosSpecific?
  get() = if (hasCosmosSpecific()) getCosmosSpecific() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.solanaSpecificOrNull: vultisig.keysign.v1.BlockchainSpecific.SolanaSpecific?
  get() = if (hasSolanaSpecific()) getSolanaSpecific() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.polkadotSpecificOrNull: vultisig.keysign.v1.BlockchainSpecific.PolkadotSpecific?
  get() = if (hasPolkadotSpecific()) getPolkadotSpecific() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.suicheSpecificOrNull: vultisig.keysign.v1.BlockchainSpecific.SuiSpecific?
  get() = if (hasSuicheSpecific()) getSuicheSpecific() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.thorchainSwapPayloadOrNull: vultisig.keysign.v1.ThorchainSwapPayload.THORChainSwapPayload?
  get() = if (hasThorchainSwapPayload()) getThorchainSwapPayload() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.mayachainSwapPayloadOrNull: vultisig.keysign.v1.ThorchainSwapPayload.THORChainSwapPayload?
  get() = if (hasMayachainSwapPayload()) getMayachainSwapPayload() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.oneinchSwapPayloadOrNull: vultisig.keysign.v1.1InchSwapPayload.OneInchSwapPayload?
  get() = if (hasOneinchSwapPayload()) getOneinchSwapPayload() else null

public val vultisig.keysign.v1.KeysignMessageOuterClass.KeysignPayloadOrBuilder.erc20ApprovePayloadOrNull: vultisig.keysign.v1.Erc20ApprovePayloadOuterClass.Erc20ApprovePayload?
  get() = if (hasErc20ApprovePayload()) getErc20ApprovePayload() else null

