/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

package io.grafeas.v1beta1.provenance;

public interface FileHashesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.provenance.FileHashes)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Hash file_hash = 1;</code>
   */
  java.util.List<io.grafeas.v1beta1.provenance.Hash> getFileHashList();
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Hash file_hash = 1;</code>
   */
  io.grafeas.v1beta1.provenance.Hash getFileHash(int index);
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Hash file_hash = 1;</code>
   */
  int getFileHashCount();
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Hash file_hash = 1;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.provenance.HashOrBuilder> getFileHashOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.provenance.Hash file_hash = 1;</code>
   */
  io.grafeas.v1beta1.provenance.HashOrBuilder getFileHashOrBuilder(int index);
}
