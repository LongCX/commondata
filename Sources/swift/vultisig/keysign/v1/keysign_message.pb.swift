// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: vultisig/keysign/v1/keysign_message.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

public struct VSKeysignMessage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var sessionID: String = String()

  public var serviceName: String = String()

  public var encryptionKeyHex: String = String()

  public var keysignPayload: VSKeysignPayload {
    get {return _keysignPayload ?? VSKeysignPayload()}
    set {_keysignPayload = newValue}
  }
  /// Returns true if `keysignPayload` has been explicitly set.
  public var hasKeysignPayload: Bool {return self._keysignPayload != nil}
  /// Clears the value of `keysignPayload`. Subsequent reads from it will return its default value.
  public mutating func clearKeysignPayload() {self._keysignPayload = nil}

  public var useVultisigRelay: Bool = false

  public var payloadID: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _keysignPayload: VSKeysignPayload? = nil
}

public struct VSKeysignPayload {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var coin: VSCoin {
    get {return _storage._coin ?? VSCoin()}
    set {_uniqueStorage()._coin = newValue}
  }
  /// Returns true if `coin` has been explicitly set.
  public var hasCoin: Bool {return _storage._coin != nil}
  /// Clears the value of `coin`. Subsequent reads from it will return its default value.
  public mutating func clearCoin() {_uniqueStorage()._coin = nil}

  public var toAddress: String {
    get {return _storage._toAddress}
    set {_uniqueStorage()._toAddress = newValue}
  }

  public var toAmount: String {
    get {return _storage._toAmount}
    set {_uniqueStorage()._toAmount = newValue}
  }

  public var blockchainSpecific: OneOf_BlockchainSpecific? {
    get {return _storage._blockchainSpecific}
    set {_uniqueStorage()._blockchainSpecific = newValue}
  }

  public var utxoSpecific: VSUTXOSpecific {
    get {
      if case .utxoSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSUTXOSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .utxoSpecific(newValue)}
  }

  public var ethereumSpecific: VSEthereumSpecific {
    get {
      if case .ethereumSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSEthereumSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .ethereumSpecific(newValue)}
  }

  public var thorchainSpecific: VSTHORChainSpecific {
    get {
      if case .thorchainSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSTHORChainSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .thorchainSpecific(newValue)}
  }

  public var mayaSpecific: VSMAYAChainSpecific {
    get {
      if case .mayaSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSMAYAChainSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .mayaSpecific(newValue)}
  }

  public var cosmosSpecific: VSCosmosSpecific {
    get {
      if case .cosmosSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSCosmosSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .cosmosSpecific(newValue)}
  }

  public var solanaSpecific: VSSolanaSpecific {
    get {
      if case .solanaSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSSolanaSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .solanaSpecific(newValue)}
  }

  public var polkadotSpecific: VSPolkadotSpecific {
    get {
      if case .polkadotSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSPolkadotSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .polkadotSpecific(newValue)}
  }

  public var suicheSpecific: VSSuiSpecific {
    get {
      if case .suicheSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSSuiSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .suicheSpecific(newValue)}
  }

  public var tonSpecific: VSTonSpecific {
    get {
      if case .tonSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSTonSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .tonSpecific(newValue)}
  }

  public var rippleSpecific: VSRippleSpecific {
    get {
      if case .rippleSpecific(let v)? = _storage._blockchainSpecific {return v}
      return VSRippleSpecific()
    }
    set {_uniqueStorage()._blockchainSpecific = .rippleSpecific(newValue)}
  }

  public var utxoInfo: [VSUtxoInfo] {
    get {return _storage._utxoInfo}
    set {_uniqueStorage()._utxoInfo = newValue}
  }

  public var memo: String {
    get {return _storage._memo ?? String()}
    set {_uniqueStorage()._memo = newValue}
  }
  /// Returns true if `memo` has been explicitly set.
  public var hasMemo: Bool {return _storage._memo != nil}
  /// Clears the value of `memo`. Subsequent reads from it will return its default value.
  public mutating func clearMemo() {_uniqueStorage()._memo = nil}

