package org.elasticmq.rest.sqs

object Action extends Enumeration {
  val AddPermission = Value("AddPermission")
  val ChangeMessageVisibilityBatch = Value("ChangeMessageVisibilityBatch")
  val ChangeMessageVisibility = Value("ChangeMessageVisibility")
  val CreateQueue = Value("CreateQueue")
  val DeleteMessageBatch = Value("DeleteMessageBatch")
  val DeleteMessage = Value("DeleteMessage")
  val DeleteQueue = Value("DeleteQueue")
  val GetQueueUrl = Value("GetQueueUrl")
  val ListQueueTags = Value("ListQueueTags")
  val ListQueues = Value("ListQueues")
  val PurgeQueue = Value("PurgeQueue")
  val GetQueueAttributes = Value("GetQueueAttributes")
  val SetQueueAttributes = Value("SetQueueAttributes")
  val ReceiveMessage = Value("ReceiveMessage")
  val SendMessageBatch = Value("SendMessageBatch")
  val SendMessage = Value("SendMessage")
  val TagQueue = Value("TagQueue")
  val UntagQueue = Value("UntagQueue")
}