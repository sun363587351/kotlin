// "Create type parameter 'Test' in class 'C'" "false"
// ACTION: Add 'testng' to classpath
// ACTION: Create class 'Test'
// ACTION: Create test
class C : <caret>Test() {

}