package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aeek;
import defpackage.aehm;
import defpackage.atyq;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RemoteDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aehm();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final String f;

    @Deprecated
    public final List g;
    public final String h;
    public final AttestationVerifier i;

    public RemoteDevice(int i, String str, String str2, String str3, byte[] bArr, String str4, List list, String str5, AttestationVerifier attestationVerifier) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
        this.f = str4 == null ? "" : str4;
        this.g = list == null ? new ArrayList() : list;
        this.i = attestationVerifier;
        this.h = str5;
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 8);
    }

    public final String b() {
        return aeek.a(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                RemoteDevice remoteDevice = (RemoteDevice) obj;
                if (remoteDevice.a == this.a && remoteDevice.b.equals(this.b) && remoteDevice.c.equals(this.c) && remoteDevice.d.equals(this.d) && Arrays.equals(remoteDevice.e, this.e) && remoteDevice.f.equals(this.f) && atyq.b(this.i, remoteDevice.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b.hashCode()), Integer.valueOf(this.c.hashCode()), Integer.valueOf(this.d.hashCode()), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f.hashCode()), Integer.valueOf(this.h.hashCode())});
    }

    public final String toString() {
        return String.format("RemoteDevice{id=%s, name=%s, type=%s, acc=%s, pk=%s, btaddr=%s}", b(), this.c, this.h, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.v(parcel, 3, this.d, false);
        atzr.i(parcel, 4, this.e, false);
        atzr.v(parcel, 5, this.f, false);
        atzr.y(parcel, 6, this.g, false);
        atzr.v(parcel, 7, this.h, false);
        atzr.t(parcel, 8, this.i, i, false);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        atzr.c(parcel, a);
    }
}
