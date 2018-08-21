package DessignPatten

interface Interceptor {
    fun intercept()

    interface chain {
        fun request(): String
        /**
         *
         * @return response
         * */
        fun proceed(request: String): String

        fun connect(): String
    }
}