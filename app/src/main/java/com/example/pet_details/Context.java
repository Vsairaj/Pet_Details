package com.example.pet_details;

public class Context {

        private static Context context;

        public static void setContext(Context cntxt) {
            context = cntxt;
        }

        public static Context getContext() {
            return context;
        }
    }

