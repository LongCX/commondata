// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: vultisig/vault/v1/vault.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package vultisig.vault.v1;

@kotlin.jvm.JvmName("-initializevault")
public inline fun vault(block: vultisig.vault.v1.VaultKt.Dsl.() -> kotlin.Unit): vultisig.vault.v1.VaultOuterClass.Vault =
  vultisig.vault.v1.VaultKt.Dsl._create(vultisig.vault.v1.VaultOuterClass.Vault.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `vultisig.vault.v1.Vault`
 */
public object VaultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: vultisig.vault.v1.VaultOuterClass.Vault.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: vultisig.vault.v1.VaultOuterClass.Vault.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): vultisig.vault.v1.VaultOuterClass.Vault = _builder.build()

    /**
     * `string version = 1 [json_name = "version"];`
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * `string version = 1 [json_name = "version"];`
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * `.vultisig.vault.v1.Vault.VaultDetail vault = 2 [json_name = "vault"];`
     */
    public var vault: vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail
      @JvmName("getVault")
      get() = _builder.getVault()
      @JvmName("setVault")
      set(value) {
        _builder.setVault(value)
      }
    /**
     * `.vultisig.vault.v1.Vault.VaultDetail vault = 2 [json_name = "vault"];`
     */
    public fun clearVault() {
      _builder.clearVault()
    }
    /**
     * `.vultisig.vault.v1.Vault.VaultDetail vault = 2 [json_name = "vault"];`
     * @return Whether the vault field is set.
     */
    public fun hasVault(): kotlin.Boolean {
      return _builder.hasVault()
    }
    public val VaultKt.Dsl.vaultOrNull: vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail?
      get() = _builder.vaultOrNull

    /**
     * `bool password_protected = 3 [json_name = "passwordProtected"];`
     */
    public var passwordProtected: kotlin.Boolean
      @JvmName("getPasswordProtected")
      get() = _builder.getPasswordProtected()
      @JvmName("setPasswordProtected")
      set(value) {
        _builder.setPasswordProtected(value)
      }
    /**
     * `bool password_protected = 3 [json_name = "passwordProtected"];`
     */
    public fun clearPasswordProtected() {
      _builder.clearPasswordProtected()
    }
  }
  @kotlin.jvm.JvmName("-initializevaultDetail")
  public inline fun vaultDetail(block: vultisig.vault.v1.VaultKt.VaultDetailKt.Dsl.() -> kotlin.Unit): vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail =
    vultisig.vault.v1.VaultKt.VaultDetailKt.Dsl._create(vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail.newBuilder()).apply { block() }._build()
  /**
   * Protobuf type `vultisig.vault.v1.Vault.VaultDetail`
   */
  public object VaultDetailKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail = _builder.build()

      /**
       * `string name = 1 [json_name = "name"];`
       */
      public var name: kotlin.String
        @JvmName("getName")
        get() = _builder.getName()
        @JvmName("setName")
        set(value) {
          _builder.setName(value)
        }
      /**
       * `string name = 1 [json_name = "name"];`
       */
      public fun clearName() {
        _builder.clearName()
      }

      /**
       * `string publikc_key_ecdsa = 2 [json_name = "publikcKeyEcdsa"];`
       */
      public var publikcKeyEcdsa: kotlin.String
        @JvmName("getPublikcKeyEcdsa")
        get() = _builder.getPublikcKeyEcdsa()
        @JvmName("setPublikcKeyEcdsa")
        set(value) {
          _builder.setPublikcKeyEcdsa(value)
        }
      /**
       * `string publikc_key_ecdsa = 2 [json_name = "publikcKeyEcdsa"];`
       */
      public fun clearPublikcKeyEcdsa() {
        _builder.clearPublikcKeyEcdsa()
      }

      /**
       * `string public_key_eddsa = 3 [json_name = "publicKeyEddsa"];`
       */
      public var publicKeyEddsa: kotlin.String
        @JvmName("getPublicKeyEddsa")
        get() = _builder.getPublicKeyEddsa()
        @JvmName("setPublicKeyEddsa")
        set(value) {
          _builder.setPublicKeyEddsa(value)
        }
      /**
       * `string public_key_eddsa = 3 [json_name = "publicKeyEddsa"];`
       */
      public fun clearPublicKeyEddsa() {
        _builder.clearPublicKeyEddsa()
      }

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class SignersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * `repeated string signers = 4 [json_name = "signers"];`
       * @return A list containing the signers.
       */
      public val signers: com.google.protobuf.kotlin.DslList<kotlin.String, SignersProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getSignersList()
        )
      /**
       * `repeated string signers = 4 [json_name = "signers"];`
       * @param value The signers to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addSigners")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, SignersProxy>.add(value: kotlin.String) {
        _builder.addSigners(value)
      }
      /**
       * `repeated string signers = 4 [json_name = "signers"];`
       * @param value The signers to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignSigners")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SignersProxy>.plusAssign(value: kotlin.String) {
        add(value)
      }
      /**
       * `repeated string signers = 4 [json_name = "signers"];`
       * @param values The signers to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllSigners")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, SignersProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
        _builder.addAllSigners(values)
      }
      /**
       * `repeated string signers = 4 [json_name = "signers"];`
       * @param values The signers to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllSigners")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SignersProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
        addAll(values)
      }
      /**
       * `repeated string signers = 4 [json_name = "signers"];`
       * @param index The index to set the value at.
       * @param value The signers to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setSigners")
      public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SignersProxy>.set(index: kotlin.Int, value: kotlin.String) {
        _builder.setSigners(index, value)
      }/**
       * `repeated string signers = 4 [json_name = "signers"];`
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearSigners")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, SignersProxy>.clear() {
        _builder.clearSigners()
      }
      /**
       * `.google.protobuf.Timestamp created_at = 5 [json_name = "createdAt"];`
       */
      public var createdAt: com.google.protobuf.Timestamp
        @JvmName("getCreatedAt")
        get() = _builder.getCreatedAt()
        @JvmName("setCreatedAt")
        set(value) {
          _builder.setCreatedAt(value)
        }
      /**
       * `.google.protobuf.Timestamp created_at = 5 [json_name = "createdAt"];`
       */
      public fun clearCreatedAt() {
        _builder.clearCreatedAt()
      }
      /**
       * `.google.protobuf.Timestamp created_at = 5 [json_name = "createdAt"];`
       * @return Whether the createdAt field is set.
       */
      public fun hasCreatedAt(): kotlin.Boolean {
        return _builder.hasCreatedAt()
      }
      public val VaultDetailKt.Dsl.createdAtOrNull: com.google.protobuf.Timestamp?
        get() = _builder.createdAtOrNull

      /**
       * `string hex_chain_code = 6 [json_name = "hexChainCode"];`
       */
      public var hexChainCode: kotlin.String
        @JvmName("getHexChainCode")
        get() = _builder.getHexChainCode()
        @JvmName("setHexChainCode")
        set(value) {
          _builder.setHexChainCode(value)
        }
      /**
       * `string hex_chain_code = 6 [json_name = "hexChainCode"];`
       */
      public fun clearHexChainCode() {
        _builder.clearHexChainCode()
      }

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class KeySharesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * `repeated .vultisig.vault.v1.Vault.KeyShare key_shares = 7 [json_name = "keyShares"];`
       */
       public val keyShares: com.google.protobuf.kotlin.DslList<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare, KeySharesProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getKeySharesList()
        )
      /**
       * `repeated .vultisig.vault.v1.Vault.KeyShare key_shares = 7 [json_name = "keyShares"];`
       * @param value The keyShares to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addKeyShares")
      public fun com.google.protobuf.kotlin.DslList<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare, KeySharesProxy>.add(value: vultisig.vault.v1.VaultOuterClass.Vault.KeyShare) {
        _builder.addKeyShares(value)
      }
      /**
       * `repeated .vultisig.vault.v1.Vault.KeyShare key_shares = 7 [json_name = "keyShares"];`
       * @param value The keyShares to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignKeyShares")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare, KeySharesProxy>.plusAssign(value: vultisig.vault.v1.VaultOuterClass.Vault.KeyShare) {
        add(value)
      }
      /**
       * `repeated .vultisig.vault.v1.Vault.KeyShare key_shares = 7 [json_name = "keyShares"];`
       * @param values The keyShares to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllKeyShares")
      public fun com.google.protobuf.kotlin.DslList<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare, KeySharesProxy>.addAll(values: kotlin.collections.Iterable<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare>) {
        _builder.addAllKeyShares(values)
      }
      /**
       * `repeated .vultisig.vault.v1.Vault.KeyShare key_shares = 7 [json_name = "keyShares"];`
       * @param values The keyShares to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllKeyShares")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare, KeySharesProxy>.plusAssign(values: kotlin.collections.Iterable<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare>) {
        addAll(values)
      }
      /**
       * `repeated .vultisig.vault.v1.Vault.KeyShare key_shares = 7 [json_name = "keyShares"];`
       * @param index The index to set the value at.
       * @param value The keyShares to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setKeyShares")
      public operator fun com.google.protobuf.kotlin.DslList<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare, KeySharesProxy>.set(index: kotlin.Int, value: vultisig.vault.v1.VaultOuterClass.Vault.KeyShare) {
        _builder.setKeyShares(index, value)
      }
      /**
       * `repeated .vultisig.vault.v1.Vault.KeyShare key_shares = 7 [json_name = "keyShares"];`
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearKeyShares")
      public fun com.google.protobuf.kotlin.DslList<vultisig.vault.v1.VaultOuterClass.Vault.KeyShare, KeySharesProxy>.clear() {
        _builder.clearKeyShares()
      }


      /**
       * `string local_party_id = 8 [json_name = "localPartyId"];`
       */
      public var localPartyId: kotlin.String
        @JvmName("getLocalPartyId")
        get() = _builder.getLocalPartyId()
        @JvmName("setLocalPartyId")
        set(value) {
          _builder.setLocalPartyId(value)
        }
      /**
       * `string local_party_id = 8 [json_name = "localPartyId"];`
       */
      public fun clearLocalPartyId() {
        _builder.clearLocalPartyId()
      }

      /**
       * `string reshare_prefix = 9 [json_name = "resharePrefix"];`
       */
      public var resharePrefix: kotlin.String
        @JvmName("getResharePrefix")
        get() = _builder.getResharePrefix()
        @JvmName("setResharePrefix")
        set(value) {
          _builder.setResharePrefix(value)
        }
      /**
       * `string reshare_prefix = 9 [json_name = "resharePrefix"];`
       */
      public fun clearResharePrefix() {
        _builder.clearResharePrefix()
      }

      /**
       * `int64 order = 10 [json_name = "order"];`
       */
      public var order: kotlin.Long
        @JvmName("getOrder")
        get() = _builder.getOrder()
        @JvmName("setOrder")
        set(value) {
          _builder.setOrder(value)
        }
      /**
       * `int64 order = 10 [json_name = "order"];`
       */
      public fun clearOrder() {
        _builder.clearOrder()
      }
    }
  }
  @kotlin.jvm.JvmName("-initializekeyShare")
  public inline fun keyShare(block: vultisig.vault.v1.VaultKt.KeyShareKt.Dsl.() -> kotlin.Unit): vultisig.vault.v1.VaultOuterClass.Vault.KeyShare =
    vultisig.vault.v1.VaultKt.KeyShareKt.Dsl._create(vultisig.vault.v1.VaultOuterClass.Vault.KeyShare.newBuilder()).apply { block() }._build()
  /**
   * Protobuf type `vultisig.vault.v1.Vault.KeyShare`
   */
  public object KeyShareKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: vultisig.vault.v1.VaultOuterClass.Vault.KeyShare.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: vultisig.vault.v1.VaultOuterClass.Vault.KeyShare.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): vultisig.vault.v1.VaultOuterClass.Vault.KeyShare = _builder.build()

      /**
       * `string public_key = 1 [json_name = "publicKey"];`
       */
      public var publicKey: kotlin.String
        @JvmName("getPublicKey")
        get() = _builder.getPublicKey()
        @JvmName("setPublicKey")
        set(value) {
          _builder.setPublicKey(value)
        }
      /**
       * `string public_key = 1 [json_name = "publicKey"];`
       */
      public fun clearPublicKey() {
        _builder.clearPublicKey()
      }

      /**
       * `string keyshare = 2 [json_name = "keyshare"];`
       */
      public var keyshare: kotlin.String
        @JvmName("getKeyshare")
        get() = _builder.getKeyshare()
        @JvmName("setKeyshare")
        set(value) {
          _builder.setKeyshare(value)
        }
      /**
       * `string keyshare = 2 [json_name = "keyshare"];`
       */
      public fun clearKeyshare() {
        _builder.clearKeyshare()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun vultisig.vault.v1.VaultOuterClass.Vault.copy(block: `vultisig.vault.v1`.VaultKt.Dsl.() -> kotlin.Unit): vultisig.vault.v1.VaultOuterClass.Vault =
  `vultisig.vault.v1`.VaultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail.copy(block: `vultisig.vault.v1`.VaultKt.VaultDetailKt.Dsl.() -> kotlin.Unit): vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail =
  `vultisig.vault.v1`.VaultKt.VaultDetailKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val vultisig.vault.v1.VaultOuterClass.Vault.VaultDetailOrBuilder.createdAtOrNull: com.google.protobuf.Timestamp?
  get() = if (hasCreatedAt()) getCreatedAt() else null

@kotlin.jvm.JvmSynthetic
public inline fun vultisig.vault.v1.VaultOuterClass.Vault.KeyShare.copy(block: `vultisig.vault.v1`.VaultKt.KeyShareKt.Dsl.() -> kotlin.Unit): vultisig.vault.v1.VaultOuterClass.Vault.KeyShare =
  `vultisig.vault.v1`.VaultKt.KeyShareKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val vultisig.vault.v1.VaultOuterClass.VaultOrBuilder.vaultOrNull: vultisig.vault.v1.VaultOuterClass.Vault.VaultDetail?
  get() = if (hasVault()) getVault() else null

