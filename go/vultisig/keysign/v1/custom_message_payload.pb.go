// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.2
// 	protoc        (unknown)
// source: vultisig/keysign/v1/custom_message_payload.proto

package v1

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type CustomMessagePayload struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Method  string `protobuf:"bytes,1,opt,name=method,proto3" json:"method,omitempty"`
	Message string `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
}

func (x *CustomMessagePayload) Reset() {
	*x = CustomMessagePayload{}
	if protoimpl.UnsafeEnabled {
		mi := &file_vultisig_keysign_v1_custom_message_payload_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CustomMessagePayload) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CustomMessagePayload) ProtoMessage() {}

func (x *CustomMessagePayload) ProtoReflect() protoreflect.Message {
	mi := &file_vultisig_keysign_v1_custom_message_payload_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CustomMessagePayload.ProtoReflect.Descriptor instead.
func (*CustomMessagePayload) Descriptor() ([]byte, []int) {
	return file_vultisig_keysign_v1_custom_message_payload_proto_rawDescGZIP(), []int{0}
}

func (x *CustomMessagePayload) GetMethod() string {
	if x != nil {
		return x.Method
	}
	return ""
}

func (x *CustomMessagePayload) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

var File_vultisig_keysign_v1_custom_message_payload_proto protoreflect.FileDescriptor

var file_vultisig_keysign_v1_custom_message_payload_proto_rawDesc = []byte{
	0x0a, 0x30, 0x76, 0x75, 0x6c, 0x74, 0x69, 0x73, 0x69, 0x67, 0x2f, 0x6b, 0x65, 0x79, 0x73, 0x69,
	0x67, 0x6e, 0x2f, 0x76, 0x31, 0x2f, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x5f, 0x6d, 0x65, 0x73,
	0x73, 0x61, 0x67, 0x65, 0x5f, 0x70, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x13, 0x76, 0x75, 0x6c, 0x74, 0x69, 0x73, 0x69, 0x67, 0x2e, 0x6b, 0x65, 0x79,
	0x73, 0x69, 0x67, 0x6e, 0x2e, 0x76, 0x31, 0x22, 0x48, 0x0a, 0x14, 0x43, 0x75, 0x73, 0x74, 0x6f,
	0x6d, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x12,
	0x16, 0x0a, 0x06, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x06, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x12, 0x18, 0x0a, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61,
	0x67, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67,
	0x65, 0x42, 0x2f, 0x0a, 0x13, 0x76, 0x75, 0x6c, 0x74, 0x69, 0x73, 0x69, 0x67, 0x2e, 0x6b, 0x65,
	0x79, 0x73, 0x69, 0x67, 0x6e, 0x2e, 0x76, 0x31, 0x5a, 0x13, 0x76, 0x75, 0x6c, 0x74, 0x69, 0x73,
	0x69, 0x67, 0x2f, 0x6b, 0x65, 0x79, 0x73, 0x69, 0x67, 0x6e, 0x2f, 0x76, 0x31, 0xba, 0x02, 0x02,
	0x56, 0x53, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_vultisig_keysign_v1_custom_message_payload_proto_rawDescOnce sync.Once
	file_vultisig_keysign_v1_custom_message_payload_proto_rawDescData = file_vultisig_keysign_v1_custom_message_payload_proto_rawDesc
)

func file_vultisig_keysign_v1_custom_message_payload_proto_rawDescGZIP() []byte {
	file_vultisig_keysign_v1_custom_message_payload_proto_rawDescOnce.Do(func() {
		file_vultisig_keysign_v1_custom_message_payload_proto_rawDescData = protoimpl.X.CompressGZIP(file_vultisig_keysign_v1_custom_message_payload_proto_rawDescData)
	})
	return file_vultisig_keysign_v1_custom_message_payload_proto_rawDescData
}

var file_vultisig_keysign_v1_custom_message_payload_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_vultisig_keysign_v1_custom_message_payload_proto_goTypes = []any{
	(*CustomMessagePayload)(nil), // 0: vultisig.keysign.v1.CustomMessagePayload
}
var file_vultisig_keysign_v1_custom_message_payload_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_vultisig_keysign_v1_custom_message_payload_proto_init() }
func file_vultisig_keysign_v1_custom_message_payload_proto_init() {
	if File_vultisig_keysign_v1_custom_message_payload_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_vultisig_keysign_v1_custom_message_payload_proto_msgTypes[0].Exporter = func(v any, i int) any {
			switch v := v.(*CustomMessagePayload); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_vultisig_keysign_v1_custom_message_payload_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_vultisig_keysign_v1_custom_message_payload_proto_goTypes,
		DependencyIndexes: file_vultisig_keysign_v1_custom_message_payload_proto_depIdxs,
		MessageInfos:      file_vultisig_keysign_v1_custom_message_payload_proto_msgTypes,
	}.Build()
	File_vultisig_keysign_v1_custom_message_payload_proto = out.File
	file_vultisig_keysign_v1_custom_message_payload_proto_rawDesc = nil
	file_vultisig_keysign_v1_custom_message_payload_proto_goTypes = nil
	file_vultisig_keysign_v1_custom_message_payload_proto_depIdxs = nil
}
