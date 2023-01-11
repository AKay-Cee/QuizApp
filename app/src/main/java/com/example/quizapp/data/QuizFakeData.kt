package com.example.quizapp.data



import com.example.quizapp.Constant.IS_CHECK_BOX
import com.example.quizapp.Constant.IS_RADIO_BUTTON

class QuizFakeData {

    companion object {
        fun getQuizQuestions(): MutableList<Quiz> {
            return mutableListOf(
                Quiz(
                    1,
                    "1. The services in android can be stopped using which of the following method?",
                    IS_RADIO_BUTTON,
                    "stopSelf() and stopService() method can be used to stop services in android.",
                    "b",
                    "",
                    mutableListOf("system.exit() method","stopSelf() and  stopService() method", "finish() method", "end() method")
                ),
                Quiz(
                    2,
                    "2. Activity in Android can be killed using?",
                    IS_RADIO_BUTTON,
                    "Activity in Android can be killed using both finishActivity (int requestCode) and finish() method.",
                    "d",
                    "",
                    mutableListOf("finishActivity(int requestCde)","finish() method","neither a and b","both a and b")
                ),
                Quiz(
                    3,
                    "3. AVD stands for",
                    IS_RADIO_BUTTON,
                    "AVD stands for Android virtual device. ",
                    "c",
                    "",
                    mutableListOf("Active Virtual Display","Android Virtual Display","Android virtual device","Active virtual device")
                ),
                Quiz(
                    4,
                    "4. Which of the following virtual machine is used by the Android operating system?",
                    IS_RADIO_BUTTON,
                    "The Dalvik Virtual Machine (DVM) is an android virtual machine optimized for mobile devices. It optimizes the virtual machine for memory, battery life, and performance.",
                    "b",
                    "",
                    mutableListOf("JVM","Dalvik virtual machine","Simple virtual machine","None of the above")
                ),
                Quiz(
                    5,
                    "5. Android is based on which of the following language?",
                    IS_RADIO_BUTTON,
                    "Java language is mainly used to write the android code even though other languages can be used.",
                    "a",
                    "",
                    mutableListOf("Java","C++","Python","C")
                ),
                Quiz(
                    6,
                    "6. Identify the lowest layer of Android architecture.",
                    IS_RADIO_BUTTON,
                    "Linux kernel Is the lowest layer of Android architecture.",
                    "c",
                    "",
                    mutableListOf("Applictions","Application Frameworks","Linux Kernel","System library and Android Runtime")
                ),
                Quiz(
                    7,
                    "7. What does API stand for?",
                    IS_RADIO_BUTTON,
                    "API stands for application program interface. It is a set of routines, protocols, and tools for building software and applications.",
                    "a",
                    "",
                    mutableListOf("Application Programming Interface","Android Programming Interface","Android Page Interface", "Application Page Interface")
                ),
                Quiz(
                    8,
                    "8. Choose the built-in database of Android.",
                    IS_CHECK_BOX,
                    "SQLite Is the built-in database of Android.",
                    "b",
                    "",
                    mutableListOf("MySql","SQLite","MongoDb","Oracle")
                ),
                Quiz(
                    9,
                    "9. On which of the following, developers can test the application, during developing the android applications?",
                    IS_CHECK_BOX,
                    "We can use the Android emulator, physical android phone, or third-party emulator as a target device to execute and test our Android application.",
                    "abc",
                    "",
                    mutableListOf("Third-party emulators","Emulator included in Android SDK","Physical android phone")
                ),
                Quiz(
                    10,
                    "10. Does Kotlin support primitive Datatypes?",
                    IS_RADIO_BUTTON,
                    "No, Kotlin does not provide support for primitive Data types like in Java.",
                    "b",
                    "",
                    mutableListOf("Yes","No","Maybe yes or no")
                ),
                Quiz(
                    11,
                    "11. Which of the following is a dialog class in android?",
                    IS_CHECK_BOX,
                    "All of the above are Dialog classes",
                    "abc",
                    "",
                    mutableListOf("AlertDialog","DatePicker Dialog","ProgressDialog")
                ),
                Quiz(
                    12,
                    "12. Which of the following is not an activity lifecycle callback method?",
                    IS_RADIO_BUTTON,
                    "onBackPressed() method is not an activity lifecycle callback method",
                    "d",
                    "",
                    mutableListOf("onClick() method","onCreate() method","onStart() method","onBackPressed() method")
                ),
                Quiz(
                    13,
                    "13. All classes in Kotlin classes are by default....",
                    IS_RADIO_BUTTON,
                    "All classes are final in Kotlin classes are by default",
                    "d",
                    "",
                    mutableListOf("public","sealed","abstract","final")
                ),
                Quiz(
                    14,
                    "14. ____________ helps to iterate through a range.",
                    IS_RADIO_BUTTON,
                    "Ranges operator helps to iterate through a range. Its operator form is (..)  ",
                    "abc",
                    "",
                    mutableListOf("and operator","or operator","range operator","conditional operator")
                ),
                Quiz(
                    15,
                    "15. Which of the following is the parent class of Activity?",
                    IS_RADIO_BUTTON,
                    "The android Activity is the subclass of ContextThemeWrapper class. Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class. An activity is a single screen in android. It is like a window or frame of Java.",
                    "c",
                    "",
                    mutableListOf("context","object","contextThemeWrapper","None of the above")
                )
            )
        }
    }
}