  public var swapPayload: OneOf_SwapPayload? {
    get {return _storage._swapPayload}
    set {_uniqueStorage()._swapPayload = newValue}
  }

  public var thorchainSwapPayload: VSTHORChainSwapPayload {
    get {
      if case .thorchainSwapPayload(let v)? = _storage._swapPayload {return v}
      return VSTHORChainSwapPayload()
    }
    set {_uniqueStorage()._swapPayload = .thorchainSwapPayload(newValue)}
  }

  public var mayachainSwapPayload: VSTHORChainSwapPayload {
    get {
      if case .mayachainSwapPayload(let v)? = _storage._swapPayload {return v}
      return VSTHORChainSwapPayload()
    }
    set {_uniqueStorage()._swapPayload = .mayachainSwapPayload(newValue)}
  }

  public var oneinchSwapPayload: VSOneInchSwapPayload {
    get {
      if case .oneinchSwapPayload(let v)? = _storage._swapPayload {return v}
      return VSOneInchSwapPayload()
    }
    set {_uniqueStorage()._swapPayload = .oneinchSwapPayload(newValue)}
  }

  public var erc20ApprovePayload: VSErc20ApprovePayload {
    get {return _storage._erc20ApprovePayload ?? VSErc20ApprovePayload()}
    set {_uniqueStorage()._erc20ApprovePayload = newValue}
  }
  /// Returns true if `erc20ApprovePayload` has been explicitly set.
  public var hasErc20ApprovePayload: Bool {return _storage._erc20ApprovePayload != nil}
  /// Clears the value of `erc20ApprovePayload`. Subsequent reads from it will return its default value.
  public mutating func clearErc20ApprovePayload() {_uniqueStorage()._erc20ApprovePayload = nil}

  public var vaultPublicKeyEcdsa: String {
    get {return _storage._vaultPublicKeyEcdsa}
    set {_uniqueStorage()._vaultPublicKeyEcdsa = newValue}
  }

