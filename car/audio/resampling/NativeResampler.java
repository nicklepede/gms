package com.google.android.gms.car.audio.resampling;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class NativeResampler {
    public static native void native16000MonoTo48000StereoFirst(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);

    public static native void native16000MonoTo48000StereoSecond(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);

    public static native void native48000MonoTo16000Mono(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, byte[] bArr4, int i4);

    public static native void native48000StereoTo16000MonoFirst(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);

    public static native void native48000StereoTo16000MonoSecond(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);

    public static native void native48000StereoTo48000Mono(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native void nativeMonoToStereo(byte[] bArr, int i, byte[] bArr2, int i2);
}
