#include <jni.h>
JNIEXPORT jstring JNICALL
Java_com_mirkamol_securekey_MainActivity_getPublicKey(JNIEnv *env, jobject instance) {
    return (*env)->  NewStringUTF(env, "long_public_key");
}

JNIEXPORT jstring JNICALL
Java_com_mirkamol_securekey_MainActivity_getPrivateKey(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "long_private_key");
}

JNIEXPORT jstring JNICALL
Java_com_mirkamol_securekey_App_getPublicKey(JNIEnv *env, jobject instance) {
    return (*env)->  NewStringUTF(env, "long_public_key");
}

JNIEXPORT jstring JNICALL
Java_com_mirkamol_securekey_App_getPrivateKey(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "long_private_key");
}