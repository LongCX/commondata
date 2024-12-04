// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: vultisig/keygen/v1/reshare_message.proto
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

public struct VSReshareMessage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var sessionID: String = String()

  public var hexChainCode: String = String()

  public var serviceName: String = String()

  public var publicKeyEcdsa: String = String()

  public var oldParties: [String] = []

  public var encryptionKeyHex: String = String()

  public var useVultisigRelay: Bool = false

  public var oldResharePrefix: String = String()

  public var vaultName: String = String()

  /// Default to GG20
  public var libType: VSLibType = .gg20

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension VSReshareMessage: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "vultisig.keygen.v1"

extension VSReshareMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ReshareMessage"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "session_id"),
    2: .standard(proto: "hex_chain_code"),
    3: .standard(proto: "service_name"),
    4: .standard(proto: "public_key_ecdsa"),
    5: .standard(proto: "old_parties"),
    6: .standard(proto: "encryption_key_hex"),
    7: .standard(proto: "use_vultisig_relay"),
    8: .standard(proto: "old_reshare_prefix"),
    9: .standard(proto: "vault_name"),
    20: .standard(proto: "lib_type"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sessionID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.hexChainCode) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.serviceName) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.publicKeyEcdsa) }()
      case 5: try { try decoder.decodeRepeatedStringField(value: &self.oldParties) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.encryptionKeyHex) }()
      case 7: try { try decoder.decodeSingularBoolField(value: &self.useVultisigRelay) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.oldResharePrefix) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.vaultName) }()
      case 20: try { try decoder.decodeSingularEnumField(value: &self.libType) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sessionID.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionID, fieldNumber: 1)
    }
    if !self.hexChainCode.isEmpty {
      try visitor.visitSingularStringField(value: self.hexChainCode, fieldNumber: 2)
    }
    if !self.serviceName.isEmpty {
      try visitor.visitSingularStringField(value: self.serviceName, fieldNumber: 3)
    }
    if !self.publicKeyEcdsa.isEmpty {
      try visitor.visitSingularStringField(value: self.publicKeyEcdsa, fieldNumber: 4)
    }
    if !self.oldParties.isEmpty {
      try visitor.visitRepeatedStringField(value: self.oldParties, fieldNumber: 5)
    }
    if !self.encryptionKeyHex.isEmpty {
      try visitor.visitSingularStringField(value: self.encryptionKeyHex, fieldNumber: 6)
    }
    if self.useVultisigRelay != false {
      try visitor.visitSingularBoolField(value: self.useVultisigRelay, fieldNumber: 7)
    }
    if !self.oldResharePrefix.isEmpty {
      try visitor.visitSingularStringField(value: self.oldResharePrefix, fieldNumber: 8)
    }
    if !self.vaultName.isEmpty {
      try visitor.visitSingularStringField(value: self.vaultName, fieldNumber: 9)
    }
    if self.libType != .gg20 {
      try visitor.visitSingularEnumField(value: self.libType, fieldNumber: 20)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: VSReshareMessage, rhs: VSReshareMessage) -> Bool {
    if lhs.sessionID != rhs.sessionID {return false}
    if lhs.hexChainCode != rhs.hexChainCode {return false}
    if lhs.serviceName != rhs.serviceName {return false}
    if lhs.publicKeyEcdsa != rhs.publicKeyEcdsa {return false}
    if lhs.oldParties != rhs.oldParties {return false}
    if lhs.encryptionKeyHex != rhs.encryptionKeyHex {return false}
    if lhs.useVultisigRelay != rhs.useVultisigRelay {return false}
    if lhs.oldResharePrefix != rhs.oldResharePrefix {return false}
    if lhs.vaultName != rhs.vaultName {return false}
    if lhs.libType != rhs.libType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
