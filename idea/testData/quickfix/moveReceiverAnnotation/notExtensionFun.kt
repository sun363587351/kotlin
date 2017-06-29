// "Move annotation to receiver type" "false"
// ERROR: '@receiver:' annotations could be applied only to extension function or extension property declarations
// ACTION: Make internal
// ACTION: Make private

annotation class Ann

@receiver:Ann<caret>
fun foo() {
}