sealed class State {
    class Success(val data: String) : State()
    class Error(val message: String) : State()
}