  public var vaultLocalPartyID: String {
    get {return _storage._vaultLocalPartyID}
    set {_uniqueStorage()._vaultLocalPartyID = newValue}
  }

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public enum OneOf_BlockchainSpecific: Equatable {
    case utxoSpecific(VSUTXOSpecific)
    case ethereumSpecific(VSEthereumSpecific)
    case thorchainSpecific(VSTHORChainSpecific)
    case mayaSpecific(VSMAYAChainSpecific)
    case cosmosSpecific(VSCosmosSpecific)
    case solanaSpecific(VSSolanaSpecific)
    case polkadotSpecific(VSPolkadotSpecific)
    case suicheSpecific(VSSuiSpecific)
    case tonSpecific(VSTonSpecific)
    case rippleSpecific(VSRippleSpecific)

  #if !swift(>=4.1)
    public static func ==(lhs: VSKeysignPayload.OneOf_BlockchainSpecific, rhs: VSKeysignPayload.OneOf_BlockchainSpecific) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.utxoSpecific, .utxoSpecific): return {
        guard case .utxoSpecific(let l) = lhs, case .utxoSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.ethereumSpecific, .ethereumSpecific): return {
        guard case .ethereumSpecific(let l) = lhs, case .ethereumSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.thorchainSpecific, .thorchainSpecific): return {
        guard case .thorchainSpecific(let l) = lhs, case .thorchainSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.mayaSpecific, .mayaSpecific): return {
        guard case .mayaSpecific(let l) = lhs, case .mayaSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.cosmosSpecific, .cosmosSpecific): return {
        guard case .cosmosSpecific(let l) = lhs, case .cosmosSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.solanaSpecific, .solanaSpecific): return {
        guard case .solanaSpecific(let l) = lhs, case .solanaSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.polkadotSpecific, .polkadotSpecific): return {
        guard case .polkadotSpecific(let l) = lhs, case .polkadotSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.suicheSpecific, .suicheSpecific): return {
        guard case .suicheSpecific(let l) = lhs, case .suicheSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.tonSpecific, .tonSpecific): return {
        guard case .tonSpecific(let l) = lhs, case .tonSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.rippleSpecific, .rippleSpecific): return {
        guard case .rippleSpecific(let l) = lhs, case .rippleSpecific(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  public enum OneOf_SwapPayload: Equatable {
    case thorchainSwapPayload(VSTHORChainSwapPayload)
    case mayachainSwapPayload(VSTHORChainSwapPayload)
    case oneinchSwapPayload(VSOneInchSwapPayload)

  #if !swift(>=4.1)
    public static func ==(lhs: VSKeysignPayload.OneOf_SwapPayload, rhs: VSKeysignPayload.OneOf_SwapPayload) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.thorchainSwapPayload, .thorchainSwapPayload): return {
        guard case .thorchainSwapPayload(let l) = lhs, case .thorchainSwapPayload(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.mayachainSwapPayload, .mayachainSwapPayload): return {
        guard case .mayachainSwapPayload(let l) = lhs, case .mayachainSwapPayload(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.oneinchSwapPayload, .oneinchSwapPayload): return {
        guard case .oneinchSwapPayload(let l) = lhs, case .oneinchSwapPayload(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension VSKeysignMessage: @unchecked Sendable {}
extension VSKeysignPayload: @unchecked Sendable {}
extension VSKeysignPayload.OneOf_BlockchainSpecific: @unchecked Sendable {}
extension VSKeysignPayload.OneOf_SwapPayload: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "vultisig.keysign.v1"

extension VSKeysignMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".KeysignMessage"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "session_id"),
    2: .standard(proto: "service_name"),
    4: .standard(proto: "encryption_key_hex"),
    5: .standard(proto: "keysign_payload"),
    6: .standard(proto: "use_vultisig_relay"),
    7: .standard(proto: "payload_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sessionID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.serviceName) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.encryptionKeyHex) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._keysignPayload) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.useVultisigRelay) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.payloadID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.sessionID.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionID, fieldNumber: 1)
    }
    if !self.serviceName.isEmpty {
      try visitor.visitSingularStringField(value: self.serviceName, fieldNumber: 2)
    }
    if !self.encryptionKeyHex.isEmpty {
      try visitor.visitSingularStringField(value: self.encryptionKeyHex, fieldNumber: 4)
    }
    try { if let v = self._keysignPayload {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if self.useVultisigRelay != false {
      try visitor.visitSingularBoolField(value: self.useVultisigRelay, fieldNumber: 6)
    }
    if !self.payloadID.isEmpty {
      try visitor.visitSingularStringField(value: self.payloadID, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: VSKeysignMessage, rhs: VSKeysignMessage) -> Bool {
    if lhs.sessionID != rhs.sessionID {return false}
    if lhs.serviceName != rhs.serviceName {return false}
    if lhs.encryptionKeyHex != rhs.encryptionKeyHex {return false}
    if lhs._keysignPayload != rhs._keysignPayload {return false}
    if lhs.useVultisigRelay != rhs.useVultisigRelay {return false}
    if lhs.payloadID != rhs.payloadID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension VSKeysignPayload: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".KeysignPayload"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "coin"),
    2: .standard(proto: "to_address"),
    3: .standard(proto: "to_amount"),
    4: .standard(proto: "utxo_specific"),
    5: .standard(proto: "ethereum_specific"),
    6: .standard(proto: "thorchain_specific"),
    7: .standard(proto: "maya_specific"),
    8: .standard(proto: "cosmos_specific"),
    9: .standard(proto: "solana_specific"),
    10: .standard(proto: "polkadot_specific"),
    11: .standard(proto: "suiche_specific"),
    12: .standard(proto: "ton_specific"),
    13: .standard(proto: "ripple_specific"),
    20: .standard(proto: "utxo_info"),
    21: .same(proto: "memo"),
    22: .standard(proto: "thorchain_swap_payload"),
    23: .standard(proto: "mayachain_swap_payload"),
    24: .standard(proto: "oneinch_swap_payload"),
    30: .standard(proto: "erc20_approve_payload"),
    31: .standard(proto: "vault_public_key_ecdsa"),
    32: .standard(proto: "vault_local_party_id"),
  ]

  fileprivate class _StorageClass {
    var _coin: VSCoin? = nil
    var _toAddress: String = String()
    var _toAmount: String = String()
    var _blockchainSpecific: VSKeysignPayload.OneOf_BlockchainSpecific?
    var _utxoInfo: [VSUtxoInfo] = []
    var _memo: String? = nil
    var _swapPayload: VSKeysignPayload.OneOf_SwapPayload?
    var _erc20ApprovePayload: VSErc20ApprovePayload? = nil
    var _vaultPublicKeyEcdsa: String = String()
    var _vaultLocalPartyID: String = String()

    #if swift(>=5.10)
      // This property is used as the initial default value for new instances of the type.
      // The type itself is protecting the reference to its storage via CoW semantics.
      // This will force a copy to be made of this reference when the first mutation occurs;
      // hence, it is safe to mark this as `nonisolated(unsafe)`.
      static nonisolated(unsafe) let defaultInstance = _StorageClass()
    #else
      static let defaultInstance = _StorageClass()
    #endif

    private init() {}

    init(copying source: _StorageClass) {
      _coin = source._coin
      _toAddress = source._toAddress
      _toAmount = source._toAmount
      _blockchainSpecific = source._blockchainSpecific
      _utxoInfo = source._utxoInfo
      _memo = source._memo
      _swapPayload = source._swapPayload
      _erc20ApprovePayload = source._erc20ApprovePayload
      _vaultPublicKeyEcdsa = source._vaultPublicKeyEcdsa
      _vaultLocalPartyID = source._vaultLocalPartyID
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._coin) }()
        case 2: try { try decoder.decodeSingularStringField(value: &_storage._toAddress) }()
        case 3: try { try decoder.decodeSingularStringField(value: &_storage._toAmount) }()
        case 4: try {
          var v: VSUTXOSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .utxoSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .utxoSpecific(v)
          }
        }()
        case 5: try {
          var v: VSEthereumSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .ethereumSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .ethereumSpecific(v)
          }
        }()
        case 6: try {
          var v: VSTHORChainSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .thorchainSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .thorchainSpecific(v)
          }
        }()
        case 7: try {
          var v: VSMAYAChainSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .mayaSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .mayaSpecific(v)
          }
        }()
        case 8: try {
          var v: VSCosmosSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .cosmosSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .cosmosSpecific(v)
          }
        }()
        case 9: try {
          var v: VSSolanaSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .solanaSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .solanaSpecific(v)
          }
        }()
        case 10: try {
          var v: VSPolkadotSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .polkadotSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .polkadotSpecific(v)
          }
        }()
        case 11: try {
          var v: VSSuiSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .suicheSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .suicheSpecific(v)
          }
        }()
        case 12: try {
          var v: VSTonSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .tonSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .tonSpecific(v)
          }
        }()
        case 13: try {
          var v: VSRippleSpecific?
          var hadOneofValue = false
          if let current = _storage._blockchainSpecific {
            hadOneofValue = true
            if case .rippleSpecific(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._blockchainSpecific = .rippleSpecific(v)
          }
        }()
        case 20: try { try decoder.decodeRepeatedMessageField(value: &_storage._utxoInfo) }()
        case 21: try { try decoder.decodeSingularStringField(value: &_storage._memo) }()
        case 22: try {
          var v: VSTHORChainSwapPayload?
          var hadOneofValue = false
          if let current = _storage._swapPayload {
            hadOneofValue = true
            if case .thorchainSwapPayload(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._swapPayload = .thorchainSwapPayload(v)
          }
        }()
        case 23: try {
          var v: VSTHORChainSwapPayload?
          var hadOneofValue = false
          if let current = _storage._swapPayload {
            hadOneofValue = true
            if case .mayachainSwapPayload(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._swapPayload = .mayachainSwapPayload(v)
          }
        }()
        case 24: try {
          var v: VSOneInchSwapPayload?
          var hadOneofValue = false
          if let current = _storage._swapPayload {
            hadOneofValue = true
            if case .oneinchSwapPayload(let m) = current {v = m}
          }
          try decoder.decodeSingularMessageField(value: &v)
          if let v = v {
            if hadOneofValue {try decoder.handleConflictingOneOf()}
            _storage._swapPayload = .oneinchSwapPayload(v)
          }
        }()
        case 30: try { try decoder.decodeSingularMessageField(value: &_storage._erc20ApprovePayload) }()
        case 31: try { try decoder.decodeSingularStringField(value: &_storage._vaultPublicKeyEcdsa) }()
        case 32: try { try decoder.decodeSingularStringField(value: &_storage._vaultLocalPartyID) }()
        default: break
        }
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      try { if let v = _storage._coin {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      if !_storage._toAddress.isEmpty {
        try visitor.visitSingularStringField(value: _storage._toAddress, fieldNumber: 2)
      }
      if !_storage._toAmount.isEmpty {
        try visitor.visitSingularStringField(value: _storage._toAmount, fieldNumber: 3)
      }
      switch _storage._blockchainSpecific {
      case .utxoSpecific?: try {
        guard case .utxoSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      }()
      case .ethereumSpecific?: try {
        guard case .ethereumSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      }()
      case .thorchainSpecific?: try {
        guard case .thorchainSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      }()
      case .mayaSpecific?: try {
        guard case .mayaSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
      }()
      case .cosmosSpecific?: try {
        guard case .cosmosSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
      }()
      case .solanaSpecific?: try {
        guard case .solanaSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 9)
      }()
      case .polkadotSpecific?: try {
        guard case .polkadotSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 10)
      }()
      case .suicheSpecific?: try {
        guard case .suicheSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 11)
      }()
      case .tonSpecific?: try {
        guard case .tonSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 12)
      }()
      case .rippleSpecific?: try {
        guard case .rippleSpecific(let v)? = _storage._blockchainSpecific else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 13)
      }()
      case nil: break
      }
      if !_storage._utxoInfo.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._utxoInfo, fieldNumber: 20)
      }
      try { if let v = _storage._memo {
        try visitor.visitSingularStringField(value: v, fieldNumber: 21)
      } }()
      switch _storage._swapPayload {
      case .thorchainSwapPayload?: try {
        guard case .thorchainSwapPayload(let v)? = _storage._swapPayload else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 22)
      }()
      case .mayachainSwapPayload?: try {
        guard case .mayachainSwapPayload(let v)? = _storage._swapPayload else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 23)
      }()
      case .oneinchSwapPayload?: try {
        guard case .oneinchSwapPayload(let v)? = _storage._swapPayload else { preconditionFailure() }
        try visitor.visitSingularMessageField(value: v, fieldNumber: 24)
      }()
      case nil: break
      }
      try { if let v = _storage._erc20ApprovePayload {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 30)
      } }()
      if !_storage._vaultPublicKeyEcdsa.isEmpty {
        try visitor.visitSingularStringField(value: _storage._vaultPublicKeyEcdsa, fieldNumber: 31)
      }
      if !_storage._vaultLocalPartyID.isEmpty {
        try visitor.visitSingularStringField(value: _storage._vaultLocalPartyID, fieldNumber: 32)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: VSKeysignPayload, rhs: VSKeysignPayload) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._coin != rhs_storage._coin {return false}
        if _storage._toAddress != rhs_storage._toAddress {return false}
        if _storage._toAmount != rhs_storage._toAmount {return false}
        if _storage._blockchainSpecific != rhs_storage._blockchainSpecific {return false}
        if _storage._utxoInfo != rhs_storage._utxoInfo {return false}
        if _storage._memo != rhs_storage._memo {return false}
        if _storage._swapPayload != rhs_storage._swapPayload {return false}
        if _storage._erc20ApprovePayload != rhs_storage._erc20ApprovePayload {return false}
        if _storage._vaultPublicKeyEcdsa != rhs_storage._vaultPublicKeyEcdsa {return false}
        if _storage._vaultLocalPartyID != rhs_storage._vaultLocalPartyID {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
