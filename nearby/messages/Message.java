package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cjzh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cjzh();
    private static final NearbyDevice[] g = {NearbyDevice.a};
    final int a;
    public final byte[] b;
    public final String c;
    public final String d;

    @Deprecated
    final NearbyDevice[] e;
    public final long f;

    public Message(int i, byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr, long j) {
        this.a = i;
        arwm.s(str2);
        this.c = str2;
        this.d = str == null ? "" : str;
        this.f = j;
        arwm.s(bArr);
        int length = bArr.length;
        arwm.d(length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), 102400);
        this.b = bArr;
        this.e = (nearbyDeviceArr == null || nearbyDeviceArr.length == 0) ? g : nearbyDeviceArr;
        arwm.d(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    @Deprecated
    public final NearbyDevice a() {
        return this.e[0];
    }

    @Deprecated
    public final boolean b() {
        return d("__audio_bytes");
    }

    public final boolean c() {
        return "__reserved_namespace".equals(this.d);
    }

    public final boolean d(String str) {
        return c() && str.equals(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.d, message.d) && TextUtils.equals(this.c, message.c) && Arrays.equals(this.b, message.b) && this.f == message.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.c, Integer.valueOf(Arrays.hashCode(this.b)), Long.valueOf(this.f)});
    }

    public final String toString() {
        byte[] bArr = this.b;
        int length = bArr == null ? 0 : bArr.length;
        String str = this.c;
        return "Message{namespace='" + this.d + "', type='" + str + "', content=[" + length + " bytes]}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.b;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.v(parcel, 2, this.c, false);
        arxc.v(parcel, 3, this.d, false);
        arxc.J(parcel, 4, this.e, i);
        arxc.q(parcel, 5, this.f);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }

    public Message(byte[] bArr, String str, NearbyDevice nearbyDevice) {
        this(bArr, "__reserved_namespace", str, new NearbyDevice[]{nearbyDevice}, 0L);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr, long j) {
        this(2, bArr, str, str2, nearbyDeviceArr, j);
    }
}
